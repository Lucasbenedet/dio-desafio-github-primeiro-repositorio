public class Quadrilateros {
    public static void area(int lado) {
        System.out.println("A area de um quadrado é " + lado*lado);
    }
    public static void area(int base, int altura) {
        System.out.println("A area de um retangulo é " + base * altura);
    }
    public static void area(int base1,int base2, int altura) {
        System.out.println("A area de um Trapezio é " + ((base1 + base2)* altura)/2);
    }
}
