package logico;

import java.util.ArrayList;

public class Paciente extends Persona {

	public Paciente(String nombre, String cedula, String telefono, String correo) {
		super(nombre, cedula, telefono, correo);
		// TODO Auto-generated constructor stub
	}
	private String sexo;
	private float peso;
	private String tiposangre;
	private int edad;
	private String seguro;
	private String fechanacimiento;
	private float estatura;
	ArrayList <Consulta> misConsultas;
	ArrayList <Vacuna> misVacunas;
	public Paciente(String nombre, String cedula, String telefono, String correo, String sexo, float peso,
			String tiposangre, int edad, String seguro, String fechanacimiento, ArrayList<Consulta> misConsultas,
			ArrayList<Vacuna> misVacunas,float estatura) {
		super(nombre, cedula, telefono, correo);
		this.sexo = sexo;
		this.peso = peso;
		this.tiposangre = tiposangre;
		this.edad = edad;
		this.seguro = seguro;
		this.fechanacimiento = fechanacimiento;
		this.misConsultas = misConsultas;
		this.misVacunas = misVacunas;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public String getTiposangre() {
		return tiposangre;
	}
	public void setTiposangre(String tiposangre) {
		this.tiposangre = tiposangre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getSeguro() {
		return seguro;
	}
	public void setSeguro(String seguro) {
		this.seguro = seguro;
	}
	public String getFechanacimiento() {
		return fechanacimiento;
	}
	public void setFechanacimiento(String fechanacimiento) {
		this.fechanacimiento = fechanacimiento;
	}
	public ArrayList<Consulta> getMisConsultas() {
		return misConsultas;
	}
	public void setMisConsultas(ArrayList<Consulta> misConsultas) {
		this.misConsultas = misConsultas;
	}
	public ArrayList<Vacuna> getMisVacunas() {
		return misVacunas;
	}
	public void setMisVacunas(ArrayList<Vacuna> misVacunas) {
		this.misVacunas = misVacunas;
	}
	public float getEstatura() {
		return estatura;
	}
	public void setEstatura(float estatura) {
		this.estatura = estatura;
	}
	
	
}
