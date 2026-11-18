package ejercicio1;

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
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.Font;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;

public class Diseño_Stock extends JFrame implements ActionListener, MouseListener {

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
	private JButton btnlista;
	private JButton btnAdicion;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public Diseño_Stock(Lista_Stock le,ListaVenta lisV) {
		setTitle("Registro de Mantenimiento");
		
		this.le =le;
	    this.lisV =lisV;
	    
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 595, 352);
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
			lblNewLabel = new JLabel("Codigo");
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
		{
			btnirAReportarventas = new JButton("<html><center>Ir a reportar<br>ventas</center></html>");
			btnirAReportarventas.addActionListener(this);
			btnirAReportarventas.setBounds(475, 227, 96, 48);
			contentPane.add(btnirAReportarventas);
		}
		{
			scrollPane = new JScrollPane();
			scrollPane.setBounds(10, 118, 452, 135);
			contentPane.add(scrollPane);
			{
				txtS = new JTable();
				txtS.addMouseListener(this);
				scrollPane.setViewportView(txtS);
			}
			modelostock=new DefaultTableModel();
			modelostock.addColumn("CODIGO");
			modelostock.addColumn("NOMBRE");
			modelostock.addColumn("PRECIO");
			modelostock.addColumn("STOCK");
			modelostock.addColumn("STOCK_MINIMO");
			
			txtS.setModel(modelostock);
		}
		{
			lblCantProduc = new JLabel("Cantidad de productos:\r\n");
			lblCantProduc.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblCantProduc.setBounds(10, 274, 178, 31);
			contentPane.add(lblCantProduc);
		}
		{
			btnlimpiarcuadros = new JButton("<html><center>Limpiar<br>cuadros</center></html>");
			btnlimpiarcuadros.addActionListener(this);
			btnlimpiarcuadros.setBounds(472, 116, 96, 35);
			contentPane.add(btnlimpiarcuadros);
		}
		MostrarList();
	}
	Lista_Stock le;
	ListaVenta lisV;
	
	private JButton btnBuscar;
	private JButton btnModificar;
	private JButton btnEliminar;
	private JLabel lblStockMinimo;
	private JTextField txtStockMin;
	private JButton btninformedeStock;
	private JButton btnirAReportarventas;
	private JScrollPane scrollPane;
	private JTable txtS;
	private DefaultTableModel modelostock;
	private JLabel lblCantProduc;
	private JButton btnlimpiarcuadros;
	
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnlimpiarcuadros) {
			do_btnlimpiarcuadros_actionPerformed(e);
		}
		if (e.getSource() == btnirAReportarventas) {
			do_btnirAReportarventas_actionPerformed(e);
		}
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
		modelostock.setRowCount(0);
		MostrarList();
		
	}
	protected void do_btnAdicion_actionPerformed(ActionEvent e) {
		if(txtCod.getText().trim().isEmpty()|| txtNom.getText().trim().isEmpty()||txtPre.getText().trim().isEmpty()
				||txtStock.getText().trim().isEmpty()||txtStockMin.getText().trim().isEmpty()){
			JOptionPane.showMessageDialog(this,"Debes ingresa los datos correspondientes","ADVERTENCIA",JOptionPane.WARNING_MESSAGE);
		}
		else {
			try {
				int codigo = Integer.parseInt(txtCod.getText().trim());
	            double precio = Double.parseDouble(txtPre.getText().trim());
	            int stock = Integer.parseInt(txtStock.getText().trim());
	            int stockMin = Integer.parseInt(txtStockMin.getText().trim());
	      
				Clase_Producto p=le.Buscar(Integer.parseInt(txtCod.getText()));
				if(p !=null){
					JOptionPane.showMessageDialog(this,"Ya existe el codgio");	
				}
				else {
					le.Arreglo(codigo, txtNom.getText(), precio, stock, stockMin);
					lblCantProduc.setText("Cantidad de productos:"+le.Tamaño());

				}
			}
			catch (NumberFormatException ex) {
				JOptionPane.showMessageDialog(this, "Necesitas ingresar los datos según su tipo (Código, Precio, Stock y Stock Mínimo deben ser numéricos).", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
	        }
		}
		txtCod.setText("");
		txtNom.setText("");
		txtPre.setText("");
		txtStock.setText("");
		txtStockMin.setText("");
	}
	protected void do_btnBuscar_actionPerformed(ActionEvent e) {
		
		if(txtCod.getText().trim().isEmpty()==true) {
			JOptionPane.showMessageDialog(this,"se debe ingresar un codigo para buscar.","ADVERTENCIA",JOptionPane.WARNING_MESSAGE);
		}
		else {
			try {
				Clase_Producto p= le.Buscar(Integer.parseInt(txtCod.getText()));
				if(p != null) {
					JOptionPane.showMessageDialog(this,"Producto encontrado \n"
							+"CODIGO:"+p.get_cod()+"\n"+"NOMBRE:"+p.get_nom()+"\n"+"PRECIO:"+p.get_precio()+"\n"+"STOCK:"+p.get_stock());
				}
				else {
					JOptionPane.showMessageDialog(this,"No existe este codigo registrado");
				}
				
			}
			catch (NumberFormatException ex) {
				JOptionPane.showMessageDialog(this, "Se necesita un codgio valido para poder buscar", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
	        }
			
		}
		txtCod.setText("");
		
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
			Clase_Producto p=le.Buscar(Integer.parseInt(txtCod.getText()));
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
			Clase_Producto p = le.Buscar(Integer.parseInt(txtCod.getText()));
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
		modelostock.setRowCount(0);
	    modelostock.setColumnCount(0); 
	    modelostock.addColumn("productos que contienen menos del stock minimo");
		for(int i=0;i<le.Tamaño();i++) {
			Clase_Producto p=le.obteneri(i);
			if (p.get_stock()<=p.get_stockMin()) {
				String mensaje = "Se esta acabando el stock de: " + p.get_nom() + " | stock disponible: " + p.get_stock();
	           
	            modelostock.addRow(new Object[]{ mensaje });
			}
		}
	}
	protected void do_btnirAReportarventas_actionPerformed(ActionEvent e) {
		Diseno_venta Dventa=new Diseno_venta(le,lisV);
		Dventa.setVisible(true);
		
		this.dispose();
	}
	public void MostrarList() {
		modelostock.setRowCount(0);
	    modelostock.setColumnCount(0);
	    
	    modelostock.addColumn("CODIGO");
	    modelostock.addColumn("NOMBRE");
	    modelostock.addColumn("PRECIO");
	    modelostock.addColumn("STOCK");
	    modelostock.addColumn("STOCK_MINIMO");
		for(int i=0;i<le.Tamaño();i++) {
			Clase_Producto p=le.obteneri(i);
			if(p!=null) {
				Object[] fila= {
						p.get_cod(),
						p.get_nom(),
						p.get_precio(),
						p.get_stock(),
						p.get_stockMin()	
				};
				modelostock.addRow(fila);
			}
			
			lblCantProduc.setText("Cantidad de productos:"+le.Tamaño());
			
		}
	}
	public void mouseClicked(MouseEvent e) {
		if (e.getSource() == txtS) {
			do_txtS_mouseClicked(e);
		}
	}
	public void mouseEntered(MouseEvent e) {
	}
	public void mouseExited(MouseEvent e) {
	}
	public void mousePressed(MouseEvent e) {
	}
	public void mouseReleased(MouseEvent e) {
	}
	protected void do_txtS_mouseClicked(MouseEvent e) {
		int fila= txtS.getSelectedRow();
		txtCod.setText(String.valueOf(txtS.getValueAt(fila,0)));
		txtNom.setText(String.valueOf(txtS.getValueAt(fila,1)));
		txtPre.setText(String.valueOf(txtS.getValueAt(fila,2)));
		txtStock.setText(String.valueOf(txtS.getValueAt(fila,3)));
		txtStockMin.setText(String.valueOf(txtS.getValueAt(fila, 4)));
	}
	protected void do_btnlimpiarcuadros_actionPerformed(ActionEvent e) {
		txtCod.setText("");
		txtNom.setText("");
		txtPre.setText("");
		txtStock.setText("");
		txtStockMin.setText("");
	}
}
