package mx.itson.schoology.entidades;




/**
 * Esta clase representa a la entidad Usuario.
 * @author JoseLuisChito
 * @author CCarballo
 * @author FranciscoQuijada
 * @author VivianMunguia
 */
public class Usuario {
    
    private int id;
    private String nombre;
    private String apellido;
    private String correo;
    private String contraseña;
    private String telefono;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    
    
}
