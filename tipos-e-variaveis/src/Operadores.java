import java.util.Scanner;

public class Operadores {
  public static void main(String[] args) {
    String nome = "LINGUAGEM" + "JAVA";

    String concatenacao = "?";

    concatenacao = 1 + 1 + 1 + "1";
    System.out.println(nome);
    System.out.println(concatenacao);

    concatenacao = 1 + "1" + 1 + 1;
    System.out.println(nome);
    System.out.println(concatenacao);

    concatenacao = 1 + "1" + 1 + "1";
    System.out.println(nome);
    System.out.println(concatenacao);

    concatenacao = "1" + 1 + 1 + 1;
    System.out.println(nome);
    System.out.println(concatenacao);

    concatenacao = "1" + (1 + 1 + 1);
    System.out.println(nome);
    System.out.println(concatenacao);

    int numero;
    Scanner leitor = new Scanner(System.in);
    System.out.println("Digite um número: ");
    numero = leitor.nextInt();
    String result = (numero % 2 == 0) ? "O número digitado é par!" : "O número digitado é impar!";
    System.out.println(result);
  }

}
