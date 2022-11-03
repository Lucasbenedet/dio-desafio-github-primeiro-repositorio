package Interface;

public class Calculadora implements Operador{

    @Override
    public void soma(double n1,double n2){
        System.out.println(n1 + n2);

    }
    @Override
    public void subtracao(double n1,double n2){
        System.out.println(n1 - n2);

    }
    @Override
    public void divisao(double n1,double n2){
        System.out.println(n1 / n2);

    }
    @Override
    public void multiplica(double n1,double n2){
        System.out.println(n1 * n2);

    }
    
}
