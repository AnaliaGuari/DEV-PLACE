package model;

import java.sql.Date;
import java.time.LocalDate;

public class Factura {
	private static int idFactura;
	private int idfac;
	private LocalDate fecha;
	private Date fechaSQL;
	private Cliente cliente;
	private Vendedor vendedor;
	Producto producto;




	public Factura(Cliente cliente, Vendedor vendedor, int dia, int mes, int años, Producto producto) {
		super();
		idFactura++;
		this.idfac = idFactura;
		this.fecha = LocalDate.of(dia, mes, años); //DATE TO SQL
		fechaSQL = fechaSQL.valueOf(fecha);
		this.cliente = cliente;
		this.vendedor = vendedor;
	this.producto = producto;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public static int getIdFactura() {
		return idFactura;
	}

	public static void setIdFactura(int idFactura) {
		Factura.idFactura = idFactura;
	}

	public int getIdFac() {
		return idfac;
	}
	public void setIdFac(int id) {
		this.idfac = id;
	}
	public LocalDate getFecha() {
		return fecha;
	}
	public void setDate(LocalDate fecha) {
		this.fecha = fecha;
	}
	public Date getDateSQL() {
		return fechaSQL;
	}
	public void setDateSQL(Date dateSQL) {
		this.fechaSQL = dateSQL;
	}
	public Cliente getClient() {
		return getCliente();
	}

	public Cliente getCliente() {
		return cliente;
	}
	public void setClient(Cliente cliente) {
		this.cliente = cliente;
	}
	public Vendedor getVendor() {
		return getVendedor();
	}

	public Vendedor getVendedor() {
		return vendedor;
	}
	public void setVendor(Vendedor vendor) {
		this.vendedor = vendor;
	}



}
