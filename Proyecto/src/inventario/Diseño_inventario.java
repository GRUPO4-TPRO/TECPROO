package inventario;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Diseño_inventario extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtCod;
	private JLabel lblNewLabel;
	private JTextField txtNom;
	private JTextField txtPre;
	private JTextField txtStock;
	private JLabel lblNombre;
	private JLabel lblPrecio;
	private JLabel lblStock;
	private JTextArea txtS;
	private JButton btnlista;
	private JButton btnAdicion;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Diseño_inventario frame = new Diseño_inventario();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Diseño_inventario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 588, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		{
			txtCod = new JTextField();
			txtCod.setBounds(74, 10, 96, 18);
			contentPane.add(txtCod);
			txtCod.setColumns(10);
		}
		{
			lblNewLabel = new JLabel("Código");
			lblNewLabel.setBounds(25, 13, 44, 12);
			contentPane.add(lblNewLabel);
		}
		{
			txtNom = new JTextField();
			txtNom.setColumns(10);
			txtNom.setBounds(74, 49, 96, 18);
			contentPane.add(txtNom);
		}
		{
			txtPre = new JTextField();
			txtPre.setColumns(10);
			txtPre.setBounds(214, 10, 96, 18);
			contentPane.add(txtPre);
		}
		{
			txtStock = new JTextField();
			txtStock.setColumns(10);
			txtStock.setBounds(214, 49, 96, 18);
			contentPane.add(txtStock);
		}
		{
			lblNombre = new JLabel("Nombre");
			lblNombre.setBounds(25, 52, 54, 12);
			contentPane.add(lblNombre);
		}
		{
			lblPrecio = new JLabel("Precio");
			lblPrecio.setBounds(171, 13, 44, 12);
			contentPane.add(lblPrecio);
		}
		{
			lblStock = new JLabel("Stock");
			lblStock.setBounds(171, 52, 44, 12);
			contentPane.add(lblStock);
		}
		{
			txtS = new JTextArea();
			txtS.setBounds(10, 118, 452, 135);
			contentPane.add(txtS);
		}
		{
			btnlista = new JButton("Listar");
			btnlista.addActionListener(this);
			btnlista.setBounds(10, 88, 84, 20);
			contentPane.add(btnlista);
		}
		{
			btnAdicion = new JButton("Adicionar");
			btnAdicion.addActionListener(this);
			btnAdicion.setBounds(104, 88, 84, 20);
			contentPane.add(btnAdicion);
		}
		
		{
			btnBuscar = new JButton("<html><center>Buscar<br>por Cod</center></html>");
			btnBuscar.addActionListener(this);
			btnBuscar.setBounds(198, 77, 80, 31);
			contentPane.add(btnBuscar);
		}
		{
			btnModificar = new JButton("<html><center>Modificar<br>por Cod</center></html>");
			btnModificar.addActionListener(this);
			btnModificar.setBounds(288, 77, 84, 31);
			contentPane.add(btnModificar);
		}
		{
			btnEliminar = new JButton("<html><center>Eliminar\r\n<br>por Cod</center></html>");
			btnEliminar.addActionListener(this);
			btnEliminar.setBounds(378, 77, 84, 31);
			contentPane.add(btnEliminar);
		}
		{
			lblStockMinimo = new JLabel("Stock Minimo");
			lblStockMinimo.setBounds(320, 13, 79, 12);
			contentPane.add(lblStockMinimo);
		}
		{
			txtStockMin = new JTextField();
			txtStockMin.setColumns(10);
			txtStockMin.setBounds(409, 10, 96, 18);
			contentPane.add(txtStockMin);
		}
		{
			btninformedeStock = new JButton("<html><center>Informe<br>de stock</center></html>");
			btninformedeStock.addActionListener(this);
			btninformedeStock.setBounds(472, 75, 96, 35);
			contentPane.add(btninformedeStock);
		}
		txtS.setText("CODIGO"+"\t"+"NOMBRE"+"\t"+"PRECIO"+"\t"+"STOCK"+"\t"+"STOCK_MINIMO\n");
		for(int i=0;i<le.Tamaño();i++) {
			Producto p=le.obteneri(i);
			txtS.append(p.get_cod()+"\t"+p.get_nom()+"\t"+p.get_precio()+"\t"+p.get_stock()+"\t"+p.get_stockMin()+"\n");
		}
	}
	ListaProducto le= new ListaProducto();
	private JButton btnBuscar;
	private JButton btnModificar;
	private JButton btnEliminar;
	private JLabel lblStockMinimo;
	private JTextField txtStockMin;
	private JButton btninformedeStock;
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btninformedeStock) {
			do_btninformedeStock_actionPerformed(e);
		}
		if (e.getSource() == btnEliminar) {
			do_btnEliminar_actionPerformed(e);
		}
		if (e.getSource() == btnModificar) {
			do_btnModificar_actionPerformed(e);
		}
		if (e.getSource() == btnBuscar) {
			do_btnBuscar_actionPerformed(e);
		}
		if (e.getSource() == btnAdicion) {
			do_btnAdicion_actionPerformed(e);
		}
		if (e.getSource() == btnlista) {
			do_btnlista_actionPerformed(e);
		}
	}
	protected void do_btnlista_actionPerformed(ActionEvent e) {
		txtS.setText(" ");
		txtS.setText("CODIGO"+"\t"+"NOMBRE"+"\t"+"PRECIO"+"\t"+"STOCK"+"\t"+"STOCK_MINIMO\n");
		 for(int i=0;i<le.Tamaño();i++) {
			 Producto p= le.obteneri(i);
			 txtS.append(p.get_cod()+"\t"+p.get_nom()+"\t"+p.get_precio()+"\t"+p.get_stock()+"\t"+p.get_stockMin()+"\n");
		 }
	}
	protected void do_btnAdicion_actionPerformed(ActionEvent e) {
		if(txtCod.getText().trim().isEmpty()|| txtNom.getText().trim().isEmpty()||txtPre.getText().trim().isEmpty()
				||txtStock.getText().trim().isEmpty()||txtStockMin.getText().trim().isEmpty()){
			JOptionPane.showMessageDialog(this,"Debes ingresa los datos correspondientes","ADVERTENCIA",JOptionPane.WARNING_MESSAGE);
		}
		else {
			Producto p=le.Buscar(Integer.parseInt(txtCod.getText()));
			if(p !=null){
				JOptionPane.showMessageDialog(this,"Ya existe el codgio");	
			}
			else {
				le.Arreglo(Integer.parseInt(txtCod.getText()),
						txtNom.getText(),Double.parseDouble(txtPre.getText()),
						Integer.parseInt(txtStock.getText()),Integer.parseInt(txtStockMin.getText()));
				txtCod.setText("");
				txtNom.setText("");
				txtPre.setText("");
				txtStock.setText("");
				txtStockMin.setText("");
			}
			
		}
	}
	protected void do_btnBuscar_actionPerformed(ActionEvent e) {
		
		if(txtCod.getText().trim().isEmpty()==true) {
			JOptionPane.showMessageDialog(this,"se debe ingresar un codigo para buscar.","ADVERTENCIA",JOptionPane.WARNING_MESSAGE);
		}
		else {
			Producto p= le.Buscar(Integer.parseInt(txtCod.getText()));
			if(p != null) {
				JOptionPane.showMessageDialog(this,"Producto encontrado \n"
						+"CODIGO:"+p.get_cod()+"\n"+"NOMBRE:"+p.get_nom()+"\n"+"PRECIO:"+p.get_precio()+"\n"+"STOCK:"+p.get_stock());
			}
			else {
				JOptionPane.showMessageDialog(this,"No existe este codigo registrado");
			}
		}
		
	}
	protected void do_btnModificar_actionPerformed(ActionEvent e) {
		if(txtCod.getText().trim().isEmpty()) {
			JOptionPane.showMessageDialog(this,"Necesitas el Codigo para Modificar","ADVERTENCIA",JOptionPane.WARNING_MESSAGE);
		}
		else if(txtNom.getText().trim().isEmpty()||txtPre.getText().trim().isEmpty()||txtStock.getText().trim().isEmpty()||
				txtStockMin.getText().trim().isEmpty()) {
			JOptionPane.showMessageDialog(this,"Debes ingresar los demas datos","ADVERTENCIA",JOptionPane.WARNING_MESSAGE);	
		}
		else {
			Producto p=le.Buscar(Integer.parseInt(txtCod.getText()));
			if(p.get_cod()==Integer.parseInt(txtCod.getText())) {
				p.set_nom(txtNom.getText());
				p.set_precio(Double.parseDouble(txtPre.getText()));
				p.set_stock(Integer.parseInt(txtStock.getText()));
				p.set_stockMin(Integer.parseInt(txtStockMin.getText()));
			}
		}
		
	}
	protected void do_btnEliminar_actionPerformed(ActionEvent e) {
		if(txtCod.getText().trim().isEmpty()==true) {
			JOptionPane.showMessageDialog(this,"Necesitas el Codigo para eliminar","ADVERTENCIA",JOptionPane.WARNING_MESSAGE);
		}
		else {
			Producto p = le.Buscar(Integer.parseInt(txtCod.getText()));
		    if (p != null) {
		        le.eliminar(p);
		        JOptionPane.showMessageDialog(this, "Producto eliminado");
		        txtCod.setText("");
		        txtNom.setText("");
		        txtPre.setText("");
		        txtStock.setText("");
		    } 
		    else {
		        JOptionPane.showMessageDialog(this, "No existe este codigo a eliminar");
		    }
			
		}
	}
	protected void do_btninformedeStock_actionPerformed(ActionEvent e) {
		txtS.setText("");
		for(int i=0;i<le.Tamaño();i++) {
			Producto p=le.obteneri(i);
			if (p.get_stock()<=p.get_stockMin()) {
				txtS.append("Se esta acabando el stock de: "+p.get_nom()+
						" queda "+p.get_stock()+" disponibles en el stock\n");
				txtS.append("------------------------------------------------\n");
			}
		}
	}
}
