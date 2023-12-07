package visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import logico.Clinica;
import logico.Doctor;
import logico.Persona;
import logico.User;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class Regusuario extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField txtcodide;
	private JTextField txtuser;
	private JButton reg;
	private JPasswordField password1;
	private JPasswordField password2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Regusuario dialog = new Regusuario();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Regusuario() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblNewLabel = new JLabel("Codigo de identificacion:\r\n");
			lblNewLabel.setBounds(10, 30, 130, 14);
			contentPanel.add(lblNewLabel);
		}
		{
			txtcodide = new JTextField();
			txtcodide.setBounds(180, 27, 180, 20);
			contentPanel.add(txtcodide);
			txtcodide.setColumns(10);
		}
		{
			JLabel lblNewLabel_1 = new JLabel("Usuario:");
			lblNewLabel_1.setBounds(10, 80, 70, 14);
			contentPanel.add(lblNewLabel_1);
		}
		{
			txtuser = new JTextField();
			txtuser.setBounds(180, 77, 180, 20);
			contentPanel.add(txtuser);
			txtuser.setColumns(10);
		}
		{
			JLabel lblNewLabel_2 = new JLabel("Contraseña:  ");
			lblNewLabel_2.setBounds(10, 130, 90, 14);
			contentPanel.add(lblNewLabel_2);
		}
		{
			JLabel lblNewLabel_3 = new JLabel("Confirmacion de contraseña:");
			lblNewLabel_3.setBounds(10, 170, 180, 14);
			contentPanel.add(lblNewLabel_3);
		}
		
		password1 = new JPasswordField();
		password1.setBounds(183, 127, 177, 20);
		contentPanel.add(password1);
		
		password2 = new JPasswordField();
		password2.setBounds(180, 167, 180, 20);
		contentPanel.add(password2);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				reg = new JButton("Registrar");
				reg.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						Doctor di = new Doctor("Rodolfo Valencia Mercedez", "03256789980", "829-546-9099", "elvillaino45@outlook.com", "0011", "Neurologo",
					 			"Cirujano", 9088989);
						Clinica.getInstance().addPersona(di);
						String str1 = password1.getText();
						String str2 = password2.getText();
						
						if (str1.equals(str2)) {
						User us = new User(txtuser.getText(), password1.getText() ,txtcodide.getText());
						Persona d1 =Clinica.getInstance().obtenerDoctorById(txtcodide.getText());
						if(d1 != null) {
							//Clinica.getInstance().addUsuario(us);
							JOptionPane.showMessageDialog(null, "Completado con exito", "Resgistro", JOptionPane.INFORMATION_MESSAGE);
						}
						else {
							JOptionPane.showMessageDialog(null, "La persona no esta registrada", "Resgistro", JOptionPane.INFORMATION_MESSAGE);
						}
						}
						
						else{
							JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden\n"+password1.getText()+" "+password2.getText(), "Resgistro", JOptionPane.INFORMATION_MESSAGE);
						}
					}
					
				});
				reg.setActionCommand("OK");
				buttonPane.add(reg);
				getRootPane().setDefaultButton(reg);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
}
