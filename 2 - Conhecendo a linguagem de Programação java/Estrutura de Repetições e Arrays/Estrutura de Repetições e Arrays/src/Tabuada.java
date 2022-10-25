import java.util.Locale;
import java.util.Scanner;
public class Tabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        int x;

        System.out.println("Digite um numero de 1 a 10");
        x = scanner.nextInt();
        System.out.println("Tabuada de " + x + " : ");
        for(int cont = 0;cont < 10;){
            cont++;
            System.out.println("Tabuada de " + x + " : ");
            System.out.println(x + " X " + cont + " = " + (x*cont));


        }





    }
}
