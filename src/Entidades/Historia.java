
package Entidades;
import Entidades.*;
import java.time.LocalDate;

public class Historia {
    private int id;
    private Paciente paciente;
    private Medico medico;
    private Especialidad especialidad;
    private LocalDate fecha;
    private String motivo_consulta;
    private String observaciones;

    public Historia() {
    }

    public Historia(Paciente paciente, Medico medico, Especialidad especialidad, LocalDate fecha, String motivo_consulta, String observaciones) {
        this.paciente = paciente;
        this.medico = medico;
        this.especialidad = especialidad;
        this.fecha = fecha;
        this.motivo_consulta = motivo_consulta;
        this.observaciones = observaciones;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getMotivo_consulta() {
        return motivo_consulta;
    }

    public void setMotivo_consulta(String motivo_consulta) {
        this.motivo_consulta = motivo_consulta;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    @Override
    public String toString() {
        return "Historia{" + "paciente=" + paciente + ", medico=" + medico + ", especialidad=" + especialidad + ", fecha=" + fecha + ", motivo_consulta=" + motivo_consulta + ", observaciones=" + observaciones + '}';
    }

    
    public String verDatos() {
        return  "Paciente: " + paciente +  "\n" +
                "Medico: " + medico + "\n" +
                "Area: " + especialidad + "\n" +
                "Fecha: " + fecha +  "\n" +
                "Motivo consulta: " + motivo_consulta + "\n" +
                "Observaciones: " + observaciones ;
    }

    public void setMotivoConsulta(String motivoConsulta) {
    this.motivo_consulta = motivoConsulta;
}

public void setFechaRegistro(LocalDate fechaRegistro) {
    this.fecha = fechaRegistro;
}

}
