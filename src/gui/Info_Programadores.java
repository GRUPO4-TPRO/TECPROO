package gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import clase.ListaVenta;
import clase.Lista_Stock;

import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Info_Programadores extends JDialog implements ActionListener {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JMenuBar menuBar;
	private JMenu mnNewMenu;
	private JMenuItem mntmNewMenuItem;
	private JMenu mnNewMenu_1;
	private JMenuItem mntmNewMenuItem_1;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the dialog.
	 */
	public Info_Programadores(Lista_Stock ls, ListaVenta lv) {
		this.ls=ls;
		this.lv=lv;
		setBounds(100, 100, 591, 421);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			lblNewLabel = new JLabel("New label");
			lblNewLabel.setBounds(297, 68, 44, 12);
			contentPanel.add(lblNewLabel);
		}
		{
			lblNewLabel_1 = new JLabel("New label");
			lblNewLabel_1.setBounds(297, 107, 44, 12);
			contentPanel.add(lblNewLabel_1);
		}
		{
			lblNewLabel_2 = new JLabel("New label");
			lblNewLabel_2.setBounds(297, 164, 44, 12);
			contentPanel.add(lblNewLabel_2);
		}
		{
			lblNewLabel_3 = new JLabel("New label");
			lblNewLabel_3.setBounds(297, 233, 44, 12);
			contentPanel.add(lblNewLabel_3);
		}
		{
			lblNewLabel_4 = new JLabel("New label");
			lblNewLabel_4.setBounds(297, 293, 44, 12);
			contentPanel.add(lblNewLabel_4);
		}
		{
			menuBar = new JMenuBar();
			menuBar.setBounds(0, 0, 577, 22);
			contentPanel.add(menuBar);
			{
				mnNewMenu = new JMenu("File");
				menuBar.add(mnNewMenu);
				{
					mntmNewMenuItem = new JMenuItem("Salir a la ventana principal\r\n");
					mntmNewMenuItem.addActionListener(this);
					mnNewMenu.add(mntmNewMenuItem);
				}
			}
			{
				mnNewMenu_1 = new JMenu("Programadores");
				menuBar.add(mnNewMenu_1);
				{
					mntmNewMenuItem_1 = new JMenuItem("Acerca de nosotros");
					mnNewMenu_1.add(mntmNewMenuItem_1);
				}
			}
		}
	}
	private Lista_Stock ls;
	private ListaVenta lv;
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == mntmNewMenuItem) {
			do_mntmNewMenuItem_actionPerformed(e);
		}
	}
	protected void do_mntmNewMenuItem_actionPerformed(ActionEvent e) {
		Diseño_Ventana_Principal prin=new Diseño_Ventana_Principal(ls,lv);
		prin.setVisible(true);
		
		this.dispose();
	}
}
