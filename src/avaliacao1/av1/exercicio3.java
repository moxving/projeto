package avaliacao1.av1;
import java.util.Scanner;
public class exercicio3 {

	public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
	
	System.out.println("informe a classificação do Estoque\n");
	System.out.println("1 - Estoque crítico\n2 - Estoque baixo\n3 - Estoque cheio médio\n4 - Estoque alto\n5 - Estoque \n");

	int status = ler.nextInt();
	
	switch (status) {
	
	case 1:
	System.out.println("Estoque Crítico");
	break;
	
	case 2:
	System.out.println("Estoque baixo");
	break;
	
	case 3:
		System.out.println("Etoque médio");
	break;
	
	case 4:
	System.out.println("Estoque alto");
	break;
	
	case 5:
	System.out.println("Estoque cheio");
	break;
	
	default:
	System.out.println("Opção Invalida!");
		
	
	ler.close();
	}
	
	}

}
