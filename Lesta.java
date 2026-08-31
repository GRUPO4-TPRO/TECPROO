package ejercicio1;
import java.util.ArrayList;

public class Lesta {
ArrayList<Producto>esta=new ArrayList<Producto>();
public void Arreglo(int cod,String nom,double prec,int stock,int stockMin) {
	Producto p =new Producto(cod,nom,prec,stock,stockMin);
	esta.add(p);
	
}
public int Tamaño() {
	return esta.size();
}
public Producto obteneri(int x) {
	return esta.get(x);
}
public double promedio() {
	double suma=0;
	for(int i=0;i<Tamaño();i++) {
		suma=suma + obteneri(i).get_precio();
	}
	return suma/Tamaño();
}
public Producto Buscar(int buscador) {
	for(int i=0;i<Tamaño();i++) {
		Producto p= obteneri(i);
		if(buscador==p.get_cod()) {
			return p;
		}
	}
	return null;
}
public void eliminar(Producto x) {
	esta.remove(x);
}

}
