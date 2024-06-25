import java.util.Locale;
import java.util.Scanner;

public class ExercicioTerreno {
	public static void main(String[] args) {
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	//Largura do Terreno
	System.out.printf("Digite a largura do terreno: ");
	double larg = sc.nextDouble();
	//Comprimento do Terreno
	System.out.printf("Digite o comprimento do terreno: ");
	double comp = sc.nextDouble();
	sc.nextDouble();
	//Valor do M2 do Terreno
	System.out.printf("Digite o valor do m2 do terreno: ");
	double valm2 = sc.nextDouble();
	//Processamento dos valores
	double area = larg * comp;
	double preco = area * valm2;
	System.out.printf("Area do terreno: %2.%fn", area);
	System.out.printf("Valor do terreno: %2.%fn", preco);
	sc.close();
	}
}
