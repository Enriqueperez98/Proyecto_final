package logico;

import java.util.ArrayList;
import java.util.Date;

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
	//private double indicecorpo;
	private ArrayList <Consulta> misConsultas;
	private ArrayList <Vacuna> misVacunas;
	private Historial_Clinica miHistorial;
	
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
		this.misConsultas = new ArrayList<Consulta>();
		this.misVacunas = new ArrayList<Vacuna>();
		this.miHistorial = null;
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
	
	public double calcularimc() {
		double imc = 0;
		imc = peso/Math.pow(estatura, estatura);
		return imc;
	}
	
	public void newHistorial() {
		String resumen = "Nombre: "+nombre+"\nCedula: "+cedula+"\nTelefono: "+telefono+
				"Contacto de emergencia: "+contactoemer;
		int i = 0;
		for(Consulta laConsulta : misConsultas) {
			resumen += "\n\n\nConsulta #"+i+"\nFecha: "+laConsulta.getFecha()+"\nHora: "+laConsulta.getHora()+
			"\n\nMotivo: "+laConsulta.getMotivo()+"\n\nDiagnostico: "+laConsulta.getDiagnostico()+
			"\n\nObservaciones: "+laConsulta.getObservaciones();
			i++;
		}
		
		miHistorial = new Historial_Clinica(misConsultas, nombre, cedula, telefono, contactoemer, new Date(), resumen);
	}
	

}
