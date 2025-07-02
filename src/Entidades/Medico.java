
package Entidades;

public class Medico {
    private Especialidad especialidad;
    private int id;
    private String nombres;
    private String apellidos;
    private String dni;
    private String telefono;
    private String correo;
    private String usuario;
    private String contra;

    public Medico() {
    }

    public Medico(Especialidad especialidad, String nombres, String apellidos,String dni, String telefono, String correo) {
        this.especialidad = especialidad;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.dni=dni;
        this.telefono = telefono;
        this.correo = correo;
    }

    

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    @Override
    public String toString() {
        return  nombres + apellidos;
    }
    public String verDatos() {
        return 
                "Nombres: " + nombres +"\n"+ 
                "Apellidos: " + apellidos +"\n"+ 
                "DNI: "+ dni  +"\n"+ 
                "Telefono: " + telefono +"\n"+ 
                "Correo: " + correo +"\n"+
                "Especialidad: "+ especialidad  +"\n";
    }
    
    
}
