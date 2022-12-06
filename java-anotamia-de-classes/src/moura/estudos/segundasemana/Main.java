package moura.estudos.segundasemana;

public class Main {
  public static void main(String[] args) {
    calculadora.somar(4, 6);
    calculadora.subtrair(7, 2);
    HoraAtual.horaAtual();
    double areaQuadrado = Quadrilateros.area(4);
    System.out.println(areaQuadrado);
    double areaRetangulo = Quadrilateros.area(4, 5);
    System.out.println(areaRetangulo);
    double areaLosango = Quadrilateros.area(4, 5, 6);
    System.out.println(areaLosango);

  }
}
