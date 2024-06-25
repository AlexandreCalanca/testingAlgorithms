import java.util.Scanner;

public class ExercicioSoma {

	public static void main(String[] args) {
		
		int x, y, soma;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o valor de x: ");
		x = sc.nextInt();		
		
		System.out.print("Digite o valor de y: ");
		y = sc.nextInt();		
				
		soma = x + y;
		System.out.printf("Soma: %d", soma);
		
		sc.close();
		
		
		

	}

}
