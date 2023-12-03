package logico;

import java.util.ArrayList;

public class Paciente extends Persona {

	
	
	//indice de masa coporal
	private String sexo;
	private double peso;
	private String tiposangre;
	private int edad;
	private String seguro;
	private String fechanacimiento;
	private double estatura;
	private String contactoemer;
	private String micodhistorial;
	//private double indicecorpo;
	ArrayList <Consulta> misConsultas;
	ArrayList <Vacuna> misVacunas;
	public Paciente(String nombre, String cedula, String telefono, String correo, String sexo, double peso,
			String tiposangre, int edad, String seguro, String fechanacimiento, double estatura, String contactoemer,
			String micodhistorial) {
		super(nombre, cedula, telefono, correo);
		this.sexo = sexo;
		this.peso = peso;
		this.tiposangre = tiposangre;
		this.edad = edad;
		this.seguro = seguro;
		this.fechanacimiento = fechanacimiento;
		this.estatura = estatura;
		this.contactoemer = contactoemer;
		this.micodhistorial = micodhistorial;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
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
	public double getEstatura() {
		return estatura;
	}
	public void setEstatura(double estatura) {
		this.estatura = estatura;
	}
	public String getContactoemer() {
		return contactoemer;
	}
	public void setContactoemer(String contactoemer) {
		this.contactoemer = contactoemer;
	}
	public String getMicodhistorial() {
		return micodhistorial;
	}
	public void setMicodhistorial(String micodhistorial) {
		this.micodhistorial = micodhistorial;
	}
	
	public double calcularimc() {
		double imc = 0;
		imc = peso/Math.pow(estatura, estatura);
		return imc;
	}
	
}
