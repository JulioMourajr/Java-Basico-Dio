package moura.estudos.primeirasemana;

import java.util.Scanner;

public class ParEImpar {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int numVezes;
    int numeros;
    int qtdPares = 0;
    int qtdImpares = 0;

    System.out.println("Quantos números você quer digitar? ");
    numVezes = scan.nextInt();
    for (int i = 0; i < numVezes; i++) {
      System.out.println("Digite o número: " + (i + 1));
      numeros = scan.nextInt();
      System.out.println("Numero digitado foi o " + numeros);
      if (numeros % 2 == 0) {
        qtdPares++;
      } else {
        qtdImpares++;
      }
    }
    System.out.println("Numeros pares digitados foi de " + qtdPares);
    System.out.println("Numeros impares digitados foi de " + qtdImpares);

  }

}
