import java.util.Scanner;

public class TiposEVariaveis {
    public static void main(String[] args) {
        String nome = "";
        String sobrenome = "";
        int idade = 0;

        Scanner leitor = new Scanner(System.in);
        System.out.println("Qual é o seu nome? ");
        nome = leitor.next();

        System.out.println("Qual é o seu sobrenome? ");
        sobrenome = leitor.next();

        System.out.println("Qual é a sua idade? ");
        idade = leitor.nextInt();
        System.out.println("Ola, me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos.");

    }
}
