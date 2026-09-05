
package reporte;

import java.util.ArrayList;

public class ListaVenta {
	
ArrayList<Venta> lis =new ArrayList<Venta>();

public void Agregar(int cod_proc,String desc,int cantidad,double pre_uni,
		double pre_total,String cliente) {
	Venta v=new Venta(cod_proc,desc,cantidad,pre_uni,pre_total,cliente);
	lis.add(v);
}
public int Tamaño() {
	return lis.size();
}
public Venta obtenerI(int x) {
	return lis.get(x);
}
public double calcularTotalVenta(int cantidad, double precioStock) {
    return cantidad * precioStock;
}
}
