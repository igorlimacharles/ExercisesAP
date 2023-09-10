package Exercicios;
import java.util.Scanner;
// import java.text.DecimalFormat;

public class GrauObesidade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // DecimalFormat NumeroMassa = new DecimalFormat("#.00");

        float massa;
        int peso;
        float altura;

        System.out.println("Digite a sua altura: ");
        altura = input.nextFloat();

        System.out.println("Digite o seu peso: ");
        peso = input.nextInt();

        massa = (peso / (altura * altura));

        // String NumMassa = NumeroMassa.format(massa);

        // float MassaNumeral = Float.parseFloat(NumMassa);

        if (massa < 26) {
            System.out.println("A sua massa corporal: " + massa + " está dentro do normal (26)");
        } else if (massa >= 26 && massa < 30) {
            System.out.println("A sua massa corporal: " + massa + " ultrapassa o grau normal (26). Você está obeso");
        } else {
            System.out.println("A sua massa corporal: " + massa + " ultrapassa o grau normal e de obeso (26). Você está obeso mórbido");
        }
        input.close();
    }
}