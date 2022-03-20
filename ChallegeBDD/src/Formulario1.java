import java.awt.EventQueue;
import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import com.mysql.cj.xdevapi.*;
import java.sql.*;

import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Formulario1 {

	private JFrame frame;
	private JTextField caja1;
	private JTextField caja2;
	private JTextField caja3;
	private JTextField caja4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Formulario1 window = new Formulario1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Formulario1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 522, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		caja1 = new JTextField();
		caja1.setBounds(203, 28, 86, 20);
		frame.getContentPane().add(caja1);
		caja1.setColumns(10);
		
		caja2 = new JTextField();
		caja2.setBounds(203, 77, 86, 20);
		frame.getContentPane().add(caja2);
		caja2.setColumns(10);
		
		caja3 = new JTextField();
		caja3.setBounds(203, 125, 86, 20);
		frame.getContentPane().add(caja3);
		caja3.setColumns(10);
		
		caja4 = new JTextField();
		caja4.setBounds(203, 174, 86, 20);
		frame.getContentPane().add(caja4);
		caja4.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Nombre");
		lblNewLabel.setBounds(83, 31, 71, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Apellido");
		lblNewLabel_1.setBounds(81, 80, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Telefono");
		lblNewLabel_2.setBounds(83, 128, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Email");
		lblNewLabel_3.setBounds(83, 177, 46, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JButton btnNewButton = new JButton("Guardar");
		
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerfomed(ActionEvent e) {
				try {
					Class.forName("com.mysql.jdbc.Driver");
					
					java.sql.Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/basechallenge","root","");
					
					String nombre = caja1.getText();
					String apellido = caja2.getText();
					String telefono = caja3.getText();
					String email = caja4.getText();
					
					String query= "INSERT INTO empleado(nombre,apellido,telefono.email) values('"+nombre+"','"+apellido+"','"+telefono+"','"+email+"',)";
					PreparedStatement stmt = conexion.prepareStatement("INSERT INTO basechallenge VALUES (?,?,?,?)");
					
					stmt.executeUpdate(query);
					JOptionPane.showMessageDialog(null,"Agregado correctamente");
					
				}catch(Exception el) {
					JOptionPane.showMessageDialog(null,"no se pudo");
				}
			}

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}});
		btnNewButton.setBounds(145, 215, 89, 23);
		frame.getContentPane().add(btnNewButton);
			
		
		
		}
}
