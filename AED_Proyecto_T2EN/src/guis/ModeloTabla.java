package guis;

import javax.swing.table.DefaultTableModel;

public class ModeloTabla extends DefaultTableModel {

	//Clase de Libreria

	private static final long serialVersionUID = 1L;

	@Override
	public boolean isCellEditable(int arg0, int arg1) {
		return false;
	}

}
