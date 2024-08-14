import java.util.Scanner;

public class ExercicioPagamento {

	public static void main(String[] args) {
		
		
		double horaTrab, valHor, pagamento;
		String nome;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nome: ");
		nome = sc.next();
		System.out.print("Valor por hora: ");
		valHor = sc.nextDouble();
		System.out.print("Horas trabalhadas: ");
		horaTrab = sc.nextDouble();
		
		pagamento = valHor * horaTrab;
		
		System.out.printf("O pagamento para %s deve ser %.2f", nome, pagamento);
		
		
		
		
		
		
		
		sc.close();
		

	}

}
