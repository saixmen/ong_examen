package Examen;
/**
 *
 * @author Pedro Diez
 */
public class Ong {
    private String nombre;
    private String ambito;
    private String actividad;
    
     
    public Ong () {
    }
    public Ong(String nombre, String ambito, String actividad){
    this.nombre=nombre;
    this.ambito=ambito;
    this.actividad=actividad;
    }
    public String getActividad () {
        return actividad;
    }
    public void setActividad (String val) {
        this.actividad = val;
    }
    public String getAmbito () {
        return ambito;
    }
    public void setAmbito (String val) {
        this.ambito = val;
    } 
    public String getNombre () {
        return nombre;
    } 
    public void setNombre (String val) {
        this.nombre = val;
    }
     public void visualizar()
    {
        String ong;
        ong="Nombre: "+nombre+" Ambito: "+ambito+" Actividad: "+actividad;
        System.out.println(ong);
    }

}