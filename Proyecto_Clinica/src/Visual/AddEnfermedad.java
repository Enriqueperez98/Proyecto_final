package Visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Logico.Clinica;
import Logico.Enfermedad;

import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AddEnfermedad extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtNombre;
	private JTextField txtCodigo;
	private JTextField txtSintomas;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			AddEnfermedad dialog = new AddEnfermedad(null);
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public AddEnfermedad(Enfermedad enfe) {
		if(enfe == null) {
			setTitle("Registrar Enfermedad");
		}else {
			setTitle("Modificar Datos Enfermedad (EV-"+enfe.getCodEnferme());
		}
		
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(15, 16, 77, 20);
		contentPanel.add(lblNombre);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(15, 37, 159, 26);
		contentPanel.add(txtNombre);
		txtNombre.setColumns(10);
		
		JLabel lblCodigo = new JLabel("C\u00F3digo");
		lblCodigo.setBounds(218, 16, 69, 20);
		contentPanel.add(lblCodigo);
		
		txtCodigo = new JTextField();
		txtCodigo.setEditable(false);
		txtCodigo.setBounds(218, 37, 97, 26);
		txtCodigo.setText("EV-"+String.valueOf(Clinica.codEnferme));
		contentPanel.add(txtCodigo);
		txtCodigo.setColumns(10);
		
		txtSintomas = new JTextField();
		txtSintomas.setBounds(15, 112, 398, 77);
		contentPanel.add(txtSintomas);
		txtSintomas.setColumns(10);
		
		JLabel lblSintomas = new JLabel("Descripcion de los Sintomas");
		lblSintomas.setBounds(15, 87, 211, 20);
		contentPanel.add(lblSintomas);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton RegistrarButton = new JButton("Registrar");
				RegistrarButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						Enfermedad enfermed = new Enfermedad(txtNombre.getText(), txtSintomas.getText(),
								txtCodigo.getText());
						Clinica.getInstance().addEnfermedad(enfe);
						JOptionPane.showMessageDialog(null, "Registro satisfactorio", "Información", JOptionPane.INFORMATION_MESSAGE);
						dispose();
					}
					
				});
				RegistrarButton.setActionCommand("OK");
				buttonPane.add(RegistrarButton);
				getRootPane().setDefaultButton(RegistrarButton);
			}
			{
				JButton cancelButton = new JButton("Cancelar");
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
