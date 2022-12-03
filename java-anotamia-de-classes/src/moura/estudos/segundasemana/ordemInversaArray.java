package moura.estudos.segundasemana;

public class ordemInversaArray {
  public static void main(String[] args) {
    int[] vetor = { 2, 13, 22, 7, 15, 30 };

    for (int i = vetor.length - 1; i >= 0; i--) {
      System.out.println(vetor[i]);
    }
  }
}
