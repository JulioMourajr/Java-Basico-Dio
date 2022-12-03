package moura.estudos.segundasemana;

import java.util.Random;

public class ArrayMultidimensional {
  public static void main(String[] args) {
    Random random = new Random();
    int[][] matriz = new int[4][4];
    for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz[i].length; j++) {
        int numeroAleatorio = random.nextInt(9);
        matriz[i][j] = numeroAleatorio;
      }
    }

    System.out.println("Matriz: ");

    for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz[i].length; j++) {
        System.out.print(matriz[i][j] + " ");
      }
      System.out.println(" ");
    }
  }
}
