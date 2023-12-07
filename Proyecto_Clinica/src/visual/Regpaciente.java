package visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import logico.Clinica;
import logico.Paciente;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.time.LocalTime;
import java.awt.event.ActionEvent;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Regpaciente extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField txtnombre;
	private JTextField txtcedula;
	private JTextField txttelefono;
	private JTextField txtcorreo;
	private JTextField txtcemergencia;
	private JTextField txtestatura;
	private JTextField txtedad;
	private JRadioButton rbtnmasculino;
	private JRadioButton rbtnfemenino;
	private JRadioButton rbtnotro;
	private JComboBox cbxtiposangre;
	private JButton reg;
	private JLabel lblNewLabel_8;
	private JTextField txtpeso;
	private JLabel lblNewLabel_9;
	private JTextField txtseguro;
	String sexo = null;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Regpaciente dialog = new Regpaciente();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Regpaciente() {
		setBounds(100, 100, 700, 550);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nombre:");
		lblNewLabel.setBounds(35, 50, 75, 14);
		contentPanel.add(lblNewLabel);
		
		txtnombre = new JTextField();
		txtnombre.setBounds(120, 47, 200, 20);
		contentPanel.add(txtnombre);
		txtnombre.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Cedula:\r\n");
		lblNewLabel_1.setBounds(35, 120, 75, 14);
		contentPanel.add(lblNewLabel_1);
		
		txtcedula = new JTextField();
		txtcedula.setBounds(120, 117, 200, 20);
		contentPanel.add(txtcedula);
		txtcedula.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Telefono:");
		lblNewLabel_2.setBounds(35, 185, 75, 14);
		contentPanel.add(lblNewLabel_2);
		
		txttelefono = new JTextField();
		txttelefono.setBounds(120, 182, 200, 20);
		contentPanel.add(txttelefono);
		txttelefono.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Correo: ");
		lblNewLabel_3.setBounds(35, 250, 75, 14);
		contentPanel.add(lblNewLabel_3);
		
		txtcorreo = new JTextField();
		txtcorreo.setBounds(120, 247, 200, 20);
		contentPanel.add(txtcorreo);
		txtcorreo.setColumns(10);
		
		
		
		rbtnmasculino = new JRadioButton("Masculino");
		rbtnmasculino.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rbtnmasculino.isSelected()) {
					rbtnfemenino.setSelected(false);
					rbtnotro.setSelected(false);
					sexo = "Masculino";
				}
				
			}
		});
		rbtnmasculino.setBounds(35, 310, 109, 23);
		contentPanel.add(rbtnmasculino);
		
		rbtnfemenino = new JRadioButton("Femenino");
		rbtnfemenino.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if(rbtnfemenino.isSelected()) {
					rbtnotro.setSelected(false);
					rbtnmasculino.setSelected(false);
					sexo = "Femenino";
				}
			}
		});
		rbtnfemenino.setBounds(175, 310, 109, 23);
		contentPanel.add(rbtnfemenino);
		
		rbtnotro = new JRadioButton("Otro");
		rbtnotro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if(rbtnotro.isSelected()) {
					rbtnfemenino.setSelected(false);
					rbtnmasculino.setSelected(false);
					sexo = "Otro";
				}
			}
		});
		rbtnotro.setBounds(331, 310, 109, 23);
		contentPanel.add(rbtnotro);
		
		JLabel lblNewLabel_4 = new JLabel("Edad:");
		lblNewLabel_4.setBounds(35, 365, 46, 14);
		contentPanel.add(lblNewLabel_4);
		
		txtcemergencia = new JTextField();
		txtcemergencia.setBounds(462, 362, 200, 20);
		contentPanel.add(txtcemergencia);
		txtcemergencia.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Tipo de Sangre:");
		lblNewLabel_5.setBounds(380, 120, 109, 14);
		contentPanel.add(lblNewLabel_5);
		
		cbxtiposangre = new JComboBox();
		cbxtiposangre.setModel(new DefaultComboBoxModel(new String[] {"<Seleccion>", "A+", "A-", "B+", "B-", "AB+", "AB-", "O+", "O-"}));
		cbxtiposangre.setBounds(499, 116, 137, 22);
		contentPanel.add(cbxtiposangre);
		
		JLabel lblNewLabel_6 = new JLabel("Estatura:");
		lblNewLabel_6.setBounds(380, 185, 109, 14);
		contentPanel.add(lblNewLabel_6);
		
		txtestatura = new JTextField();
		txtestatura.setBounds(499, 182, 137, 20);
		contentPanel.add(txtestatura);
		txtestatura.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Contacto de  emergencia:");
		lblNewLabel_7.setBounds(285, 365, 170, 14);
		contentPanel.add(lblNewLabel_7);
		
		txtedad = new JTextField();
		txtedad.setBounds(91, 362, 170, 20);
		contentPanel.add(txtedad);
		txtedad.setColumns(10);
		
		lblNewLabel_8 = new JLabel("Peso:");
		lblNewLabel_8.setBounds(380, 250, 46, 14);
		contentPanel.add(lblNewLabel_8);
		
		txtpeso = new JTextField();
		txtpeso.setBounds(499, 247, 137, 20);
		contentPanel.add(txtpeso);
		txtpeso.setColumns(10);
		
		lblNewLabel_9 = new JLabel("Seguro:");
		lblNewLabel_9.setBounds(380, 50, 75, 14);
		contentPanel.add(lblNewLabel_9);
		
		txtseguro = new JTextField();
		txtseguro.setBounds(492, 47, 170, 20);
		contentPanel.add(txtseguro);
		txtseguro.setColumns(10);
		
		//ToggleGroup toggleGroup = new ToggleGroup();
		
		
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				reg = new JButton("Registrar");
				reg.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						/*String nombre, String cedula, String telefono, String correo, String sexo, double peso,
			String tiposangre, int edad, String seguro, String fechanacimiento, double estatura, String contactoemer,
			String micodhistorial*/
						LocalDate currentDate = LocalDate.now();
						DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
						String fecha = currentDate.format(formatter);
						
						
						Paciente pa = new Paciente (txtnombre.getText(), txtcedula.getText(), txttelefono.getText(), txtcorreo.getText(), sexo, Double.parseDouble(txtpeso.getText()),
						cbxtiposangre.getSelectedItem().toString(), Integer.parseInt(txtedad.getText()), txtseguro.getText(), fecha, Double.parseDouble(txtestatura.getText()), txtcemergencia.getText(),
						null);//*/
						///pa.setMicodhistorial(pa.generar_codp());
						
							Clinica.getInstance().addPersona(pa);
						
						JOptionPane.showMessageDialog(null, "Completado con exito", "Resgistro", JOptionPane.INFORMATION_MESSAGE);
						clean();
						
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
	void clean () {
		ButtonGroup grupo1 = new ButtonGroup();
		grupo1.add(rbtnfemenino);
		grupo1.add(rbtnmasculino);
		grupo1.add(rbtnotro);
		txtnombre.setText("");
		txtcedula.setText("");
		txtcorreo.setText("");
		txttelefono.setText("");
		txtcemergencia.setText("");
		txtestatura.setText("");
		txtedad.setText("");
		txtseguro.setText("");
		txtedad.setText("");
		txtpeso.setText("");
		sexo = null;
		cbxtiposangre.setSelectedIndex(0);
		grupo1.clearSelection();
		
		
	}
}
