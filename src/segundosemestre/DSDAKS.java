package segundosemestre;
import java.util.Scanner;
public class DSDAKS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = new int[5];
		int somaVetor = 0;
		
		Scanner ler = new Scanner(System.in);
		
		for (int i = 0; i<5; i++) {
			System.out.println("Informe um valor" + i+ "..:");                        
			a[i] = ler.nextInt();  
			somaVetor = somaVetor + a[i];
		}
		System.out.println(somaVetor);
	}

}
