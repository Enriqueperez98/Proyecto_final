package logico;

import java.util.ArrayList;

public class Clinica {

	private ArrayList<Vivienda>lasViviendas;
	private ArrayList<Persona>lasPersonas;
	private ArrayList<Cita>lasCitas;
	private ArrayList<Enfermedad>lasEnfermedades;
	private ArrayList<Vacuna>misVacunas;
	public static int codVivienda = 1;
	public static int codCita = 1;
	public static int codVacuna = 1;
	
	public Clinica() {
		super();
		this.lasViviendas = new ArrayList<Vivienda>();
		this.lasPersonas = new ArrayList<Persona>();
		this.lasCitas = new ArrayList<Cita>();
		this.lasEnfermedades = new ArrayList<Enfermedad>();
		this.misVacunas = new ArrayList<Vacuna>();
	}

	public ArrayList<Vivienda> getLasViviendas() {
		return lasViviendas;
	}

	public void setLasViviendas(ArrayList<Vivienda> lasViviendas) {
		this.lasViviendas = lasViviendas;
	}

	public ArrayList<Persona> getLasPersonas() {
		return lasPersonas;
	}

	public void setLasPersonas(ArrayList<Persona> lasPersonas) {
		this.lasPersonas = lasPersonas;
	}

	public ArrayList<Cita> getLasCitas() {
		return lasCitas;
	}

	public void setLasCitas(ArrayList<Cita> lasCitas) {
		this.lasCitas = lasCitas;
	}

	public ArrayList<Enfermedad> getLasEnfermedades() {
		return lasEnfermedades;
	}

	public void setLasEnfermedades(ArrayList<Enfermedad> lasEnfermedades) {
		this.lasEnfermedades = lasEnfermedades;
	}

	public ArrayList<Vacuna> getMisVacunas() {
		return misVacunas;
	}

	public void setMisVacunas(ArrayList<Vacuna> misVacunas) {
		this.misVacunas = misVacunas;
	}
	
	public static int getCodVivienda() {
		return codVivienda;
	}
	
	public static int getCodCita() {
		return codCita;
	}

	public static int getCodVacuna() {
		return codVacuna;
	}
	
	public void addVivienda(Vivienda viv) {
		lasViviendas.add(viv);
		codVivienda++;
	}
	
	public void addPersona(Persona per) {
		lasPersonas.add(per);
	}
	
	public void addCita(Cita cita) {
		lasCitas.add(cita);
		codCita++;
	}
	
	public void addEnfermedad(Enfermedad enfe) {
		lasEnfermedades.add(enfe);
	}
	
	public void addVacuna(Vacuna vac) {
		misVacunas.add(vac);
		codVacuna++;
	}
	
	
	public Persona obtenerPersonaById(String id) {
		int i = 0;
		Persona personaje = null;
		boolean encontrado = false;
		while(i<lasPersonas.size() && !encontrado) {
			if(lasPersonas.get(i).getCedula().equalsIgnoreCase(id)) {
				personaje = lasPersonas.get(i);
				encontrado = true;
			}
		i++;
		}
		return personaje;
	}
	
	public Vivienda obtenerViviendaByCode(String cod) {
		int i = 0;
		Vivienda propiedad = null;
		boolean encontrado = false;
		while(i<lasViviendas.size() && !encontrado) {
			if(lasViviendas.get(i).getCodigo().equalsIgnoreCase(cod)) {
				propiedad = lasViviendas.get(i);
				encontrado = true;
			}
		i++;
		}
		return propiedad;
	}
	
	public Cita obtenerCitaByCode(String cod) {
		int i = 0;
		Cita sesion = null;
		boolean encontrado = false;
		while(i<lasCitas.size() && !encontrado) {
			if(lasCitas.get(i).getCodigo().equalsIgnoreCase(cod)) {
				sesion = lasCitas.get(i);
				encontrado = true;
			}
		i++;
		}
		return sesion;
	}
	
	public Vacuna obtenerVacunaByCode(String cod) {
		int i = 0;
		Vacuna inyeccion = null;
		boolean encontrado = false;
		while(i<misVacunas.size() && !encontrado) {
			/*if(misVacunas.get(i).getCodigo().equalsIgnoreCase(cod)) {
				inyeccion = misVacunas.get(i);
				encontrado = true;
			}*/
		i++;
		}
		return inyeccion;
	}
	
	public Enfermedad buscarEnfermedad(String nombre) {
		int i = 0;
		Enfermedad virus = null;
		boolean encontrado = false;
		while(i<lasEnfermedades.size() && !encontrado) {
			if(lasEnfermedades.get(i).getNombre().equalsIgnoreCase(nombre)) {
				virus = lasEnfermedades.get(i);
				encontrado = true;
			}
		i++;
		}
		return virus;
	}
	
	
	
}
