package logico;

import java.io.Serializable;
import java.util.ArrayList;

public class Vivienda implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7292118358932116886L;
	private int codigozip;
	private String direccion;
	private String idcasa;
	private String region;
	private String sector;
	private String telefono;
	private String tipo;
	private ArrayList<Persona>misPersonas;
	
	public Vivienda(int codigozip, String direccion, String idcasa, String region, String sector, String telefono,
			String tipo) {
		super();
		this.codigozip = codigozip;
		this.direccion = direccion;
		this.idcasa = idcasa;
		this.region = region;
		this.sector = sector;
		this.telefono = telefono;
		this.tipo = tipo;
		this.misPersonas = misPersonas;
	}
	
	
	public int getCodigozip() {
		return codigozip;
	}





	public void setCodigozip(int codigozip) {
		this.codigozip = codigozip;
	}





	public String getDireccion() {
		return direccion;
	}





	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}





	public String getIdcasa() {
		return idcasa;
	}





	public void setIdcasa(String idcasa) {
		this.idcasa = idcasa;
	}





	public String getRegion() {
		return region;
	}





	public void setRegion(String region) {
		this.region = region;
	}





	public String getSector() {
		return sector;
	}





	public void setSector(String sector) {
		this.sector = sector;
	}





	public String getTelefono() {
		return telefono;
	}





	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}





	public String getTipo() {
		return tipo;
	}





	public void setTipo(String tipo) {
		this.tipo = tipo;
	}





	public ArrayList<Persona> getMisPersonas() {
		return misPersonas;
	}





	public void setMisPersonas(ArrayList<Persona> misPersonas) {
		this.misPersonas = misPersonas;
	}





	public void addPersona(Persona per) {
		misPersonas.add(per);
	}
	public int buscarbyindice(String ide) {
		int index = -1;
		boolean encontrarp = false;
		int i = 0;
		while(!encontrarp && i<misPersonas.size()) {
			if (misPersonas.get(i).getCedula().equalsIgnoreCase(ide)) {
				encontrarp = true;
				index = i;
			}
			i++;
		}
		return index;
	}
	public void actualizarperson(Persona pv) {
		int indic = buscarbyindice(pv.getCedula());
		misPersonas.set(indic, pv);
	}
	
	
	
}
