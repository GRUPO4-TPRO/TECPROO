package ejercicio1;

public class Producto {
	private int codigo;
	private String nombre;
	private double precio;
	private int stock;
	
	public Producto(int cod,String nom,double pre,int stoc) {
		this.codigo=cod;
		this.nombre=nom;
		this.precio=pre;
		this.stock=stoc;
		
		
	}
	public int get_cod() {
		return codigo;
	}
	public String get_nom() {
		return nombre;
	}
	public double get_precio() {
		return precio;
	}
	public int get_stock() {
		return stock;
	}
	
}
