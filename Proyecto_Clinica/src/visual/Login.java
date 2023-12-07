package visual;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtuser;
	private JPasswordField passclave;
	private JButton btnNewButton;
	private JButton btnNewButton_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Login");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(170, 30, 75, 22);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Usuario:");
		lblNewLabel_1.setBounds(10, 75, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		txtuser = new JTextField();
		txtuser.setBounds(82, 72, 182, 20);
		contentPane.add(txtuser);
		txtuser.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Contraseña:");
		lblNewLabel_2.setBounds(10, 156, 84, 14);
		contentPane.add(lblNewLabel_2);
		
		passclave = new JPasswordField();
		passclave.setBounds(82, 153, 182, 20);
		contentPane.add(passclave);
		
		btnNewButton = new JButton("Ingresar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				char [] clave = passclave.getPassword();
				String clavecompleta = new String (clave);
				if(txtuser.getText().equals("Hello")&&clavecompleta.equals("elmenol04")) {
					dispose();
					JOptionPane.showMessageDialog(null, "Bienvenido");
					Ventana_Principal ventana_principal = new Ventana_Principal();
					ventana_principal.setVisible(true);
				}else {
					JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrecta");
				}
			}
		});
		btnNewButton.setBounds(236, 227, 89, 23);
		contentPane.add(btnNewButton);
		
		btnNewButton_1 = new JButton("Salir");
		btnNewButton_1.setBounds(335, 227, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Registrarse");
		btnNewButton_2.setBounds(137, 227, 89, 23);
		contentPane.add(btnNewButton_2);
	}
}
