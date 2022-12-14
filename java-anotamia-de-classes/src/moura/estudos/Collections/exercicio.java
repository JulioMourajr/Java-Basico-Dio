package moura.estudos.Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class exercicio {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    List<Double> temperaturas = new ArrayList<>();
    List<String> meses = new ArrayList<>();
    meses.add("Janeiro");
    meses.add("Fevereiro");
    meses.add("Março");
    meses.add("Abril");
    meses.add("Maio");
    meses.add("Junho");
    for (int i = 0; i < 6; i++) {
      System.out.println("Digite a temperatura media do mês " + (i + 1) + ".");
      temperaturas.add(scan.nextDouble());
    }
    Double soma = 0d;
    Iterator<Double> iterator = temperaturas.iterator();
    while (iterator.hasNext()) {
      Double proximo = (Double) iterator.next();
      soma += proximo;
    }
    Double media = 0d;
    media = soma / temperaturas.size();
    System.out
        .println("A soma das temperaturas é de " + soma + " e a media  das temperaturas é igual a " + media + " .");
    Iterator<Double> iterator1 = temperaturas.iterator();
    System.out.println(meses);
    int posicao = 0;
    while (iterator1.hasNext()) {
      posicao += 1;
      Double next = iterator1.next();
      if (next > media) {
        System.out.println("A temperatura " + next + " É maior do que a média. No mês " + meses.get(posicao - 1));
      }
    }
  }
}
