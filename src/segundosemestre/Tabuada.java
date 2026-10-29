package segundosemestre;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int n, resultado;
		
		System.out.println("Informe um número para a tabuada: ");
		n= ler.nextInt();
		
		for(int i=1; i <= 10; i++) {
			resultado = n*i;
			System.out.println(n + "x" + n + "=" + resultado);
		}
		ler.close();
	}

}
