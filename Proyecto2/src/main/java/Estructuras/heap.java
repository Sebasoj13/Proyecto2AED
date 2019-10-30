package Estructuras;
import java.util.ArrayList;

public class heap {
    ArrayList<Usuario> Prior;
    
    public heap(){
        Prior = new ArrayList();
    }
    public int size(){
        return Prior.size();  
    }
    public Usuario raiz(){
       return Prior.get(0);          
    }
    public static void main(String[]args){
        heap Hola = new heap();
        System.out.println(Hola.size());
    }
}

