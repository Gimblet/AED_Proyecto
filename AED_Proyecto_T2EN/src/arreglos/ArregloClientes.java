package arreglos;

import clases.Cliente;

import java.util.ArrayList;

public class ArregloClientes {
    private ArrayList<Cliente> ArrayCliente;

    public ArregloClientes() {
        ArrayCliente = new ArrayList<Cliente>();
        adicionar(new Cliente(1001, "Pedro", "Suyon", "94568434", "79238433"));
    }

    public void adicionar(Cliente x) {
        ArrayCliente.add(x);
    }

    public Cliente obtener(int cliente) {
        return ArrayCliente.get(cliente);
    }

    public void eliminar(Cliente x) {
        ArrayCliente.remove(x);
    }

    public int tamano() {
        return ArrayCliente.size();
    }

    public Cliente buscar(int codigo) {
        for (Cliente cli : ArrayCliente) {
            if (cli.getCodigoCliente() == codigo) {
                return cli;
            }
        }
        return null;
    }

    public int generarCodigo() {
        if (tamano() == 0) {
            return 10000;
        } else {
            return obtener(tamano() - 1).getCodigoCliente() + 1;
        }
    }


}
