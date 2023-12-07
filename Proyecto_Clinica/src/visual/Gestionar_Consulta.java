package visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import logico.Clinica;

import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;

public class Gestionar_Consulta extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTable tabla_consulta;
	private JTextField textField;
	private DefaultTableModel modelo;
	private static Object[] fila;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Gestionar_Consulta dialog = new Gestionar_Consulta();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Gestionar_Consulta() {
		setBounds(100, 100, 700, 700);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 118, 664, 499);
		contentPanel.add(scrollPane);
		
		
		scrollPane.setViewportView(tabla_consulta);{
			tabla_consulta = new JTable();
			modelo = new DefaultTableModel();
			tabla_consulta.setModel(modelo);
			
			modelo.addColumn("Codigo de consulta");
			modelo.addColumn("Tipo de consulta");
			modelo.addColumn("Diagnostico");
			modelo.addColumn("Motivo");
			modelo.addColumn("Hora");
			modelo.addColumn("Fecha");
		}
		
		JLabel lblNewLabel = new JLabel("Buscar consulta:");
		lblNewLabel.setBounds(10, 28, 130, 14);
		contentPanel.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(150, 25, 180, 20);
		contentPanel.add(textField);
		textField.setColumns(10);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			
			JButton btnNewButton = new JButton("New button");
			buttonPane.add(btnNewButton);
			{
				JButton okButton = new JButton("OK");
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
	
	public void llenartabla() {
		modelo.setColumnCount(0);
		fila = new Object [modelo.getColumnCount()];
		/*for (Consulta consul: Clinica.getInstance().get) {
			
		}*/
	}
}
