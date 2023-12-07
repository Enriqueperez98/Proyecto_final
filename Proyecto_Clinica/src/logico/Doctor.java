package logico;
import java.util.ArrayList;
public class Doctor extends Persona {


	private String coddoctor;
	private String especialidad;
	private String cargo;
	private int ncolegiado;
	char[] pre = new char[20];
	int index =0;
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
	
	public String generar_coddoc() {
	
		int i=0;
		int j = 0;
		  
		while (i<nombre.toCharArray().length) {
			
			if (index == 0) {
				pre[index] = nombre.charAt(0);
				index++;
			}
			if(nombre.charAt(i)==' ') {
				pre[index] = nombre.charAt(i+1);	
				index++;
			}
			i++;
			
		}
		
		while (j<cedula.toCharArray().length) {
			
			if(cedula.charAt(j)!='-' ) {
				pre[index] = cedula.charAt(j);	
				index++;
			}
			j++;
		}

		String str = new String(pre);
		coddoctor = str;
		//System.out.print(coddoctor);
			return str;

}
	
	
	
	}
