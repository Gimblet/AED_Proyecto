package clases;

public class Producto {
	private int codigoProducto = 3001;
	private String descripcion;
	private double precio;

	//Constructor

	public Producto(int codigoProducto, String descripcion, double precio) {
		this.codigoProducto = codigoProducto;
		this.descripcion = descripcion;
		this.precio = precio;
	}

	//Getters y Setters

	public int getCodigoProducto() {
		return codigoProducto;
	}

	public void setCodigoProducto(int codigoProducto) {
		this.codigoProducto = codigoProducto;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
}
