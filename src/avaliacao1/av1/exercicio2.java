package avaliacao1.av1;
import java.util.Scanner;
public class exercicio2 {

	public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
	
	System.out.println("Informe o nome do Produto: ");
	String nome = ler.next();
	
	System.out.println("Informe a qtd. do produto: ");
	int qtdProd = ler.nextInt();
	
	if (qtdProd <= 5) {
    System.out.println("Estoque Crítico!");}
    
	else {
	System.out.println("Estoque Adequado!");
	ler.close();
	}
	
	}

}
