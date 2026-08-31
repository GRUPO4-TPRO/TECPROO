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

public class diseño_ejer1 extends JFrame implements ActionListener {

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
					diseño_ejer1 frame = new diseño_ejer1();
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
	public diseño_ejer1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		{
			txtCod = new JTextField();
			txtCod.setBounds(72, 10, 96, 18);
			contentPane.add(txtCod);
			txtCod.setColumns(10);
		}
		{
			lblNewLabel = new JLabel("Codigo");
			lblNewLabel.setBounds(10, 13, 44, 12);
			contentPane.add(lblNewLabel);
		}
		{
			txtNom = new JTextField();
			txtNom.setColumns(10);
			txtNom.setBounds(72, 49, 96, 18);
			contentPane.add(txtNom);
		}
		{
			txtPre = new JTextField();
			txtPre.setColumns(10);
			txtPre.setBounds(288, 10, 96, 18);
			contentPane.add(txtPre);
		}
		{
			txtStock = new JTextField();
			txtStock.setColumns(10);
			txtStock.setBounds(288, 49, 96, 18);
			contentPane.add(txtStock);
		}
		{
			lblNombre = new JLabel("Nombre");
			lblNombre.setBounds(10, 52, 44, 12);
			contentPane.add(lblNombre);
		}
		{
			lblPrecio = new JLabel("Precio");
			lblPrecio.setBounds(234, 13, 44, 12);
			contentPane.add(lblPrecio);
		}
		{
			lblStock = new JLabel("Stock");
			lblStock.setBounds(234, 52, 44, 12);
			contentPane.add(lblStock);
		}
		{
			txtS = new JTextArea();
			txtS.setBounds(10, 118, 416, 135);
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
			btnAdicion.setBounds(125, 88, 84, 20);
			contentPane.add(btnAdicion);
		}
		txtS.setText("CODIGO"+"\t"+"NOMBRE"+"\t"+"PRECIO"+"\t"+"STOCK\n");
	}
	Lesta le=new Lesta();
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnAdicion) {
			do_btnAdicion_actionPerformed(e);
		}
		if (e.getSource() == btnlista) {
			do_btnlista_actionPerformed(e);
		}
	}
	protected void do_btnlista_actionPerformed(ActionEvent e) {
		txtS.setText(" ");
		txtS.setText("CODIGO"+"\t"+"NOMBRE"+"\t"+"PRECIO"+"\t"+"STOCK\n");
		 for(int i=0;i<le.Tamaño();i++) {
			 Producto p= le.obteneri(i);
			 txtS.append(p.get_cod()+"\t"+p.get_nom()+"\t"+p.get_precio()+"\t"+p.get_stock()+"\n");
		 }
	}
	protected void do_btnAdicion_actionPerformed(ActionEvent e) {
			if(le.Buscar(Integer.parseInt(txtCod.getText()))==true){
				JOptionPane.showMessageDialog(this,"Ya existe el codgio");	
			}
			else {
				le.Arreglo(Integer.parseInt(txtCod.getText()),
						txtNom.getText(),Double.parseDouble(txtPre.getText()),
						Integer.parseInt(txtStock.getText()));
				txtCod.setText("");
				txtNom.setText("");
				txtPre.setText("");
				txtStock.setText("");
			}
	}
}
