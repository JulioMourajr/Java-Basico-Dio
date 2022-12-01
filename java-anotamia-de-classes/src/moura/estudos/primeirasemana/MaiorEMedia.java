package moura.estudos.primeirasemana;

import java.util.Scanner;

public class MaiorEMedia {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int soma = 0;
    double media;
    int numero = 0;
    int i;
    int numeroMaior = 0;
    int numeroMenor = 0;
    for (i = 0; i < 5; i++) {
      System.out.println("Digite um número para a posição: " + (i + 1));
      numero = scan.nextInt();
      soma += numero;
      if (i == 0) {
        numeroMaior = numero;
        numeroMenor = numero;
      } else if (numero > numeroMaior) {
        numeroMaior = numero;
      } else if (numero < numeroMenor) {
        numeroMenor = numero;
      }
    }

    media = soma / i;

    System.out.println("A soma foi " + soma);
    System.out.println("O maior numero digitado foi o " + numeroMaior);
    System.out.println("O menor numero digitado foi o " + numeroMenor);

    System.out.printf("A media foi media: %.2f.%n ", media);

  }

}
