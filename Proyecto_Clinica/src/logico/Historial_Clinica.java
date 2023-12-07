package logico;

import java.util.ArrayList;
import java.util.Date;

public class Historial_Clinica {
	private ArrayList<Consulta> misconsultas;
	private String nombrePaciente;
	private String cedula;
	private String telefono;
	private String contactEmergency;
	private Date FechaHistorial;
	private String resumen;
	
	public Historial_Clinica(ArrayList<Consulta> misconsultas, String nombrePaciente, String cedula, String telefono,
			String contactEmergency, Date fechaHistorial, String resumen) {
		super();
		this.misconsultas = misconsultas;
		this.nombrePaciente = nombrePaciente;
		this.cedula = cedula;
		this.telefono = telefono;
		this.contactEmergency = contactEmergency;
		FechaHistorial = fechaHistorial;
		this.resumen = resumen;
	}

	public ArrayList<Consulta> getMisconsultas() {
		return misconsultas;
	}

	public void setMisconsultas(ArrayList<Consulta> misconsultas) {
		this.misconsultas = misconsultas;
	}

	public String getNombrePaciente() {
		return nombrePaciente;
	}

	public void setNombrePaciente(String nombrePaciente) {
		this.nombrePaciente = nombrePaciente;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getContactEmergency() {
		return contactEmergency;
	}

	public void setContactEmergency(String contactEmergency) {
		this.contactEmergency = contactEmergency;
	}

	public Date getFechaHistorial() {
		return FechaHistorial;
	}

	public void setFechaHistorial(Date fechaHistorial) {
		FechaHistorial = fechaHistorial;
	}

	public String getResumen() {
		return resumen;
	}

	public void setResumen(String resumen) {
		this.resumen = resumen;
	}	
	
}


