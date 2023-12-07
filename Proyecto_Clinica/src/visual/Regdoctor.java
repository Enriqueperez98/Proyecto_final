package visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import logico.Clinica;
import logico.Doctor;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class Regdoctor extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField txtnombre;
	private JTextField txtcedula;
	private JTextField txtcorreo;
	private JTextField txttelefono;
	private JTextField txtnumcol;
	private JTextField txtcargo;
	private JTextField txtespecialidad;
	private JButton btnreg;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Regdoctor dialog = new Regdoctor();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Regdoctor() {
		setBounds(100, 100, 450, 500);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblNewLabel = new JLabel("Nombre:");
			lblNewLabel.setBounds(10, 35, 65, 14);
			contentPanel.add(lblNewLabel);
		}
		{
			JLabel lblNewLabel_1 = new JLabel("Cedula:\r\n");
			lblNewLabel_1.setBounds(10, 80, 65, 14);
			contentPanel.add(lblNewLabel_1);
		}
		{
			JLabel lblNewLabel_2 = new JLabel("Correo:");
			lblNewLabel_2.setBounds(10, 130, 65, 14);
			contentPanel.add(lblNewLabel_2);
		}
		{
			JLabel lblNewLabel_3 = new JLabel("Numero de colegio:");
			lblNewLabel_3.setBounds(10, 240, 130, 14);
			contentPanel.add(lblNewLabel_3);
		}
		{
			JLabel lblNewLabel_4 = new JLabel("Telefono: ");
			lblNewLabel_4.setBounds(10, 180, 100, 14);
			contentPanel.add(lblNewLabel_4);
		}
		{
			JLabel lblNewLabel_5 = new JLabel("Cargo:");
			lblNewLabel_5.setBounds(10, 300, 65, 14);
			contentPanel.add(lblNewLabel_5);
		}
		{
			JLabel lblNewLabel_6 = new JLabel("Especialidad");
			lblNewLabel_6.setBounds(10, 364, 100, 14);
			contentPanel.add(lblNewLabel_6);
		}
		{
			txtnombre = new JTextField();
			txtnombre.setBounds(85, 32, 240, 20);
			contentPanel.add(txtnombre);
			txtnombre.setColumns(10);
		}
		{
			txtcedula = new JTextField();
			txtcedula.setBounds(85, 77, 240, 20);
			contentPanel.add(txtcedula);
			txtcedula.setColumns(10);
		}
		{
			txtcorreo = new JTextField();
			txtcorreo.setBounds(85, 127, 240, 20);
			contentPanel.add(txtcorreo);
			txtcorreo.setColumns(10);
		}
		{
			txttelefono = new JTextField();
			txttelefono.setBounds(85, 177, 240, 20);
			contentPanel.add(txttelefono);
			txttelefono.setColumns(10);
		}
		{
			txtnumcol = new JTextField();
			txtnumcol.setBounds(140, 237, 240, 20);
			contentPanel.add(txtnumcol);
			txtnumcol.setColumns(10);
		}
		{
			txtcargo = new JTextField();
			txtcargo.setBounds(85, 297, 240, 20);
			contentPanel.add(txtcargo);
			txtcargo.setColumns(10);
		}
		{
			txtespecialidad = new JTextField();
			txtespecialidad.setBounds(100, 361, 240, 20);
			contentPanel.add(txtespecialidad);
			txtespecialidad.setColumns(10);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				btnreg = new JButton("Registrar");
				btnreg.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String cod = null;
						Doctor doc  = new Doctor(txtnombre.getText(), txtcedula.getText(), txttelefono.getText(), txtcorreo.getText(), null, txtespecialidad.getText(),
						txtcargo.getText(), Integer.parseInt(txtnumcol.getText()));
						//cod = doc.generar_coddoc();
						doc.setCoddoctor(doc.generar_coddoc());
						
							Clinica.getInstance().addPersona(doc);
						
						JOptionPane.showMessageDialog(null, "Completado con exito\n"+"Su codigo unico es: "+doc.getCoddoctor(), "Resgistro", JOptionPane.INFORMATION_MESSAGE);
						clean();
					}
				});
				btnreg.setActionCommand("OK");
				buttonPane.add(btnreg);
				getRootPane().setDefaultButton(btnreg);
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
public void clean() {
	txtnombre.setText("");
	txtcedula.setText("");
	txtcorreo.setText("");
	txttelefono.setText("");
	txtnumcol.setText("");
	txtcargo.setText("");
	txtespecialidad.setText("");
}
}
