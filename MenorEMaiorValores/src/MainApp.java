import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int n = teclado.nextInt();
		
		System.out.println("Escreva 10 n�meros");
		System.out.println("O n�mero digitado � " + n);
		
		teclado.close();
	}
		
	
}
