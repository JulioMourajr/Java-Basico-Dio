package moura.estudos.desafiosDioJava;

import java.util.Scanner;

public class AnoBissexto {
  public static void main(String[] args) {
    Scanner ent = new Scanner(System.in);

    System.out.println("Digite o ano: ");
    int ano = ent.nextInt();
    if (ano % 4 == 0 && ano % 100 != 0) {
      System.out.println("O ano " + ano + " é bissexto.");
    } else if (ano % 4 == 0 && ano % 100 == 0 && ano % 400 == 0) {
      System.out.println("O ano " + ano + " é bissexto.");
    } else {
      System.out.println("O ano " + ano + " não é bissexto.");
    }
  }
}
