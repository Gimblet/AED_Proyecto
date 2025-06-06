package clases;

public class Vendedor {
	private int codigoVendedor = 2001;
	private int categoria;
	private String nombres;
	private String apellidos;
	private String telefono;
	private String dni;

	//Constructor

	public Vendedor(int codigoVendedor, int categoria, String nombres, String apellidos, String telefono, String dni) {
		this.codigoVendedor = codigoVendedor;
		this.categoria = categoria;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.telefono = telefono;
		this.dni = dni;
	}

	//Getters y Setters

	public int getCodigoVendedor() {
		return codigoVendedor;
	}

	public void setCodigoVendedor(int codigoVendedor) {
		this.codigoVendedor = codigoVendedor;
	}

	public int getCategoria() {
		return categoria;
	}

	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}
}
