package visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import Logico.Clinica;
import Logico.Enfermedad;
import Logico.Persona;
import Logico.Paciente;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;

import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;

public class ListPersonas extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private static DefaultTableModel model;
	private static Object[] rows;
	private JTable table;
	private JButton btnModificar;
	private JButton btnEliminar;
	public Persona selected = logico.Clinica.getInstance().buscarpersonasfile();
	private JButton btnCancelar;
	private JButton btnConsultas;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			ListPersonas dialog = new ListPersonas();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public ListPersonas() {
		setBounds(100, 100, 569, 371);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		{
			JPanel panel = new JPanel();
			contentPanel.add(panel, BorderLayout.CENTER);
			panel.setLayout(new BorderLayout(0, 0));
			{
				JScrollPane scrollPane = new JScrollPane();
				panel.add(scrollPane, BorderLayout.CENTER);
				{
					model = new DefaultTableModel();
					String[] columnas = {"Nombre","Cedula","Telefono","Direccion","Especializacion"};
					model.setColumnIdentifiers(columnas);
					table = new JTable();
					table.addMouseListener(new MouseAdapter() {
						@Override
						public void mouseClicked(MouseEvent e) {
							int rowSelected = -1;
							rowSelected = table.getSelectedRow();
							if(rowSelected>=0){
							   selected = Clinica.getInstance().BuscarPersonaById(table.getValueAt(rowSelected, 1).toString());
							}
						}
					});
					table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
					table.setModel(model);
					scrollPane.setViewportView(table);
					
				}
			}
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				btnModificar = new JButton("Modificar");
				btnModificar.setEnabled(false);
				btnModificar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					}
				});
				{
					btnConsultas = new JButton("Ver Atributos extra");
					btnConsultas.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							if(selected!=null && (selected instanceof Logico.Paciente || selected instanceof Logico.Doctor)) {
								btnConsultas.setEnabled(true);
							}
							if(selected instanceof Logico.Paciente) {
								ListConsulta consults = new ListConsulta(selected);
								consults.setVisible(true);
								consults.setModal(true);
							}
						}
					});
					btnConsultas.setEnabled(false);
					buttonPane.add(btnConsultas);
				}
				btnModificar.setActionCommand("OK");
				buttonPane.add(btnModificar);
				getRootPane().setDefaultButton(btnModificar);
			}
			{
				btnCancelar = new JButton("Cancelar");
				btnCancelar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				btnCancelar.setActionCommand("Cancel");
				buttonPane.add(btnCancelar);
			}
		}
		loadPersonas();
	}
	
	public static void loadPersonas() {
		model.setRowCount(0);
		rows = new Object[model.getColumnCount()];
		for (int i = 0; i < Clinica.getInstance().getLasPersonas().size(); i++) {
		   rows[0] = Clinica.getInstance().getLasPersonas().get(i).getNombre();
		   rows[1] = Clinica.getInstance().getLasPersonas().get(i).getCedula();
		   rows[2] = Clinica.getInstance().getLasPersonas().get(i).getTelefono();
		   rows[3] = Clinica.getInstance().getLasPersonas().get(i).getCorreo();
		   rows[4] = Clinica.getInstance().getLasPersonas().get(i).getDireccion();
		   if(Clinica.getInstance().getLasPersonas().get(i) instanceof Logico.Paciente) {
			   rows[5] = "Paciente";
		   }
		   if(Clinica.getInstance().getLasPersonas().get(i) instanceof Logico.Doctor) {
			   rows[5] = "Doctor";
		   }
		   if(!(Clinica.getInstance().getLasPersonas().get(i) instanceof Logico.Doctor) &&
			!(Clinica.getInstance().getLasPersonas().get(i) instanceof Logico.Doctor)) {
			   rows[5] = "Ninguna";
		   }
		 model.addRow(rows);
		}	
	}

}
