package clase;
import java.util.ArrayList;

public class Lista_Stock {
ArrayList<Clase_Producto>esta=new ArrayList<Clase_Producto>();
public Lista_Stock () {
	esta.add(new Clase_Producto(1, "Destornillador plano", 15.50, 50, 10));
    esta.add(new Clase_Producto(2, "Taladro percutor", 250.00, 15, 3));
    esta.add(new Clase_Producto(3, "Martillo de acero", 35.00, 30, 5));
    esta.add(new Clase_Producto(4, "Llave inglesa", 28.50, 20, 4));
    esta.add(new Clase_Producto(5, "Amoladora angular", 180.00, 10, 2));
	
}
public void Arreglo(int cod,String nom,double prec,int stock,int stockMin) {
	Clase_Producto p =new Clase_Producto(cod,nom,prec,stock,stockMin);
	esta.add(p);
	
}
public int Tamaño() {
	return esta.size();
}
public Clase_Producto obteneri(int x) {
	return esta.get(x);
}
public double promedio() {
	double suma=0;
	for(int i=0;i<Tamaño();i++) {
		suma=suma + obteneri(i).get_precio();
	}
	return suma/Tamaño();
}
public Clase_Producto Buscar(int buscador) {
	for(int i=0;i<Tamaño();i++) {
		Clase_Producto p= obteneri(i);
		if(buscador==p.get_cod()) {
			return p;
		}
	}
	return null;
}
public void eliminar(Clase_Producto x) {
	esta.remove(x);
}

}
