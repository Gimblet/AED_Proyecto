package arreglos;

import clases.Producto;

import java.util.ArrayList;

public class ArregloProductos {
    private ArrayList<Producto> ArrayProducto;

    public ArregloProductos(){
        ArrayProducto = new ArrayList<Producto>();
        adicionar(new Producto(3001, "Hoja a4", 3.50));
    }

    public void adicionar(Producto x) {
        ArrayProducto.add(x);
    }

    public Producto obtener(int producto) {
        return ArrayProducto.get(producto);
    }

    public void eliminar(Producto x) {
        ArrayProducto.remove(x);
    }

    public int tamano() {
        return ArrayProducto.size();
    }

    public Producto buscar(int codigo) {
        for (Producto pro : ArrayProducto) {
            if (pro.getCodigoProducto() == codigo) {
                return pro;
            }
        }
        return null;
    }

    public int generarCodigo() {
        if (tamano() == 0) {
            return 10000;
        } else {
            return obtener(tamano() - 1).getCodigoProducto() + 1;
        }
    }
}
