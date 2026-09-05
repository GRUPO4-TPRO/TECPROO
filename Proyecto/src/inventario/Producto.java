package inventario;

public class Producto {
	private int codigo;
	private String nombre;
	private double precio;
	private int stock;
	private int stockMin;
	
	public Producto(int cod,String nom,double pre,int stoc,int stockMin) {
		this.codigo=cod;
		this.nombre=nom;
		this.precio=pre;
		this.stock=stoc;
		this.stockMin=stockMin;
		
		
	}
	public int get_cod() {
		return codigo;
	}
	public void set_cod(int x) {
		this.codigo=x;
	}
	
	public String get_nom() {
		return nombre;
	}
	public void set_nom(String x) {
		this.nombre=x;
	}
	
	public double get_precio() {
		return precio;
	}
	public void set_precio(double x) {
		this.precio=x;
	}
	
	public int get_stock() {
		return stock;
	}
	public void set_stock(int x) {
		this.stock=x;
	}
	
	public int get_stockMin() {
		return stockMin;
	}
	public void set_stockMin(int x) {
		this.stockMin=x;
	}
}
