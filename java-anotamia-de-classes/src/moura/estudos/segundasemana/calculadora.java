package moura.estudos.segundasemana;

public class calculadora {

  public static void somar(double numero1, double numero2) {
    double soma = numero1 + numero2;
    System.out.println("A soma entre o " + numero1 + " O " + numero2 + " É = " + soma);
  }

  public static void subtrair(double numero1, double numero2) {
    double sub = numero1 - numero2;
    System.out.println("A subtração entre o " + numero1 + " O " + numero2 + " É = " + sub);
  }

  public static void divisao(int numero1, int numero2) {
    int div = numero1 / numero2;
    System.out.println("A divisão entre o " + numero1 + " O " + numero2 + " É = " + div);
  }

  public static void multiplicar(int numero1, int numero2) {
    int multi = numero1 * numero2;
    System.out.println("A multiplicação entre o " + numero1 + " O " + numero2 + " É = " + multi);
  }

}