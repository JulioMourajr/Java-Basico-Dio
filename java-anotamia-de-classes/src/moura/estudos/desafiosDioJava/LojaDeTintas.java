package moura.estudos.desafiosDioJava;

import java.util.Scanner;

public class LojaDeTintas {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Quantos metros de tinta quer pintar? ");
    double areaCoberta = scanner.nextDouble();
    double litros = Math.ceil(areaCoberta / 6);

    double quantidadeLatas = Math.ceil(litros / 18);
    double quantidadeGaloes = Math.ceil(litros / 3.6);
    int valorLata = 80;
    int valorGalao = 25;
    System.out.println("Vai utlizar " + litros + " Para pintar " + areaCoberta + " m2");

    System.out.println("Quantidade(s) de lata(s) de tinta necessaria(s): " +
        (int) quantidadeLatas + " no valor R$ "
        + quantidadeLatas * valorLata);
    System.out.println("Quantidade(s) de galao(oes) de tinta necessaria(s): " +
        (int) quantidadeGaloes + " no valor R$ "
        + quantidadeGaloes * valorGalao);

  }

}
