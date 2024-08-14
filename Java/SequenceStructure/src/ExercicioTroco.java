		//Bibliotecas
import java.util.Scanner;
import java.util.Locale;

public class ExercicioTroco {
	public static void main(String[] args) {
		
		//Variaveis
		double precoUni, dinRec, troco, total;
		int qnt;
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Preco unitario do produto: ");
		precoUni = sc.nextDouble();
		
		System.out.print("Quantidade comprada: ");
		qnt = sc.nextInt();
		total = (double) (precoUni * qnt);
		
		System.out.print("Dinheiro recebido: ");
		dinRec = sc.nextDouble();
		
		troco = (dinRec - total);
		System.out.printf("Troco: %.2f", troco);	
		
		sc.close();
	}

}
