package moura.estudos.primeirasemana;

public class MinhaClasse {
  public static void main(String[] args) {
    System.out.println("Olá, Mundo!");
    final String nomePais = "Brasil";
    System.out.println(nomePais);

    String nomeCompleto = nomeCompleto("Julio", "MOura");
    System.out.println(nomeCompleto);

  }

  public static String nomeCompleto(String primeiroNome, String segundoNome) {
    return primeiroNome.concat(" ").concat(segundoNome);
  }

}
