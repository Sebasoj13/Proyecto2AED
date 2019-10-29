package Estructuras;


public class Cola {
   private class Nodo {
       private Usuario Contenido;
       private Nodo Siguiente;
       private int Prioridad;//Se Utilizará prioridad 1 Para aquellos que sean especiales y 0 para los de clase económica
       /*
       0-Económica
       1-Oro
       2-Platino
       3-Especial
       */
       //Constructores
       public Nodo(){
       }
       public Nodo(Usuario Contenido,int Prioridad){
           this.Contenido = Contenido;
           this.Prioridad = Prioridad;
       }
       public Nodo(Usuario Contenido,Nodo Siguiente){
           this.Contenido = Contenido;
           this.Siguiente = Siguiente;
           this.Prioridad = 0;
       }
       public Nodo(Usuario Contenido,Nodo Siguiente, int Prioridad){
           this.Contenido = Contenido;
           this.Siguiente = Siguiente;
           this.Prioridad = Prioridad;
       }
       //Métodos
       //Getters
       public Usuario getContenido(){
           return this.Contenido;
       }
       public Nodo getSiguiente(){
           return this.Siguiente;
       }
       public int getPrioridad(){
           return this.Prioridad;
       }
       //Setters
       public void setContenido(Usuario Contenido){
           this.Contenido = Contenido;
       }
       public void setSiguiente(Nodo Siguiente){
           this.Siguiente = Siguiente;
       }
       public void setPrioridad(int Prioridad){
           this.Prioridad = Prioridad;
       }
   }
   
   private Nodo Front;
   private Nodo Rear;
   private int size;
   
   //Constructor
   public Cola(){
       this.Front = this.Rear = new Nodo();
       this.size = 0;
   }
   //Métodos
   public void encolar(Usuario elemento ){
		this.Rear.setSiguiente(new Nodo(elemento, null));
		this.Rear = Rear.getSiguiente();
		this.size++;
   }
   public Usuario decolar(){
		if(this.size == 0){
			System.out.println("La cola está Vacía");
			return null;
		}
		Usuario temp = this.Front.getSiguiente().getContenido();
		Nodo nTemp = this.Front.getSiguiente();
		this.Front.setSiguiente(nTemp.getSiguiente());
		if (this.Rear == nTemp){
			this.Rear = this.Front;
		}
		this.size--;
		return temp;
   }
   public int size(){
       return this.size;
   }
   public void clear(){
		this.Front = this.Rear = new Nodo();
		this.size = 0;
	}
   public String toString(){
		String result = "**Cola**\n";
		Nodo tFront = this.Front;
		int tSize = this.size;
		while(tSize != 0){
			result+= tFront.getSiguiente().getContenido() + " ";
			tFront = tFront.getSiguiente();
			tSize--;
		}
		return result;
   }
   
}