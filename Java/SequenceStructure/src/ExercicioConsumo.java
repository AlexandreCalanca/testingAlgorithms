import java.util.Scanner;
import java.util.Locale;

public class ExercicioConsumo {

	public static void main(String[] args) {
		
		int distPerc;
		double combGast, consMedio;
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Distância percorrida: ");
		distPerc = sc.nextInt();
		System.out.print("Combustível gasto: ");
		combGast = sc.nextDouble();
		
		consMedio = distPerc / combGast;
		
		System.out.printf("Consumo médio = %.3f", consMedio);
		
		sc.close();

	}

}
