import java.util.Scanner;

public class Consoantes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] letra = new String[6];
        int count = 0;
        System.out.println("Digite 6 caracteres : ");
        for (int i = 0; i < 6; i++) {
            letra[i] = scan.next();
            switch (letra[i]) {
                case "a":
                case "e":
                case "i":
                case "o":
                case "u":
                    break;
                default:
                count++;
                    break;
            }
        }
        System.out.println(count + " das letras digitadas são consoantes");
        System.out.println("Consoantes digitadas : ");
        for (int i = 0; i < 6; i++) {
            switch (letra[i]) {
                case "a":
                case "e":
                case "i":
                case "o":
                case "u":
                    break;
                default:
                System.out.println(letra[i]);
                    break;
            }
        }







    }
}
