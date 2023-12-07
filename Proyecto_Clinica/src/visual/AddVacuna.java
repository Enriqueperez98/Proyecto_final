package visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import logico.Clinica;
import logico.Enfermedad;
import logico.Vacuna;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;

import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.JOptionPane;

public class AddVacuna extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtNombre;
	private JTextField txtCodigo;
	private int selected = -1;
	private DefaultListModel<String> enfermDisponible;
	private DefaultListModel<String> enfermSelected;
	private JList listDisponible;
	private ArrayList<String> disponible;
	private ArrayList<String> select;
	private JList listSelected;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			AddVacuna dialog = new AddVacuna();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public AddVacuna() {
		
		disponible = new ArrayList<>();
		select = new ArrayList<>();
		setBounds(100, 100, 538, 446);
		setModal(true);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(15, 16, 69, 20);
		contentPanel.add(lblNombre);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(15, 40, 176, 26);
		contentPanel.add(txtNombre);
		txtNombre.setColumns(10);
		
		JLabel lblCodigo = new JLabel("Codigo");
		lblCodigo.setBounds(251, 16, 69, 20);
		contentPanel.add(lblCodigo);
		
		txtCodigo = new JTextField();
		txtCodigo.setEditable(false);
		txtCodigo.setBounds(251, 40, 109, 26);
		txtCodigo.setText("VAC-"+String.valueOf(Clinica.getCodVacuna()));
		contentPanel.add(txtCodigo);
		txtCodigo.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Enfermedades", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(15, 94, 486, 241);
		contentPanel.add(panel);
		panel.setLayout(null);
		
		JButton btnDerecha = new JButton("> >");
		btnDerecha.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String temp = disponible.get(selected);
				  select.add(temp);
				  enfermSelected.addElement(temp);
				  btnDerecha.setEnabled(false);
				  disponible.remove(selected);
				  reloadDisponible();
			}
		});
		btnDerecha.setEnabled(false);
		btnDerecha.setBounds(186, 75, 115, 29);
		panel.add(btnDerecha);
		
		JButton btnIzquierda = new JButton("< <");
		btnIzquierda.setEnabled(false);
		btnIzquierda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String temp = select.get(selected);
				  disponible.add(temp);
				  enfermDisponible.addElement(temp);
				  btnIzquierda.setEnabled(false);
				  select.remove(selected);
				  reloadSelected();
			}
		});
		btnIzquierda.setBounds(186, 149, 115, 29);
		panel.add(btnIzquierda);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(15, 55, 158, 170);
		panel.add(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		panel_1.add(scrollPane, BorderLayout.CENTER);
		
		listDisponible = new JList();
		scrollPane.setViewportView(listDisponible);
		listDisponible.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				selected = listDisponible.getSelectedIndex();
				if(selected>=0){
					btnDerecha.setEnabled(true);
				}
			}
		});
		enfermDisponible = new DefaultListModel<String>();
		enfermSelected = new DefaultListModel<String>();
		listDisponible.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		listDisponible.setModel(enfermDisponible);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(316, 55, 155, 170);
		panel.add(panel_2);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane_1 = new JScrollPane();
		panel_2.add(scrollPane_1, BorderLayout.CENTER);
		
		listSelected = new JList();
		listSelected.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				selected = listSelected.getSelectedIndex();
				if(selected>=0){
					btnIzquierda.setEnabled(true);
				}
			}
		});
		listSelected.setModel(enfermSelected);
		scrollPane_1.setViewportView(listSelected);
		
		JLabel lblDsiponibles = new JLabel("Disponibles");
		lblDsiponibles.setBounds(15, 29, 95, 20);
		panel.add(lblDsiponibles);
		
		JLabel lblSelect = new JLabel("Seleccionados");
		lblSelect.setBounds(316, 29, 108, 20);
		panel.add(lblSelect);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton btnRegistrar = new JButton("Registrar");
				btnRegistrar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						Vacuna vax = new Vacuna(txtNombre.getText(), txtCodigo.getText());
						for(int i = 0; i < select.size(); i++) {
							String codEnf = select.get(i).substring(0, (select.get(i).indexOf(":")-1));
							Enfermedad enf = Clinica.getInstance().buscarEnfermedad(codEnf);
							vax.addEnfermedad(enf);
						 }
						Clinica.getInstance().addVacuna(vax);
						JOptionPane.showMessageDialog(null, "Registro satisfactorio", "Informaci�n", JOptionPane.INFORMATION_MESSAGE);
					}
				});
				btnRegistrar.setActionCommand("OK");
				buttonPane.add(btnRegistrar);
				getRootPane().setDefaultButton(btnRegistrar);
			}
			{
				JButton btnCancelar = new JButton("Cancelar");
				btnCancelar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				btnCancelar.setActionCommand("Cancel");
				buttonPane.add(btnCancelar);
			}
		}
		
		loadDisponibles();
		loadSelect();
	}
	
	private void loadSelect() {
		
	}
	
	private void loadDisponibles() {
		enfermDisponible.removeAllElements();
		String fill = "";
		for (int i = 0; i < Clinica.getInstance().getLasEnfermedades().size(); i++) {
			fill = Clinica.getInstance().getLasEnfermedades().get(i).getCodenferme()+" : "+Clinica.getInstance().getLasEnfermedades().get(i).getNombre();
			disponible.add(fill);
			enfermDisponible.addElement(fill);
		}
	}
	
	private void reloadDisponible() {
		enfermDisponible.removeAllElements();
		String aux = "";
		for (int i = 0; i < disponible.size(); i++) {
			aux = disponible.get(i);
			enfermDisponible.addElement(aux);
		}
	}
	
	private void reloadSelected() {
		enfermSelected.removeAllElements();
		String aux = "";
		for (int i = 0; i < select.size(); i++) {
			aux = select.get(i);
			enfermSelected.addElement(aux);
		}
	}
}
