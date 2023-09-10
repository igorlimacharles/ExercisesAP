package Exercicios;
import java.util.Scanner;

public class MaiorOuMenorQue100 {
	
	public static void main (String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int num;
		
		System.out.print("Digite um número: ");
		num = input.nextInt();
		
		if (num > 100) {
			num = num + 150;
			System.out.println("O resultado da soma é: "+ num);
		} else {
			System.out.println(num);
		}
		
		
		
		input.close();
		
	}

}
