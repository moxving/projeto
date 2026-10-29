package segundosemestre;
import java.util.Scanner;
public class Vetores {

	public static void main(String[] args) {
	int a[] = new int[5];
	int b[] = new int[5];
	
	Scanner ler = new Scanner(System.in);
	
	for (int i = 0; i < 5; i++) {
		System.out.println("INFORME OS NÚMEROS ");
		a[i] = ler.nextInt();
	}
	for (int i = 0; i < 5; i++) {
		System.out.println("INFORME OUTROS NÚMEROS ");
		b[i] = ler.nextInt();
	}
	}

}
