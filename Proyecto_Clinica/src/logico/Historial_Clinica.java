package logico;

import java.util.ArrayList;

public class Historial_Clinica {
	ArrayList<Consulta> misconsultas;
	private String codhistorial;
	private String fechahistorial;
	ArrayList <String> sirugiashis;
	ArrayList <String>  alergias;
	ArrayList <String>  medicacion;
	ArrayList <String>  genetica;
	ArrayList <String>  analisis;
	private int hospitalizacion;
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
	public ArrayList<String> getSirugiashis() {
		return sirugiashis;
	}
	public void setSirugiashis(ArrayList<String> sirugiashis) {
		this.sirugiashis = sirugiashis;
	}
	public ArrayList<String> getAlergias() {
		return alergias;
	}
	public void setAlergias(ArrayList<String> alergias) {
		this.alergias = alergias;
	}
	public ArrayList<String> getMedicacion() {
		return medicacion;
	}
	public void setMedicacion(ArrayList<String> medicacion) {
		this.medicacion = medicacion;
	}
	public ArrayList<String> getGenetica() {
		return genetica;
	}
	public void setGenetica(ArrayList<String> genetica) {
		this.genetica = genetica;
	}
	public ArrayList<String> getAnalisis() {
		return analisis;
	}
	public void setAnalisis(ArrayList<String> analisis) {
		this.analisis = analisis;
	}
	public int getHospitalizacion() {
		return hospitalizacion;
	}
	public void setHospitalizacion(int hospitalizacion) {
		this.hospitalizacion = hospitalizacion;
	}
	public Historial_Clinica(ArrayList<Consulta> misconsultas, String codhistorial, String fechahistorial,
			ArrayList<String> sirugiashis, ArrayList<String> alergias, ArrayList<String> medicacion,
			ArrayList<String> genetica, ArrayList<String> analisis, int hospitalizacion) {
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

	public void agregarsirugias(String si) {
		sirugiashis.add(si);
	}
	
	public void agregaralergias(String ale) {
		alergias.add(ale);
	}
	public void agregarmedicacion(String medi) {
		medicacion.add(medi);
	}
	public void agregargenetica(String gen) {
		medicacion.add(gen);
	}
	public void agregaranalisis(String ana) {
		medicacion.add(ana);
	}
	public void agregarconsulta(Consulta con) {
		misconsultas.add(con);
	}

}
