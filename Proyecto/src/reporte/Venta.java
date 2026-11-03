package reporte;

public class Venta {
	private int Cod_producto;
	private String Descripcion;
	private int cantidad;
	private double pre_unitario;
	private double pre_total;
	private String cliente;
	public Venta(int cod_producto, String descripcion, int cantidad, double pre_unitario, double pre_total,String cliente) {
		Cod_producto = cod_producto;
		Descripcion = descripcion;
		this.cantidad = cantidad;
		this.pre_unitario = pre_unitario;
		this.pre_total = pre_total;
		this.cliente=cliente;
	}
	public int getCod_producto() {
		return Cod_producto;
	}
	public void setCod_producto(int cod_producto) {
		Cod_producto = cod_producto;
	}
	public String getDescripcion() {
		return Descripcion;
	}
	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	public double getPre_unitario() {
		return pre_unitario;
	}
	public void setPre_unitario(double pre_unitario) {
		this.pre_unitario = pre_unitario;
	}
	
	public double getPre_total() {
		return pre_total;
	}
	public void setPre_total(double pre_total) {
		this.pre_total = pre_total;
	}
	
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	
	
	
	

}
