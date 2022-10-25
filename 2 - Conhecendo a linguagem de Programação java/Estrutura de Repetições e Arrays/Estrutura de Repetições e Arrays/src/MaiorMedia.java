import java.util.Locale;
import java.util.Scanner;
public class MaiorMedia {

    public static void main(String[] args) {
        int x = 0;
        int maior = 0;
        int media = 0;
        int n1;
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        do{
            System.out.println("Digite o primeiro numero");
            n1 = scanner.nextInt();

            if(n1 > maior ){
                maior = n1;
            }

            media = media + n1;
    
    
            x++;
        }while(x<5);

        System.out.println("O maior numero digitado foi "+ maior);
        System.out.println("A media desses numeros foi "+ (media/5));
    }
   
}
