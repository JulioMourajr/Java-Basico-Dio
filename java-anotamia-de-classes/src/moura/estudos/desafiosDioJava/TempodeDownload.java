package moura.estudos.desafiosDioJava;

import java.util.Scanner;

public class TempodeDownload {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Tamanho do arquivo: ");
    double tmhMB = sc.nextFloat();
    System.out.println("Velocidade : ");
    double tmhMbps = sc.nextFloat();
    double segundos = tmhMB / tmhMbps;
    double minutos = segundos / 60;
    System.out.printf("%.2f", minutos);
  }

}
