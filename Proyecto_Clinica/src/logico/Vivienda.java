package logico;

import java.util.ArrayList;

public class Vivienda {

	private String codigo;
	private String direccion;
	private ArrayList<Persona>misPersonas;
	
	public Vivienda(String codigo, String direccion, ArrayList<Persona> misPersonas) {
		super();
		this.codigo = codigo;
		this.direccion = direccion;
		this.misPersonas = new ArrayList<Persona>();
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public ArrayList<Persona> getMisPersonas() {
		return misPersonas;
	}

	public void setMisPersonas(ArrayList<Persona> misPersonas) {
		this.misPersonas = misPersonas;
	}
	
	public void addPersona(Persona per) {
		misPersonas.add(per);
	}
	
}
