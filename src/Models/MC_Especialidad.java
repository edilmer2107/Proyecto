
package Models;

import Entidades.Especialidad;
import java.util.ArrayList;
import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;

public class MC_Especialidad extends AbstractListModel implements ComboBoxModel{
    private ArrayList<Especialidad> listEspe = new ArrayList<>();
    private Especialidad seleccionado = null;

    public ArrayList<Especialidad> getListEspe() {
        return listEspe;
    }

    public void setListEspe(ArrayList<Especialidad> listEspe) {
        this.listEspe = listEspe;
    }

    public Especialidad getSeleccionado() {
        return seleccionado;
    }

    public void setSeleccionado(Especialidad seleccionado) {
        this.seleccionado = seleccionado;
    }
    
    
     
    @Override
    public int getSize() {
        int cantElem = 0;
        
        if(this.listEspe != null) {        
            cantElem = this.listEspe.size();
        }
        
        return cantElem;
    }

    @Override
    public Object getElementAt(int index) {
        Object elem = "";
        if(this.listEspe != null) { 
            elem = this.listEspe.get(index).toString();
        }
        return elem;
    }

    @Override
    public void setSelectedItem(Object anItem) {
        this.seleccionado = null;
        if(this.listEspe != null && anItem != null){
            for(Especialidad espe : this.listEspe){
                if(espe.toString().equals(anItem)){
                    this.seleccionado = espe;
                    return;
                }
            }
        }
    }

    @Override
    public Object getSelectedItem() {
        Object elem = "";
        if(this.seleccionado != null) {
            elem = this.seleccionado;
        }
        return elem;
    }
}
