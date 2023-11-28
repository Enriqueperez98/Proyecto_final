package logico;

public class Doctor extends Persona {

	public Doctor(String nombre, String cedula, String telefono, String correo) {
		super(nombre, cedula, telefono, correo);
		// TODO Auto-generated constructor stub
	}
	private String coddoctor;
	private String especialidad;
	private String cargo;
	private int ncolegiado;
	public Doctor(String nombre, String cedula, String telefono, String correo, String coddoctor, String especialidad,
			String cargo, int ncolegiado) {
		super(nombre, cedula, telefono, correo);
		this.coddoctor = coddoctor;
		this.especialidad = especialidad;
		this.cargo = cargo;
		this.ncolegiado = ncolegiado;
	}
	public String getCoddoctor() {
		return coddoctor;
	}
	public void setCoddoctor(String coddoctor) {
		this.coddoctor = coddoctor;
	}
	public String getEspecialidad() {
		return especialidad;
	}
	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public int getNcolegiado() {
		return ncolegiado;
	}
	public void setNcolegiado(int ncolegiado) {
		this.ncolegiado = ncolegiado;
	}
	

	
}
