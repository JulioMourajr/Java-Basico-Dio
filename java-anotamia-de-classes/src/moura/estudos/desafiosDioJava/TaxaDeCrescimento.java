package moura.estudos.desafiosDioJava;

import java.util.Scanner;

public class TaxaDeCrescimento {
  public static void main(String[] args) {
    int paisA, paisB;

    Scanner input = new Scanner(System.in);
    System.out.println("Digite a população do pais A? ");
    paisA = input.nextInt();
    System.out.println("Digite a população do pais B? ");
    paisB = input.nextInt();

    while (paisA > paisB) {
      System.out.println("Digite a população do pais A menor que a do pais B.");
      System.out.println("Digite a população do pais A? ");
      paisA = input.nextInt();
      System.out.println("Digite a população do pais B? ");
      paisB = input.nextInt();
    }

    int anos = 0;

    while (paisB > paisA) {
      paisA += paisA * 0.03;
      paisB += paisB * 0.015;
      System.out.println("População do pais A: " + paisA);
      System.out.println("População do pais B: " + paisB);
      System.out.println(anos);
      anos += 1;
    }

    System.out.println("A população do pais A é  " + paisA + " e a do pais B: " + paisB);
    System.out.println("Foi ultrapassado em " + anos + " anos!");

  }
}
