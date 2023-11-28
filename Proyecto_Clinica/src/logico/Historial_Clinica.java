package logico;

import java.util.ArrayList;

public class Historial_Clinica {
	ArrayList<Consulta> misconsultas;
	private String codhistorial;
	private String fechahistorial;
	private String [] sirugiashis;
	private String [] alergias;
	private String [] medicacion;
	private String [] genetica;
	private String [] analisis;
	private int hospitalizacion;
	public Historial_Clinica(ArrayList<Consulta> misconsultas, String codhistorial, String fechahistorial,
			String[] sirugiashis, String[] alergias, String[] medicacion, String[] genetica, String[] analisis,
			int hospitalizacion) {
		super();
		this.misconsultas = misconsultas;
		this.codhistorial = codhistorial;
		this.fechahistorial = fechahistorial;
		this.sirugiashis = sirugiashis;
		this.alergias = alergias;
		this.medicacion = medicacion;
		this.genetica = genetica;
		this.analisis = analisis;
		this.hospitalizacion = hospitalizacion;
	}
	public ArrayList<Consulta> getMisconsultas() {
		return misconsultas;
	}
	public void setMisconsultas(ArrayList<Consulta> misconsultas) {
		this.misconsultas = misconsultas;
	}
	public String getCodhistorial() {
		return codhistorial;
	}
	public void setCodhistorial(String codhistorial) {
		this.codhistorial = codhistorial;
	}
	public String getFechahistorial() {
		return fechahistorial;
	}
	public void setFechahistorial(String fechahistorial) {
		this.fechahistorial = fechahistorial;
	}
	public String[] getSirugiashis() {
		return sirugiashis;
	}
	public void setSirugiashis(String[] sirugiashis) {
		this.sirugiashis = sirugiashis;
	}
	public String[] getAlergias() {
		return alergias;
	}
	public void setAlergias(String[] alergias) {
		this.alergias = alergias;
	}
	public String[] getMedicacion() {
		return medicacion;
	}
	public void setMedicacion(String[] medicacion) {
		this.medicacion = medicacion;
	}
	public String[] getGenetica() {
		return genetica;
	}
	public void setGenetica(String[] genetica) {
		this.genetica = genetica;
	}
	public String[] getAnalisis() {
		return analisis;
	}
	public void setAnalisis(String[] analisis) {
		this.analisis = analisis;
	}
	public int getHospitalizacion() {
		return hospitalizacion;
	}
	public void setHospitalizacion(int hospitalizacion) {
		this.hospitalizacion = hospitalizacion;
	}
	
	

}
