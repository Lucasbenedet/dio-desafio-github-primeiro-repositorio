import java.util.Locale;
import java.util.Scanner;

public class Nota {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        int n = 0;

        while (n == 0) {
            System.out.println("Digite uma nota entre 0 a 10");
            int nota = scanner.nextInt();
            switch(nota){
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                n++;
                break;   
                default: System.out.println("Valor invalido");  
            }
        }
       
    }
}