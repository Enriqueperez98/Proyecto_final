package logico;

import java.util.ArrayList;

public class Clinica {

	public static int getCodEnferme() {
		return codEnferme;
	}

	private ArrayList<Vivienda>lasViviendas;
	private ArrayList<Persona>lasPersonas;
	private ArrayList<Cita>lasCitas;
	private ArrayList<Enfermedad>lasEnfermedades;
	private ArrayList<Vacuna>misVacunas;
	public static int codVivienda = 1;
	public static int codCita = 1;
	public static int codVacuna = 1;
	public static int codEnferme = 1;
	private static Clinica clinica = null;
	
	public Clinica() {
		super();
		this.lasViviendas = new ArrayList<Vivienda>();
		this.lasPersonas = new ArrayList<Persona>();
		this.lasCitas = new ArrayList<Cita>();
		this.lasEnfermedades = new ArrayList<Enfermedad>();
		this.misVacunas = new ArrayList<Vacuna>();
	}
	public static Clinica getInstance(){
		if(clinica == null) {
			clinica = new Clinica();
		}
		return clinica;
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
		codEnferme++;
	}
	
	public void addVacuna(Vacuna vac) {
		misVacunas.add(vac);
		codVacuna++;
	}
	
	
	public Persona obtenerPacienteById(String id) {
		
		for (Persona lasPersonas: lasPersonas) {
			if(lasPersonas.getCedula().equals(id) && lasPersonas instanceof Paciente) {			
				return lasPersonas;
			}
		}
		
		return null;
	}
	
	public void eliminarpaciente(Paciente pa) {
	    lasPersonas.remove(pa);
	}
	
	public int buscarindexpaciente(String cedu) {
		int index = -1;
		boolean encontrar = false;
		int i= 0;
		while(!encontrar && i<lasPersonas.size()) {
			if(lasPersonas.get(i).getCedula().equalsIgnoreCase(cedu)) {
				encontrar = true;
				index =i;
			}
			i++;
		}
		return index;
	}
	public void actualizarpaciente(Paciente pa) {
		int indice = buscarindexpaciente(pa.getCedula());
		lasPersonas.set(indice, pa);
	}
	
	public Persona obtenerDoctorById(String id) {
		
		for (Persona lasPersonas: lasPersonas) {
			if(((Doctor)lasPersonas).getCoddoctor().equals(id)) {
				
				return lasPersonas;
			}
		}
		
		return null;
	}
	
	public Vivienda obtenerViviendaByCode(String cod) {
		for(Vivienda lasViviendas: lasViviendas) {
			if(lasViviendas.getIdcasa().equals(cod)) {
				return lasViviendas;
			}
		}
		return null;
	}
	
	public Cita obtenerCitaByCode(String cod) {
		for(Cita lasCitas: lasCitas) {
			if(lasCitas.getCodigo().equals(cod)) {
				return lasCitas;
			}
		}
		return null;
	}
	
	public Vacuna obtenerVacunaByCode(String cod) {
		for(Vacuna misVacunas: misVacunas) {
			if(misVacunas.getCodigo().equals(cod)) {
				return misVacunas;
			}
		}
		return null;
	}
	
	public Enfermedad buscarEnfermedad(String codigo) {
		for (Enfermedad auxEnfe: lasEnfermedades) {
			if(auxEnfe.getCodenferme().equals(codigo)) {
				return auxEnfe;
			}
		}
		return null;
	}
	
	public int BuscarIndexbyEnfermedad(String codigo) {
		int index = -1;
		for (Enfermedad auxEnfe: lasEnfermedades) {
			index++;
			if(auxEnfe.getCodenferme().equals(codigo)) {
				return index;
			}
		}
		index = -1;
		return index;
	}
	
	public void modificarEnfermedad(Enfermedad enfe) {
		int aux = -1;
		aux = BuscarIndexbyEnfermedad(enfe.getCodenferme());
		lasEnfermedades.set(aux, enfe);	
	}
	
	
	
}
