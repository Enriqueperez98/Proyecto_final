package Logico;

import java.util.ArrayList;

public class Vivienda {

	private String codigo;
	private String direccion;
	private String telefono;
	private ArrayList<Persona>misPersonas;
	
	public Vivienda(String codigo, String direccion, String telefono, ArrayList<Persona> misPersonas) {
		super();
		this.codigo = codigo;
		this.direccion = direccion;
		this.telefono = telefono;
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

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public void setMisPersonas(ArrayList<Persona> misPersonas) {
		this.misPersonas = misPersonas;
	}
	
	public void addPersona(Persona per) {
		misPersonas.add(per);
	}
	
}
