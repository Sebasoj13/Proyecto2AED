package Estructuras;


public class Usuario {
    //Atributos
    private String Nombre;
    private String Nacimiento;
    private String Pasaporte;
    private String Nacionalidad;
    private String Origen;
    private String Destino;
    
    //Constructores
    public Usuario(){ 
        this.Nombre = null;
        this.Nacimiento = null;
        this.Pasaporte = null;
        this.Nacionalidad = null;
        this.Origen = null;
        this.Destino = null;
    }
    
    public Usuario(String Nombre,String Nacimiento,String Pasaporte,String Nacionalidad,String Origen,String Destino){
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
    public String getPasaporte(){
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