

public class Emprestimo {

    public static void emprestimo(double valorSolicitado, int parcela){

        double resultado = 0.0;

        if(parcela > 1 && parcela <7){
            resultado = valorSolicitado * 1.15;
        }else if(parcela > 6){
           resultado = valorSolicitado * 1.30;
        };

        System.out.println("O emprestimo ficara com " + parcela + " parcelas de R$" + (resultado/parcela) + "");

        
    }
}
