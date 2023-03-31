package postnet;

/**
 * Esta es la clase Persona
 * Define atributos dni, nombre, apellido, telefono y mail
 * @author 1dam 
 */

class Persona {
    private String dni;
    private String nombre;
    private String apellido;
    private String telefono;
    private String mail;
    
 /**
  * constructor persona...
  * @param dni
  * @param nombre
  * @param apellido
  * @param telefono
  * @param mail 
  */

    public Persona(String dni, String nombre, String apellido, String telefono, String mail) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.mail = mail;
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getMail() {
        return mail;
    }

    
    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String nombreCompleto(){
    return nombre+" "+apellido;
    }


}
