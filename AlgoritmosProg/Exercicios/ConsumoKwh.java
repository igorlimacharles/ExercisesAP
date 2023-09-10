package Exercicios;

import java.util.Scanner;

public class ConsumoKwh {
	
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		double ValorMinimo = 11.90;
		double ValorConta = 0.0;
		double ConsumoKwh;
		
		System.out.print("Digite o consumo de KWH: ");
		ConsumoKwh = input.nextFloat();
		
		if (ConsumoKwh < 150) {
			ValorConta = ConsumoKwh * 0.20;
		} else if (ConsumoKwh >= 150 && ConsumoKwh < 500) {
			ValorConta = ConsumoKwh * 0.25;
		} else if (ConsumoKwh >= 500) {
			ValorConta = ConsumoKwh * 0.30;
		}

		if (ValorConta < ValorMinimo) {
            ValorConta = ValorMinimo;
        }

		System.out.println("O valor da sua conta é de R$ " + ValorConta);
		
		input.close();
	}
}