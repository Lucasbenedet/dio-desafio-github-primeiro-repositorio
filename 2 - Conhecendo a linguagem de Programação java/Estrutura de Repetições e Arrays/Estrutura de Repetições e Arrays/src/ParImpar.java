import java.util.Locale;
import java.util.Scanner;
public class ParImpar {
    public static void main(String[] args) {
        
        int n;
        int par = 0;
        int impar = 0;
        int cont = 0;
        int soma = 0;
        int aux;

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Quantos numeros voce quer verificar?");
            aux = scanner.nextInt();
        do{


            System.out.println("Digite os numeros");
            n = scanner.nextInt();

            if((n%2) == 0){
                par++;
            }else{
                impar++;
            }

            soma = soma + n;

            cont++;
        }while(cont < aux); 

        System.out.println("Teve " + par + " numeros pares");
        System.out.println("Teve " + impar + " numeros impar");
        System.out.println("A soma total dos numeros foi " + soma);


    }
}
