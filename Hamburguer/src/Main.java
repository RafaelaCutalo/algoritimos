import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		System.out.println("Monte seu Hamburguer! ");

		String s = null;
		Scanner in = new Scanner(System.in);
		String pedido = "";
		
		System.out.println(" Adicionar bacon? ");
		s = in.next();
		if (s.equals("sim")) {
			System.out.println("Bacon adicionado. ");
			pedido = pedido + "Bacon, ";
		} else {
			System.out.println("Bacon n�o adicionado. ");
		}
		System.out.println(" Adicionar cebola? ");
		s = in.next();
		if (s.equals("sim")) {
			System.out.println("Cebola adicionado. ");
			pedido = pedido + "Cebola, ";
		} else {
			System.out.println("Cebola n�o adicionado. ");
		}
		System.out.println(" Adicionar picles? ");
		s = in.next();
		if (s.equals("sim")) {
			System.out.println("Picles adicionado. ");
			pedido = pedido + "Picles, ";
		} else {
			System.out.println("Picles n�o adicionado. ");
		}
		System.out.println(" Adicionar alface? ");
		s = in.next();
		if (s.equals("sim")) {
			System.out.println("Alface adicionado. ");
			pedido = pedido + "Alface, ";
		} else {
			System.out.println("Alface n�o adicionado. ");
		}
		System.out.println(" Adicionar molho? ");
		s = in.next();
		if (s.equals("sim")) {
			System.out.println("Molho adicionado. ");
			pedido = pedido + "Molho, ";
		} else {
			System.out.println("Molho n�o adicionado. ");
		}
		System.out.println(" Adicionar queijo? ");
		s = in.next();
		if (s.equals("sim")) {
			System.out.println("Queijo adicionado. ");
			pedido = pedido + "Queijo ";
		} else {
			System.out.println("queijo n�o adicionado. ");
		}
		 System.out.println("Seu hamburguer ter�: " + pedido);
		
	}
}
 

