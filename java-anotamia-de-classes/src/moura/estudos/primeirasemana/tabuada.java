package moura.estudos.primeirasemana;

import java.util.Scanner;

public class tabuada {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int numero;
    System.out.println("Quer saber a tabuada de qual número?");
    numero = scan.nextInt();

    for (int i = 0; i < 10; i++) {
      int resultado = numero * (i + 1);
      System.out.println(" " + numero + " X " + (i + 1) + " = " + resultado);
    }
  }
}
