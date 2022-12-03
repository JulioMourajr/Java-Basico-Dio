package moura.estudos.primeirasemana;

import java.util.Scanner;

public class fatorial {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int numeroFatorial;
    int resultadoFatorial = 1;
    System.out.println("Quer saber o fatorial de qual número? ");
    numeroFatorial = scan.nextInt();
    for (int i = numeroFatorial; i > 1; i--) {
      resultadoFatorial *= i;
      System.out.println(numeroFatorial + "X" + (i - 1));
    }
    System.out.println("O resultado Fatorial do número: " + numeroFatorial + " É " + resultadoFatorial);
  }
}
