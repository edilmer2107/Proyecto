
package Entidades;

import java.time.LocalDate;

public class Paciente {
    private int id;
    private String nombres;
    private String apellidos;
    private String dni;
    private String sexo;  
    private String telefono;
    private String correo;
    private String direccion;
    private LocalDate fecha_nacimento;
    private String lugar_nacimiento;
    private String estado_civil;
    private String Datos_del_Apoderado;
    private LocalDate fecha_registro;

    // Constructor vacío
    public Paciente() {
    }

    // Constructor con parámetros básicos
    public Paciente(String nombres, String apellidos, String dni, String telefono, 
                   String correo, String direccion, String lugar_nacimiento, 
                   String estado_civil, String Datos_del_Apoderado, String sexo, 
                   LocalDate fecha_nacimento, LocalDate fecha_registro) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.dni = dni;
        this.telefono = telefono;
        this.correo = correo;
        this.direccion = direccion;
        this.lugar_nacimiento = lugar_nacimiento;
        this.estado_civil = estado_civil;
        this.Datos_del_Apoderado = Datos_del_Apoderado;
        this.sexo = sexo;
        this.fecha_nacimento = fecha_nacimento;
        this.fecha_registro = fecha_registro;
    }

    // Getters y Setters
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

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public LocalDate getFecha_nacimento() {
        return fecha_nacimento;
    }

    public void setFecha_nacimento(LocalDate fecha_nacimento) {
        this.fecha_nacimento = fecha_nacimento;
    }

    public String getLugar_nacimiento() {
        return lugar_nacimiento;
    }

    public void setLugar_nacimiento(String lugar_nacimiento) {
        this.lugar_nacimiento = lugar_nacimiento;
    }

    public String getEstado_civil() {
        return estado_civil;
    }

    public void setEstado_civil(String estado_civil) {
        this.estado_civil = estado_civil;
    }

    public String getDatos_del_Apoderado() {
        return Datos_del_Apoderado;
    }

    public void setDatos_del_Apoderado(String Datos_del_Apoderado) {
        this.Datos_del_Apoderado = Datos_del_Apoderado;
    }

    public LocalDate getFecha_registro() {
        return fecha_registro;
    }

    public void setFecha_registro(LocalDate fecha_registro) {
        this.fecha_registro = fecha_registro;
    }

    @Override
public String toString() {
    return nombres + " " + apellidos; 
}


    // Método para mostrar datos (opcional)
    public String verDatos() {
        return 
               "Nombres: " + nombres + "\n" +
               "Apellidos: " + apellidos + "\n" +
               "DNI: " + dni + "\n" +
               "Sexo: " + sexo + "\n" +
               "Teléfono: " + telefono + "\n" +
               "Correo: " + correo + "\n" +
               "Dirección: " + direccion+ "\n" +
               "Fecha de nacimiento: " + fecha_nacimento+ "\n" +
               "Lugar de nacimiento: " + lugar_nacimiento+ "\n" +
               "Estado civil: " + estado_civil+ "\n" +
               "Apoderado(a): " + Datos_del_Apoderado+ "\n" +
               "Fecha de registro: "+fecha_registro;
    }
}