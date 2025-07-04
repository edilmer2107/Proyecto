package Models;

import Entidades.Paciente;
import java.util.ArrayList;
import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;

public class MC_Paciente extends AbstractListModel<Paciente> implements ComboBoxModel<Paciente> {
    private ArrayList<Paciente> listaPacientes = new ArrayList<>();
    private Paciente seleccionado;

    public void setListaPacientes(ArrayList<Paciente> lista) {
        this.listaPacientes = lista;
        if (!lista.isEmpty()) {
            this.seleccionado = lista.get(0);
        }
        fireContentsChanged(this, 0, getSize());
    }

    @Override
    public int getSize() {
        return listaPacientes.size();
    }

    @Override
    public Paciente getElementAt(int index) {
        return listaPacientes.get(index);
    }

    @Override
    public void setSelectedItem(Object anItem) {
        this.seleccionado = (Paciente) anItem;
    }

    @Override
    public Object getSelectedItem() {
        return this.seleccionado;
    }

    public Paciente getSeleccionado() {
        return this.seleccionado;
    }
}
