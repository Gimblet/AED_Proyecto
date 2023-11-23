package arreglos;

import clases.Vendedor;

import java.util.ArrayList;

public class ArregloVendedores {
    private ArrayList<Vendedor> ArrayVendedor;

    public ArregloVendedores(){
        ArrayVendedor = new ArrayList<Vendedor>();
        adicionar(new Vendedor(2001, 1, "Joel", "Velazques", "93243242","73482344"));
    }

    public void adicionar(Vendedor x) {
        ArrayVendedor.add(x);
    }

    public Vendedor obtener(int vendedor) {
        return ArrayVendedor.get(vendedor);
    }

    public void eliminar(Vendedor x) {
        ArrayVendedor.remove(x);
    }

    public int tamano() {
        return ArrayVendedor.size();
    }

    public Vendedor buscar(int codigo) {
        for (Vendedor ven : ArrayVendedor) {
            if (ven.getCodigoVendedor() == codigo) {
                return ven;
            }
        }
        return null;
    }

    public int generarCodigo() {
        if (tamano() == 0) {
            return 10000;
        } else {
            return obtener(tamano() - 1).getCodigoVendedor() + 1;
        }
    }
}
