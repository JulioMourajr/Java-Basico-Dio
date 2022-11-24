package moura.estudos.segundasemana;

import java.util.Scanner;

public class IMC {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    float peso;
    float altura;
    System.out.println("Qual é o seu peso?");
    peso = scanner.nextFloat();
    System.out.println("Qual é a sua altura?");
    altura = scanner.nextFloat();
    double IMC = peso / (altura * altura);
    System.out.println(IMC);
  }
}
