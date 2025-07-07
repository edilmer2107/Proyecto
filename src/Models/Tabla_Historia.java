
package Models;

import Entidades.Historia;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class Tabla_Historia extends AbstractTableModel{
    private ArrayList<Historia> listTabla = new ArrayList<>();

    public ArrayList<Historia> getListTabla() {
        return listTabla;
    }

    public void setListTabla(ArrayList<Historia> listTabla) {
        this.listTabla = listTabla;
        fireTableDataChanged();
    }
    
    

    @Override
    public int getRowCount() {
        int canfilas= 0;
        if(this.listTabla != null){
            canfilas = this.listTabla.size();
        }
        return canfilas;
    }

    @Override
    public int getColumnCount() {
        return 6;
    }
    
     @Override
    public String getColumnName(int colum){
        String nameCol = "";
        switch (colum) {
            case 0: nameCol = "Paciente";break;
            case 1: nameCol = "Medico";break;
            case 2: nameCol = "Area";break;
            case 3: nameCol = "Motivo";break;
            case 4: nameCol = "Observaciones";break;
            case 5: nameCol = "fecha";break;
            default:
                throw new AssertionError();
        }
        
        return nameCol;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Object celda= null;
        Historia objTH=null;
        if(this.listTabla != null){
            objTH = this.listTabla.get(rowIndex);
            switch (columnIndex) {
                case 0: celda = objTH.getPaciente().getNombres();break;
                case 1: celda = objTH.getMedico().getNombres();break;
                case 2: celda = objTH.getEspecialidad().getTipoE();break;
                case 3: celda = objTH.getMotivo_consulta();break;
                case 4: celda = objTH.getObservaciones();break;
                case 5: celda = objTH.getFecha();break;
                default:
                    throw new AssertionError();
            }
        }
        return celda;
    }
    public Historia GetTablaHistoria( int tabla){
        Historia objTH = null;
        if(this.listTabla !=null){
            objTH= this.listTabla.get(tabla);
        }
        return objTH;
    }
    
}
