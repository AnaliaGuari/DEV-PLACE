package model;

public class Producto {
	private static int idProducto;
	private int codigo;
	private double precio;
	private int cantidad;
	private int stockMin;
	

	public Producto(double precio, int cantidad, int stockMin) {

		idProducto++;
		codigo = idProducto;
		this.codigo = codigo;
		this.precio = precio;
		this.cantidad = cantidad;
		this.stockMin = stockMin;
	}
	
	public static int getIdProducto() {
		return idProducto;
	}

	public static void setIdProducto(int idProducto) {
		Producto.idProducto = idProducto;
	}

	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int code) {
		this.codigo = code;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double price) {
		this.precio = price;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int ammount) {
		this.cantidad = ammount;
	}
	public int getStockMin() {
		return stockMin;
	}
	public void setStockMin(int minStock) {
		this.stockMin = minStock;
	}

}
