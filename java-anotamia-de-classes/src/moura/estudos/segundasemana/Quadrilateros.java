package moura.estudos.segundasemana;

public class Quadrilateros {
  public static double area(double lado) {
    System.out.println("A area do quadrado é ");
    return lado * lado;
  }

  public static double area(double altura, double largura) {
    System.out.println("A area do retângulo é ");
    return altura * largura;
  }

  public static double area(int baseMaior, int baseMenor, int altura) {
    System.out.println("A area do losango é ");
    return (baseMaior + baseMenor) * altura / 2;
  }
}
