package logico;

import java.util.ArrayList;

public class Consulta {
    ArrayList<String> observaciones;
    private String fecha;
    private String hora;
    private String diagnostico;
    private String motivo;
    private String representante;
    private String contactrep;
    private String tipoconsulta;
    private String codconsulta;
    ArrayList <Enfermedad> misEnfermedades;


public ArrayList<String> getObservaciones() {
	return observaciones;
}
public void setObservaciones(ArrayList<String> observaciones) {
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
public String getDiagnostico() {
	return diagnostico;
}
public void setDiagnostico(String diagnostico) {
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
public String getCodconsulta() {
	return codconsulta;
}
public void setCodconsulta(String codconsulta) {
	this.codconsulta = codconsulta;
}
public ArrayList<Enfermedad> getMisEnfermedades() {
	return misEnfermedades;
}
public void setMisEnfermedades(ArrayList<Enfermedad> misEnfermedades) {
	this.misEnfermedades = misEnfermedades;
}
public Consulta(ArrayList<String> observaciones, String fecha, String hora, String diagnostico, String motivo,
		String representante, String contactrep, String tipoconsulta, String codconsulta,
		ArrayList<Enfermedad> misEnfermedades) {
	super();
	this.observaciones = observaciones;
	this.fecha = fecha;
	this.hora = hora;
	this.diagnostico = diagnostico;
	this.motivo = motivo;
	this.representante = representante;
	this.contactrep = contactrep;
	this.tipoconsulta = tipoconsulta;
	this.codconsulta = codconsulta;
	this.misEnfermedades = misEnfermedades;
}

  
public void agregarenfermedades(Enfermedad ei) {
	misEnfermedades.add(ei);
}
public void eliminarenfermedades(Enfermedad ei) {
	misEnfermedades.remove(ei);
}
public int indiceenfermedad(String cod) {
	int indice = -1;
	boolean encontrar = false;
	int i =0;
	while (!encontrar && i<misEnfermedades.size()) {
		if(misEnfermedades.get(i).getCodenferme().equalsIgnoreCase(cod)) {
			encontrar = true;
			indice = i;
		}
		i++;
	}
	return indice;
}
public void actualizarenfermedades(Enfermedad en) {
	int ind = indiceenfermedad(en.getCodenferme());
	misEnfermedades.set(ind, en);
}
public void agregarobservaciones(String comentario) {
  observaciones.add(comentario);
}
public void borrarobservaciones(String comentario) {
	observaciones.remove(comentario);
}

public String registrocomentarios() {
	for(String observaciones: observaciones) {
		return observaciones;
	}
	return null;
}
    

}
