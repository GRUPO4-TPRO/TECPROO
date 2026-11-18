
package ejercicio1;

import java.util.ArrayList;

public class ListaVenta {
	
ArrayList<Clase_Venta> lis =new ArrayList<Clase_Venta>();

public void Agregar(int id_vent,int cod_proc,String desc,int cantidad,double pre_uni,
		double pre_total,String cliente) {
	Clase_Venta v=new Clase_Venta(id_vent,cod_proc,desc,cantidad,pre_uni,pre_total,cliente);
	lis.add(v);
}
public int Tamaño() {
	return lis.size();
}
public Clase_Venta obtenerI(int x) {
	return lis.get(x);
}
public double calcularTotalVenta(int cantidad, double precioStock) {
    return cantidad * precioStock;
}
public Clase_Venta buscarVent(int idVent) {
	for(int i=0;i<Tamaño();i++) {
		Clase_Venta v=obtenerI(i);
		if(v.getId_venta()==idVent) {
			return v;
		}
	}
	return null;
	
}
}
