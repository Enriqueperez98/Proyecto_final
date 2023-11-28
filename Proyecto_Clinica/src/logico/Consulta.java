package logico;

import java.util.ArrayList;

public class Consulta {
    private String observaciones;
    private String fecha;
    private String hora;
    private String [] diagnostico;
    private String motivo;
    private String representante;
    private String contactrep;
    private String tipoconsulta;
    ArrayList <Enfermedad> misEnfemedades;
	public Consulta(String observaciones, String fecha, String hora, String[] diagnostico, String motivo,
			String representante, String contactrep, String tipoconsulta, ArrayList<Enfermedad> misEnfemedades) {
		super();
		this.observaciones = observaciones;
		this.fecha = fecha;
		this.hora = hora;
		this.diagnostico = diagnostico;
		this.motivo = motivo;
		this.representante = representante;
		this.contactrep = contactrep;
		this.tipoconsulta = tipoconsulta;
		this.misEnfemedades = misEnfemedades;
	}
	public String getObservaciones() {
		return observaciones;
	}
	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public String getHora() {
		return hora;
	}
	public void setHora(String hora) {
		this.hora = hora;
	}
	public String[] getDiagnostico() {
		return diagnostico;
	}
	public void setDiagnostico(String[] diagnostico) {
		this.diagnostico = diagnostico;
	}
	public String getMotivo() {
		return motivo;
	}
	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}
	public String getRepresentante() {
		return representante;
	}
	public void setRepresentante(String representante) {
		this.representante = representante;
	}
	public String getContactrep() {
		return contactrep;
	}
	public void setContactrep(String contactrep) {
		this.contactrep = contactrep;
	}
	public String getTipoconsulta() {
		return tipoconsulta;
	}
	public void setTipoconsulta(String tipoconsulta) {
		this.tipoconsulta = tipoconsulta;
	}
	public ArrayList<Enfermedad> getMisEnfemedades() {
		return misEnfemedades;
	}
	public void setMisEnfemedades(ArrayList<Enfermedad> misEnfemedades) {
		this.misEnfemedades = misEnfemedades;
	}
    

}
