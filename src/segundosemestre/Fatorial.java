package segundosemestre;

import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int m;
		int resultado = 1;
		
		System.out.println("Informe um número para o fatorial : ");
		m = ler.nextInt();
		
		for(int i=1; i <= m; i++) {
			resultado *= i;
			
		}
		System.out.println("O fatorial de " + m + "é " + resultado);
		ler.close();
	}

}
