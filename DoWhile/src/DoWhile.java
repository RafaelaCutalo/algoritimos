import java.util.Scanner;

public class DoWhile {
	
	public static void main(String[] args){
		Scanner s = new Scanner (System.in);
		int v;
		do{
			System.out.print("Digite o valor:");
			v = s.nextInt();
		} while (v != -1);
		System.out.print("Fim.");
		s.close();
	}

}
