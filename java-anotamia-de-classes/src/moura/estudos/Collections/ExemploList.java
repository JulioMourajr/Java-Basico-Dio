package moura.estudos.Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploList {
  /**
   * @param args
   */
  public static void main(String[] args) {
    /*
     * List<Double> notas = new ArrayList<>();
     * notas.add(7d);
     * notas.add(8.5);
     * notas.add(9.3);
     * notas.add(5.0);
     * notas.add(7.0);
     * notas.add(0.0);
     * notas.add(3.6);
     * System.out.println(notas.indexOf(7d)); // nota da posição 7
     * notas.add(4, 8.0);
     * notas.set(3, 6.0);
     * System.out.println(notas);
     * System.out.println("A notas 5 está na lista, " + notas.contains(5d));
     * /*
     * for (Double nota : notas) {
     * System.out.println(" A nota é " + nota);
     * }
     */
    /*
     * System.out.println("A menor nota é, " + Collections.min(notas));
     * System.out.println("A maior nota é, " + Collections.max(notas));
     * Iterator<Double> iterator = notas.iterator();
     * Double soma = 0d;
     * while (iterator.hasNext()) {
     * Double next = iterator.next();
     * soma += next;
     * }
     * Double media = soma / notas.size();
     * System.out.println("A media é, " + media);
     * Iterator<Double> iterator1 = notas.iterator();
     * while (iterator1.hasNext()) {
     * Double next = iterator1.next();
     * if (next < 7) {
     * iterator1.remove();
     * }
     * }
     * System.out.println(notas);
     */
    List<Gatos> meusGatos = new ArrayList<Gatos>() {
      {
        add(new Gatos("Jon", 12, "preto"));
        add(new Gatos("Simba", 6, "tigrado"));
        add(new Gatos("Jon", 18, "amarelo"));
      }
    };

    System.out.println(meusGatos);
    Collections.shuffle(meusGatos);
    System.out.println(meusGatos);
    Collections.sort(meusGatos);
    System.out.println(meusGatos);

  }
}

class Gatos implements Comparable<Gatos> {
  private String nome;
  private int idade;
  private String cor;

  public Gatos(String nome, int idade, String cor) {
    this.nome = nome;
    this.idade = idade;
    this.cor = cor;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public int getIdade() {
    return idade;
  }

  public void setIdade(int idade) {
    this.idade = idade;
  }

  public String getCor() {
    return cor;
  }

  public void setCor(String cor) {
    this.cor = cor;
  }

  @Override
  public String toString() {
    return "[nome=" + nome + ", idade=" + idade + ", cor=" + cor + "]";
  }

  @Override
  public int compareTo(Gatos gato) {
    // TODO Auto-generated method stub
    return this.getNome().compareToIgnoreCase(gato.getNome());
  }

}
