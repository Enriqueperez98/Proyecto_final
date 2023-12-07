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
	     Doctor d2 = new Doctor ("Aurelio De Las Casas", "405-767-9800", "809-787-8909", "mediadlc@gmail.com", "89809", "Nefrologo", "Director Medico", 909778);
		Paciente p1 = new Paciente("Luis Enrique Perez", "402-2589595-8", "829-305-6596", "lup2010@hotmail.com", "Masculino", 180.6, "B+", 25, "ARS Futuro", "28/1/1998", 1.8, "809-247-7855", "001");
		Paciente p2 = new Paciente("Almando Barrera", "032-8978989-7", "849-670-0889", "almandobar67@outlook.com", "Masculino", 190.8, "A-", 23, "ARS Crecer", "15/3/2000", 1.9, "809-325-9809", "002");
		Vivienda v1 = new Vivienda(5000, "Jardines Metropolitanos, calle Rep.Del Libano", "#24", "Santiago", "Los Jardines", "809-789-0876","Apartamento");
		Vivienda v2 = new Vivienda(5001, "Los Alejos, calle#20, Gurabo", "#6","Santiago","Gurabo","802-678-9752","Casa");
		Vacuna vc1 = new Vacuna("STAMARIL, fiebre amarilla", "001");
		Vacuna vc2 = new Vacuna("Engerix B, hepatitis b","002");
		Enfermedad en1 = new Enfermedad("Fiebre Amarilla", "fiebre, cefaleas, ictericia, dolores musculares, náuseas, vómitos y cansancio", "E-001");
		Enfermedad en2 = new Enfermedad("Hepatitis B","fatiga, inapetencia, dolor de estómago, fiebre, náuseas, vómitos y, ocasionalmente, dolor en las articulaciones, urticaria o erupción","E-002");
		Cita c1 = new Cita("C-1", p1, d1);
		Cita c2 = new Cita("C-2",p2, d2);
		vc1.addEnfermedad(en1);
		vc2.addEnfermedad(en2);
		
		Clinica cli = new Clinica();
		cli.addPersona(p1);
		cli.addPersona(p2);
		cli.addEnfermedad(en1);
		cli.addEnfermedad(en2);
		cli.addCita(c1);
		cli.addCita(c2);
		cli.addVacuna(vc1);
		cli.addVacuna(vc2);
		cli.addVivienda(v1);
		cli.addVivienda(v2);
		cli.addPersona(d1);
		cli.addPersona(d2);
		
	    cli.guardarpersonasfile();
	    cli.guardarenfermedadfile();
	    cli.guardarlavacunafile();
	    cli.guardarcitafile();
	    cli.guardarviviendasfile();
	    
	    
		//cli.buscarpersonasfile();
	}

}
