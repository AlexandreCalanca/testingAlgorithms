//importando bibliotecas
import java.util.Scanner;
import java.util.Locale;

public class ExercicioRetangulo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Variaveis
		double baseRet, altRet, area, peri, diag;
		
		//Programa
		System.out.print("Base do retangulo: ");
		baseRet = sc.nextDouble();
		
		System.out.print("Altura do retangulo: ");
		altRet = sc.nextDouble();
		
		area = baseRet * altRet;
		System.out.printf("Área do RETANGULO: %.4f\n", area);
		
		peri = (baseRet * 2) + (altRet * 2);
		System.out.printf("Perímetro do RETANGULO: %.4f\n", peri);
		
		diag = Math.pow(baseRet, 2) + Math.pow(altRet, 2);
		diag = Math.sqrt(diag);
		System.out.printf("Diagonal do RETANGULO: %.4f", diag);
		
		
		
	}

}
