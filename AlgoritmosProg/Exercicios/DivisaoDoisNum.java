package Exercicios;
import java.util.Scanner;

public class DivisaoDoisNum {
	
	public static void main (String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int n1; int n2;
		
		System.out.print("Digite o número 1: ");
		n1 = input.nextInt();
		
		System.out.print("Digite o número 2: ");
		n2 = input.nextInt();
		
		if (n1 % n2 == 0) {
			System.out.println("A divisão de " + n1 + " por " + n2 + " é exata!");
		} else {
			System.out.println("A divisão de " + n1 + " por " + n2 + " NÃO é exata!");
		}
		
		input.close();
		
	}

}
