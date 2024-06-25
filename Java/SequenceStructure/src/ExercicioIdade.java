import java.util.Scanner;
import java.util.Locale;

public class ExercicioIdade {
	public static void main(String[] args) {
		
		int idade1, idade2;
		double mediaIdade;
		String nome1, nome2; 
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dados da primeira pessoa: ");
		
		System.out.print("Nome: ");
		nome1 = sc.next();
		System.out.print("Idade: ");
		idade1 = sc.nextInt();
		
		System.out.print("Nome: ");
		nome2 = sc.next();
		System.out.print("Idade: ");
		idade2 = sc.nextInt();
		
		mediaIdade = (double) (idade1 + idade2) / 2;
		System.out.printf("A media da idade de %s e %s é %.1f", nome1, nome2, mediaIdade);
		
		
	
		sc.close();
	}
}
