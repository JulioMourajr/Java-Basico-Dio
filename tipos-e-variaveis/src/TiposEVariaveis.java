
public class TiposEVariaveis {
    public static void main(String[] args) {
        String nome = args[0];
        String sobrenome = args[1];
        final int idade = Integer.valueOf(args[2]);

        System.out.println("Ola, me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos ");

    }
}
