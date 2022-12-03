package moura.estudos.segundasemana;

import java.util.Scanner;

public class Consoantes {
  public static void main(String[] args) {
    String[] letras = new String[6];
    Scanner scan = new Scanner(System.in);
    for (int i = 0; i < letras.length; i++) {
      System.out.println("Digite uma consoante? ");
      letras[i] = scan.nextLine();
      switch (letras[i]) {
        case "a":
          System.out.println("Você digitou uma vogal; ");
          letras[i] = " ";
          break;
        case "e":
          System.out.println("Você digitou uma vogal; ");
          letras[i] = " ";
          break;
        case "i":
          System.out.println("Você digitou uma vogal; ");
          letras[i] = " ";
          break;
        case "o":
          System.out.println("Você digitou uma vogal; ");
          letras[i] = " ";
          break;
        case "u":
          System.out.println("Você digitou uma vogal; ");
          letras[i] = " ";
          break;
      }
    }

    for (int i = 0; i < letras.length; i++) {
      System.out.println(letras[i]);
    }
  }
}

/*
 * letras[0] = 'b' - assim.
 * a professora usou o metodo equalsIgnoreCase
 */