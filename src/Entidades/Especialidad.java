
package Entidades;

public class Especialidad {
    private int id;
    private String tipoE;

    public Especialidad() {
    }

    public Especialidad(String tipoE) {
        this.tipoE = tipoE;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipoE() {
        return tipoE;
    }

    public void setTipoE(String tipoE) {
        this.tipoE = tipoE;
    }

    @Override
    public String toString() {
        return tipoE;
    }
    
    
}
