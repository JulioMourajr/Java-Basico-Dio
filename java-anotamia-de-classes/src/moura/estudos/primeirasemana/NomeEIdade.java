package moura.estudos.primeirasemana;

import java.util.Scanner;

public class NomeEIdade {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String nome = "";
    int idade = 0;
    int opcao = 1;
    while (opcao != 0) {
      System.out.println("Digite Seu nome? ");
      nome = scan.next();
      System.out.println("Sua Idade? ");
      idade = scan.nextInt();
      System.out.println("Digite 0 para sair!");
      opcao = scan.nextInt();
    }
    System.out.println("Seu nome é " + nome);
    System.out.println("Sua idade é " + idade);
  }
}
