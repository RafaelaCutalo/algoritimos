import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int n = teclado.nextInt();
		
		System.out.println("Escreva 10 números");
		System.out.println("O número digitado é " + n);
		
		teclado.close();
	}
		
	
}
