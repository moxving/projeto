package avaliacao1.av1;
import java.util.Scanner;
public class exercicio1 {

	public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
	
	System.out.print("informe a base do triangulo: ");
	double base = ler.nextInt();
	
	System.out.print("informe a altura: ");
	double altura = ler.nextInt();
	
	double area = (base*altura)/2;
	
	System.out.println("\nA área do triangulo é: " + area);
	ler.close();

	}

}
