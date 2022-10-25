import java.util.Locale;
import java.util.Scanner;
public class Fatorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        int x;
        int result = 1;
        System.out.println("Digite um numero para saber seu fatorial");
        x = scanner.nextInt();

        for(int cont = x;cont >= 1; cont --){
            result = result * cont;

        }

        System.out.println("O fatorial de " + x + " é " + result);
    }
}
