public class Mensagem {

    public static void mensagem (int hora){

        if(hora >= 5 && hora <=12){
           System.out.println("Bom dia!");
        }else if(hora >= 13 && hora <=17){
            System.out.println("Boa Tarde!");
        }else{
            System.out.println("Boa noite!");
        };
    }



}
