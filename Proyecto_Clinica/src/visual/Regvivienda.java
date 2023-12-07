package visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import logico.Clinica;
import logico.Vivienda;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Regvivienda extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField txtnumcas;
	private JTextField txtdir;
	private JTextField txtczip;
	private JTextField txttel;
	private JTextField txtsector;
	private JTextField txtregion;
	private JButton cancelButton;
	private JButton regbtn;
	Clinica cli = null;
	private JComboBox cbxtipo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Regvivienda dialog = new Regvivienda();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Regvivienda() {
		setBounds(100, 100, 500, 500);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblNewLabel = new JLabel("Numero de casa:\r\n");
			lblNewLabel.setBounds(10, 40, 120, 14);
			contentPanel.add(lblNewLabel);
		}
		{
			JLabel lblNewLabel_1 = new JLabel("Direccion: ");
			lblNewLabel_1.setBounds(10, 90, 75, 14);
			contentPanel.add(lblNewLabel_1);
		}
		{
			JLabel lblNewLabel_2 = new JLabel("Tipo:");
			lblNewLabel_2.setBounds(10, 150, 46, 14);
			contentPanel.add(lblNewLabel_2);
		}
		
		JLabel lblNewLabel_3 = new JLabel("Codigo ZIP:");
		lblNewLabel_3.setBounds(10, 200, 75, 14);
		contentPanel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Telefono:");
		lblNewLabel_4.setBounds(10, 250, 75, 14);
		contentPanel.add(lblNewLabel_4);
		
		txtnumcas = new JTextField();
		txtnumcas.setBounds(120, 37, 86, 20);
		contentPanel.add(txtnumcas);
		txtnumcas.setColumns(10);
		
		txtdir = new JTextField();
		txtdir.setBounds(80, 87, 260, 20);
		contentPanel.add(txtdir);
		txtdir.setColumns(10);
		
		cbxtipo = new JComboBox();
		cbxtipo.setModel(new DefaultComboBoxModel(new String[] {"<Seleccion>", "Casa", "Apartamento", "Apartaestudio"}));
		cbxtipo.setBounds(80, 146, 126, 22);
		contentPanel.add(cbxtipo);
		
		txtczip = new JTextField();
		txtczip.setBounds(95, 197, 86, 20);
		contentPanel.add(txtczip);
		txtczip.setColumns(10);
		
		txttel = new JTextField();
		txttel.setBounds(95, 247, 180, 20);
		contentPanel.add(txttel);
		txttel.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Sector:");
		lblNewLabel_5.setBounds(10, 310, 46, 14);
		contentPanel.add(lblNewLabel_5);
		
		txtsector = new JTextField();
		txtsector.setBounds(95, 307, 180, 20);
		contentPanel.add(txtsector);
		txtsector.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Region:");
		lblNewLabel_6.setBounds(10, 380, 46, 14);
		contentPanel.add(lblNewLabel_6);
		
		txtregion = new JTextField();
		txtregion.setBounds(95, 377, 180, 20);
		contentPanel.add(txtregion);
		txtregion.setColumns(10);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				regbtn = new JButton("Registrar");
				regbtn.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						Vivienda  vi = new Vivienda(Integer.parseInt(txtczip.getText()), txtdir.getText(), txtnumcas.getText(), txtregion.getText(), txtsector.getText(), txtsector.getText(),
						cbxtipo.getSelectedItem().toString());
						
						Clinica.getInstance().addVivienda(vi);
						JOptionPane.showMessageDialog(null, "Completado con exito", "Resgistro", JOptionPane.INFORMATION_MESSAGE);
						clean();
					}
				});
				regbtn.setActionCommand("OK");
				buttonPane.add(regbtn);
				getRootPane().setDefaultButton(regbtn);
			}
			{
				cancelButton = new JButton("Cancel");
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
	private void clean() {
		txtnumcas.setText("");
		txtdir.setText("");
		txtczip.setText("");
		txttel.setText("");
		txtsector.setText("");
		txtregion.setText("");
		cbxtipo.setSelectedIndex(0);
		
	}
}
