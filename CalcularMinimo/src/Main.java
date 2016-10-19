//import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		int [] a = new int[10];
		a[0] = 100;
		a[1] = 500;
		a[2] = 30;
		a[3] = 200;
		a[4] = 10;
		a[5] = 5;
		a[6] = 700;
		a[7] = 900;
		a[8] = 90;
		a[9] = 2;
		int valorMinimo = Util.min(a);
		System.out.println(valorMinimo);
		int valorMaximo = Util.max(a);

	System.out.println(valorMaximo);

	}
}