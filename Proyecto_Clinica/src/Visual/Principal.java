package Visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import java.awt.Color;
import javax.swing.JMenuItem;

public class Principal extends JDialog {

	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Principal dialog = new Principal();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Principal() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
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
		{
			JMenuBar menuBar = new JMenuBar();
			setJMenuBar(menuBar);
			{
				JMenu mnPersona = new JMenu("Persona");
				mnPersona.setForeground(Color.BLACK);
				menuBar.add(mnPersona);
				{
					JMenuItem mntmAddPersona = new JMenuItem("A\u00F1adir");
					mnPersona.add(mntmAddPersona);
				}
			}
			{
				JMenu mnVivienda = new JMenu("Vivienda");
				mnVivienda.setForeground(Color.BLACK);
				menuBar.add(mnVivienda);
			}
			{
				JMenu mnVacuna = new JMenu("Vacuna");
				mnVacuna.setForeground(Color.BLACK);
				menuBar.add(mnVacuna);
			}
			{
				JMenu mnEnfermedad = new JMenu("Enfermedad");
				mnEnfermedad.setForeground(Color.BLACK);
				menuBar.add(mnEnfermedad);
				{
					JMenuItem mntmAddEnfermedad = new JMenuItem("A\u00F1adir");
					mnEnfermedad.add(mntmAddEnfermedad);
				}
			}
			{
				JMenu mnNewMenu_3 = new JMenu("New menu");
				menuBar.add(mnNewMenu_3);
			}
		}
	}

}
