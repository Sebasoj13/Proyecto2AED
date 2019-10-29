package Estructuras;


public class Usuario {
    //Atributos
    private String Nombre;
    private String Nacimiento;
    private int Pasaporte;
    private String Nacionalidad;
    private String Origen;
    private String Destino;
    
    //Constructores
    public Usuario(){ 
    }
    public Usuario(String Nombre,String Nacimiento,int Pasaporte,String Nacionalidad,String Origen,String Destino){
        this.Nombre = Nombre;
        this.Nacimiento = Nacimiento;
        this.Pasaporte = Pasaporte;
        this.Nacionalidad = Nacionalidad;
        this.Origen = Origen;
        this.Destino = Destino;
               
    }
    //Métodos
    public String getNombre(){
        return this.Nombre;
    }
    public String getNacimiento(){
        return this.Nacimiento;
    }
    public int getPasaporte(){
        return this.Pasaporte;
    }
    public String getNacionalidad(){
        return this.Nacionalidad;
    }
    public String getOrigen(){
        return this.Origen;
    }
    public String getDestino(){
        return this.Destino;
    }
}