package br.com.etechoracio;

public class ExercicioUM {

	public static boolean ehdiasemana(String dia) {
		return !(dia.equalsIgnoreCase("domingo")|| dia.equalsIgnoreCase("sabado"));
	
	}

	public static void main(String[] args) {
		boolean diavalido = ehdiasemana("segunda");
		System.out.println("é dia da semana " + diavalido);
	}
}