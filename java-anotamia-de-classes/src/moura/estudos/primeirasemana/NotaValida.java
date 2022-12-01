package moura.estudos.primeirasemana;

import java.util.Scanner;

public class NotaValida {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int nota = -1;
    System.out.println("Digite uma nota entre 0 e 10. ");
    while (nota < 0 || nota > 10) {
      System.out.println("Digite uma nota valida entre 0 e 10. ");
      nota = scan.nextInt();
    }
    System.out.println("A nota validada digitada foi  " + nota);
  }

}
