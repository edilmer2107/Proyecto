
package Models;

import Entidades.Medico;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class M_Medico extends AbstractTableModel{
    private ArrayList<Medico> listMedico = new ArrayList<>();

    public ArrayList<Medico> getListMedico() {
        return listMedico;
    }

    public void setListMedico(ArrayList<Medico> listMedico) {
        this.listMedico = listMedico;
        fireTableDataChanged();
    }
    
    
    @Override
    public int getRowCount() {
        int canFilas=0;
        if(this.listMedico != null){
            canFilas = this.listMedico.size();
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
            case 0: nameCol = "Nombre";break;
            case 1: nameCol = "Apellidos";break;
            case 2: nameCol = "Especialidad";break;
            default:
                throw new AssertionError();
        }
        
        return nameCol;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Object celda= null;
        Medico objM=null;
        if(this.listMedico != null){
            objM = this.listMedico.get(rowIndex);
            switch (columnIndex) {
                case 0: celda = objM.getNombres();break;
                case 1: celda = objM.getApellidos();break;
                case 2: celda = objM.getEspecialidad();break;
                default:
                    throw new AssertionError();
            }
        }
        return celda;
    }
    
     public Medico getMedico(int indiceSeleccionado){
        Medico objM = null;
        if(this.listMedico != null){
            objM = this.listMedico.get(indiceSeleccionado);
        }
        return objM;
    }
}
