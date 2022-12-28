package moura.estudos.desafiosDioJava;

import java.util.Scanner;

public class Escada {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite uma palavra: ");
    String palavra = scanner.next();
    for (int i = 0; i < palavra.length(); i++) {
      String letra = " ";
      letra += palavra.substring(0, i + 1);
      System.out.println(letra);
    }
  }
}