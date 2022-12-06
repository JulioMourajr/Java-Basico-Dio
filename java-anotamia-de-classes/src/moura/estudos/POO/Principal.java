package moura.estudos.POO;

public class Principal {
  public static void main(String[] args) {
    Carro fiat = new Carro();
    fiat.ano = 2020;
    fiat.nome = "Mobi";
    fiat.setCapacidadeTanque(47);
    double calculo = fiat.calcularGasto(5);
    System.out.println(calculo);
    System.out.println(fiat.ano);
    /*
     * System.out
     * .println("Para encher o tanque de " + fiat.getCapacidadeTanque() +
     * "litros, se gasta " + calculo + " R$.");
     */

    Carro ferrari = new Carro("Ferrari", 2022);
  }
}
