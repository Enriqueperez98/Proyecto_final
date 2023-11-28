package logico;

import java.util.ArrayList;

public class Enfermedad {
	
    private String codenferme;
	private String nombre;
	private String [] sintomas;
	private String tipo;
	private String [] causa;
	private String clasificacion;
	private String tratamiento;
	private String pronostico;
	public Enfermedad(String codenferme, String nombre, String[] sintomas, String tipo, String[] causa,
			String clasificacion, String tratamiento, String pronostico) {
		super();
		this.codenferme = codenferme;
		this.nombre = nombre;
		this.sintomas = sintomas;
		this.tipo = tipo;
		this.causa = causa;
		this.clasificacion = clasificacion;
		this.tratamiento = tratamiento;
		this.pronostico = pronostico;
	}
	public String getCodenferme() {
		return codenferme;
	}
	public void setCodenferme(String codenferme) {
		this.codenferme = codenferme;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String[] getSintomas() {
		return sintomas;
	}
	public void setSintomas(String[] sintomas) {
		this.sintomas = sintomas;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String[] getCausa() {
		return causa;
	}
	public void setCausa(String[] causa) {
		this.causa = causa;
	}
	public String getClasificacion() {
		return clasificacion;
	}
	public void setClasificacion(String clasificacion) {
		this.clasificacion = clasificacion;
	}
	public String getTratamiento() {
		return tratamiento;
	}
	public void setTratamiento(String tratamiento) {
		this.tratamiento = tratamiento;
	}
	public String getPronostico() {
		return pronostico;
	}
	public void setPronostico(String pronostico) {
		this.pronostico = pronostico;
	}
	
	
	
}
