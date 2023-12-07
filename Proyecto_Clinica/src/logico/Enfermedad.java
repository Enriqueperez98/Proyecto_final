package logico;

import java.io.Serializable;
import java.util.ArrayList;

public class Enfermedad implements Serializable{
	
    /**
	 * 
	 */
	private static final long serialVersionUID = 3717745292252527756L;
	private String codenferme;
	private String nombre;
	private String sintomas;
	private String tipo;
	ArrayList<String>causa;
	private String clasificacion;
	private String tratamiento;
	private String pronostico;
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
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
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
	public Enfermedad(String nombre, String sintomas, String codenferme) {
		super();
		this.codenferme = codenferme;
		this.nombre = nombre;
		this.tipo = tipo;
		this.clasificacion = clasificacion;
		this.tratamiento = tratamiento;
		this.pronostico = pronostico;
	}
	public String getSintomas() {
		return sintomas;
	}
	public void setSintomas(String sintomas) {
		this.sintomas = sintomas;
	}
	
	
	
	
}
