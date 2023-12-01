package logico;

public class Probatoria {

	public static void main(String[] args) {
		String buscador = "402-2589595-8";
		double peso = 0;
		peso = 180.6;
		//Paciente p1 = new Paciente("Luis Perez", "402-2589595-8", "829-305-6596", "lup2010@hotmail.com", "Masculino", 180.6,"B+", 25, "ARS Futuro", "28/1/1998", 1.8, "809-247-7855", "001");
		Paciente p1 = new Paciente("Luis Perez", "402-2589595-8", "829-305-6596", "lup2010@hotmail.com", "Masculino", 180.6, "B+", 25, "ARS Futuro", "28/1/1998", 1.8, "809-247-7855", "001");
		Clinica cli = new Clinica();
		cli.addPersona(p1);
		cli.obtenerPacienteById(buscador);
		
	}

}
