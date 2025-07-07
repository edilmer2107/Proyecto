
package Models;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import Entidades.*;

public class M_Historia extends AbstractTableModel{
    private ArrayList<Historia> listHistoria = new  ArrayList<>();

    public ArrayList<Historia> getListHistoria() {
        return listHistoria;
    }

    public void setListHistoria(ArrayList<Historia> listHistoria) {
        this.listHistoria = listHistoria;
        fireTableDataChanged();
    }
    
    @Override
    public int getRowCount() {
        int canFilas=0;
        if(this.listHistoria != null){
            canFilas = this.listHistoria.size();
        }
        return canFilas;
    }

    @Override
    public int getColumnCount() {
        return 4;
    }
     @Override
    public String getColumnName(int colum){
        String nameCol = "";
        switch (colum) {
            case 0: nameCol = "Paciente";break;
            case 1: nameCol = "Medico";break;
            case 2: nameCol = "Area";break;
            case 3: nameCol = "Motivo";break;
            default:
                throw new AssertionError();
        }
        
        return nameCol;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Object celda= null;
        Historia objH=null;
        if(this.listHistoria != null){
            objH = this.listHistoria.get(rowIndex);
            switch (columnIndex) {
                case 0: celda = objH.getPaciente().getNombres();break;
                case 1: celda = objH.getMedico().getNombres();break;
                case 2: celda = objH.getEspecialidad().getTipoE();break;
                case 3: celda = objH.getMotivo_consulta();break;
                default:
                    throw new AssertionError();
            }
        }
        return celda;
    }
    
     public Historia getHistoria(int indiceSeleccionado){
        Historia objH = null;
        if(this.listHistoria != null){
            objH = this.listHistoria.get(indiceSeleccionado);
        }
        return objH;
    }
     
     
}
