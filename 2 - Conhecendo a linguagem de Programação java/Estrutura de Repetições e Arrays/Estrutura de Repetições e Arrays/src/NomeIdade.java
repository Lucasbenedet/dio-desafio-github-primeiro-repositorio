import java.util.Locale;
import java.util.Scanner;

public class NomeIdade {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);


        while (true){
            System.out.println("Digite o nome do aluno");
            String nome = scanner.next();
            if(nome.equals("0")){
                System.out.println("Fim de codigo");
                break;
            }
            System.out.println("Digite a idade do aluno");
            int idade = scanner.nextInt();

            System.out.println("Aluno Cadastrado : nome "+ nome +" Idade " + idade);

          
        }
    }
}
