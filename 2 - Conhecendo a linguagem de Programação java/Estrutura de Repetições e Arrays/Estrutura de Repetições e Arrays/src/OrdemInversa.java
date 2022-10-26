import java.util.Scanner;

public class OrdemInversa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] n = new int[5];
        System.out.println("Digite 5 numeros: ");
        for (int i = 0; i < n.length; i++) {
             n[i] = scanner.nextInt();
        }
        System.out.println("Numeros digitados: ");
        for(int x = (n.length - 1); x >= 0; x--) {
            System.out.println(n[x]);
        }



    }
}
