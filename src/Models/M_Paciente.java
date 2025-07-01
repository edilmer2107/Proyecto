
package Models;

import Entidades.Paciente;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class M_Paciente extends AbstractTableModel{
    private ArrayList<Paciente> listPaciente = new ArrayList<>();

    public ArrayList<Paciente> getListPaciente() {
        return listPaciente;
    }

    public void setListPaciente(ArrayList<Paciente> listPaciente) {
        this.listPaciente = listPaciente;
    }
    

    @Override
    public int getRowCount() {
        int canFilas=0;
        if(this.listPaciente != null){
            canFilas = this.listPaciente.size();
        }
        return canFilas;
    }

    @Override
    public int getColumnCount() {
        return 3;
    }
    @Override
    public String getColumnName(int colum){
        String nameCol = "";
        switch (colum) {
            case 0: nameCol = "Nombres";break;
            case 1: nameCol = "Apellidos";break;
            case 2: nameCol = "DNI";break;
            default:
                throw new AssertionError();
        }
        
        return nameCol;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
         Object celda= null;
        Paciente objP=null;
        if(this.listPaciente != null){
            objP = this.listPaciente.get(rowIndex);
            switch (columnIndex) {
                case 0: celda = objP.getNombres();break;
                case 1: celda = objP.getApellidos();break;
                case 2: celda = objP.getDni();break;
                default:
                    throw new AssertionError();
            }
        }
        return celda;
    }
    
    public Paciente getPaciente(int indiceSeleccionado){
        Paciente objp = null;
        if(this.listPaciente != null){
            objp = this.listPaciente.get(indiceSeleccionado);
        }
        return objp;
    }
    
}
