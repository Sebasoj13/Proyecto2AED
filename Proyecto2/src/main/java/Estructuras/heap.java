/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructuras;
import java.util.ArrayList;

/**
 *
 * @author Esteban F González
 */
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
