package arreglos;

import clases.Factura;

import java.util.ArrayList;

public class ArregloFacturas {
    private ArrayList<Factura> ArrayFactura;

    public ArregloFacturas(){
        ArrayFactura = new ArrayList<Factura>();
    }

    public void adicionar(Factura x) {
        ArrayFactura.add(x);
    }

    public Factura obtener(int Factura) {
        return ArrayFactura.get(Factura);
    }

    public void eliminar(Factura x) {
        ArrayFactura.remove(x);
    }

    public int tamano() {
        return ArrayFactura.size();
    }

    public Factura buscar(int codigo) {
        for (Factura fac : ArrayFactura) {
            if (fac.getCodigoFactura() == codigo) {
                return fac;
            }
        }
        return null;
    }

    public int generarCodigo() {
        if (tamano() == 0) {
            return 4001;
        } else {
            return obtener(tamano() - 1).getCodigoFactura() + 1;
        }
    }


}

