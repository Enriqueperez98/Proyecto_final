package logico;

public class Cita {

	private String codigo;
	private Persona elPaciente;
	private Doctor elDoctor;
	
	public Cita(String codigo, Persona elPaciente, Doctor elDoctor) {
		super();
		this.codigo = codigo;
		this.elPaciente = elPaciente;
		this.elDoctor = elDoctor;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public Persona getElPaciente() {
		return elPaciente;
	}

	public void setElPaciente(Persona elPaciente) {
		this.elPaciente = elPaciente;
	}

	public Doctor getElDoctor() {
		return elDoctor;
	}

	public void setElDoctor(Doctor elDoctor) {
		this.elDoctor = elDoctor;
	}
	
	
	
}
