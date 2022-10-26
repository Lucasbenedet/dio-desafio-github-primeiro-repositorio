import java.util.Scanner;

public class NumerosAleatorios {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] numeros = new int[20];

        System.out.println("Digite 20 numeros de 0 a 100");

        int count = 0;
        while (count < 20){
            numeros[count] = scan.nextInt();
            count++;
        }

        for (int i = 0; i < 20; i++) {
            System.out.println(numeros[i] + " > " + (numeros[i] + 1));
        }

    }
}
