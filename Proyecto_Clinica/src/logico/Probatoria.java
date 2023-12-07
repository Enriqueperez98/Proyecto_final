package logico;

import java.io.IOException;

public class Probatoria {

	public static void main(String[] args) {
		String buscador = "402-2589595-8";
		double peso = 0;
		int f = 67678;
		peso = 180.6;
	     Doctor d1 = new Doctor("Rodolfo Valencia Mercedez", "03256789980", "829-546-9099", "elvillaino45@outlook.com", "0011", "Neurologo",
	 			"Cirujano", 9088989);
		//Paciente p1 = new Paciente("Luis Perez", "402-2589595-8", "829-305-6596", "lup2010@hotmail.com", "Masculino", 180.6,"B+", 25, "ARS Futuro", "28/1/1998", 1.8, "809-247-7855", "001");
		Paciente p1 = new Paciente("Luis Enrique Perez", "402-2589595-8", "829-305-6596", "lup2010@hotmail.com", "Masculino", 180.6, "B+", 25, "ARS Futuro", "28/1/1998", 1.8, "809-247-7855", "001");
		Clinica cli = new Clinica();
		//cli.addPersona(p1);
	   
		
		//cli.obtenerPacienteById(bu	//p1.generar_codp();
		//d1.generar_coddoc();
		//p1.generar_codp();
		//System.out.print("Hola?");
		
		cli.buscarpersonasfile();
	}

}
