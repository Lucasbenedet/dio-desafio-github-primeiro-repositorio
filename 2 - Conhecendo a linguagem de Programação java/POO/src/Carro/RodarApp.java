package Carro;
public class RodarApp {
    public static void main(String[] args) {
        
        Carro carro1 = new Carro();

        carro1.setCor("Azul");
        carro1.setModelo("AudiTT");
        carro1.setCapTanque(50);

        System.out.println(carro1.getCapTanque());
        System.out.println(carro1.getModelo());
        System.out.println(carro1.getCor());
        System.out.println(carro1.totalValorTanque(5.5));

        Carro carro2 = new Carro("Branco","Porshe",100);

        System.out.println(carro2.getCapTanque());
        System.out.println(carro2.getModelo());
        System.out.println(carro2.getCor());
        System.out.println(carro2.totalValorTanque(5.5));



    }
}
