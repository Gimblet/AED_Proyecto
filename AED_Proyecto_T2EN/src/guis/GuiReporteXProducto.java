package guis;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GuiReporteXProducto extends JFrame {

	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblCodProducto;
	private JTextField txtCodProducto;
	private JPanel panel;
	private JTextArea textArea;
	private JButton btnProcesar;
	private JButton btnCerrar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GuiReporteXProducto frame = new GuiReporteXProducto();
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
	public GuiReporteXProducto() {
		setTitle("Reporte por Producto");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 782, 565);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblCodProducto = new JLabel("Código Producto");
		lblCodProducto.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblCodProducto.setBounds(10, 11, 108, 29);
		contentPane.add(lblCodProducto);
		
		txtCodProducto = new JTextField();
		txtCodProducto.setBounds(128, 12, 141, 29);
		contentPane.add(txtCodProducto);
		txtCodProducto.setColumns(10);
		
		panel = new JPanel();
		panel.setBounds(10, 51, 746, 464);
		contentPane.add(panel);
		panel.setLayout(null);
		
		textArea = new JTextArea();
		textArea.setBounds(0, 0, 746, 464);
		panel.add(textArea);
		
		btnProcesar = new JButton("Procesar");
		btnProcesar.setBounds(568, 15, 89, 23);
		contentPane.add(btnProcesar);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnCerrarActionPerformed(e);
			}
		});
		btnCerrar.setBounds(667, 15, 89, 23);
		contentPane.add(btnCerrar);
	}
	protected void btnCerrarActionPerformed(ActionEvent e) {
		dispose();
	}
}
