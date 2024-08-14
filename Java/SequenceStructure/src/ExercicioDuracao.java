import java.util.Scanner;
import java.util.Locale;


public class ExercicioDuracao {

	public static void main(String[] args) {
		
		//variaveis
		int duracao, horas, resto, segundos, minutos;
		
		//objetos
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		//programa 
		System.out.print("Digite a duracao em segundos: ");
        duracao = sc.nextInt();

        horas = duracao / 3600;
        resto = duracao % 3600;

        minutos = resto / 60;
        segundos = resto % 60;

        System.out.println(horas + ":" + minutos + ":" + segundos);
	}

}
