package logico;

import java.util.ArrayList;



public class Vacuna {

	private String nombre;
	private String codigo;
	ArrayList<Enfermedad> misEnfermadades;
	
	public Vacuna(String nombre, String codigo ) {
		super();
		this.nombre = nombre;
		this.codigo = codigo;
		this.misEnfermadades = new ArrayList<Enfermedad>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public ArrayList<Enfermedad> getMisEnfermadades() {
		return misEnfermadades;
	}

	public void setMisEnfermadades(ArrayList<Enfermedad> misEnfermadades) {
		this.misEnfermadades = misEnfermadades;
	}
	
	void addEnfermedad(Enfermedad enfe) {
		misEnfermadades.add(enfe);
	}
	
}
