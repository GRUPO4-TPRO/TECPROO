package reporte;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;

public class Diseño_venta extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblCliente;
	private JLabel lblNewLabel_2;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JButton btnNewButton;
	private JTextArea textArea;
	private JLabel lblNewLabel_1;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Diseño_venta frame = new Diseño_venta();
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
	public Diseño_venta() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 666, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		{
			lblNewLabel = new JLabel("<html><center>Codigo<br>Producto</center></html>");
			lblNewLabel.setBounds(10, 12, 59, 26);
			contentPane.add(lblNewLabel);
		}
		{
			lblCliente = new JLabel("Cliente");
			lblCliente.setBounds(90, 22, 44, 12);
			contentPane.add(lblCliente);
		}
		{
			lblNewLabel_2 = new JLabel("Descripcion");
			lblNewLabel_2.setBounds(202, 22, 95, 12);
			contentPane.add(lblNewLabel_2);
		}
		{
			textField = new JTextField();
			textField.setBounds(10, 45, 73, 18);
			contentPane.add(textField);
			textField.setColumns(10);
		}
		{
			textField_1 = new JTextField();
			textField_1.setColumns(10);
			textField_1.setBounds(89, 45, 106, 18);
			contentPane.add(textField_1);
		}
		{
			textField_2 = new JTextField();
			textField_2.setColumns(10);
			textField_2.setBounds(200, 45, 228, 18);
			contentPane.add(textField_2);
		}
		{
			btnNewButton = new JButton("Ingresar");
			btnNewButton.setBounds(521, 44, 100, 20);
			contentPane.add(btnNewButton);
		}
		{
			textArea = new JTextArea();
			textArea.setBounds(10, 73, 644, 180);
			contentPane.add(textArea);
		}
		{
			lblNewLabel_1 = new JLabel("Cantidad");
			lblNewLabel_1.setBounds(438, 26, 95, 12);
			contentPane.add(lblNewLabel_1);
		}
		{
			textField_3 = new JTextField();
			textField_3.setColumns(10);
			textField_3.setBounds(438, 45, 73, 18);
			contentPane.add(textField_3);
		}

	}
}
