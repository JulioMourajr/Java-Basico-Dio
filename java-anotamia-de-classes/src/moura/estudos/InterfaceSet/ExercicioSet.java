package moura.estudos.InterfaceSet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class ExercicioSet {
  public static void main(String[] args) {
    System.out.println("Crie uma conjunto contendo as cores do arco-íris: ");
    Set<String> coresArcoIris = new HashSet<>();
    coresArcoIris.add("violeta");
    coresArcoIris.add("anil");
    coresArcoIris.add("azul");
    coresArcoIris.add("verde");
    coresArcoIris.add("amarelo");
    coresArcoIris.add("laranja");
    coresArcoIris.add("vermelho");
    System.out.println(coresArcoIris);

    System.out.println("Exiba todas as cores o arco-íris uma abaixo da outra: ");
    for (String cor : coresArcoIris) {
      System.out.println(cor);
    }

    System.out.println("O arcoiris tem " + coresArcoIris.size() + " cores.");

    System.out.println("As cores em ordem Alfabetica.");

    Set<String> cores = new TreeSet<String>(coresArcoIris);

    for (String cor : cores) {
      System.out.println(cor);
    }

    Set<String> cores1 = new LinkedHashSet<String>(
        Arrays.asList("violeta", "anil", "azul", "verde", "amarelo", "laranja", "vermelho"));
    System.out.println(cores1);
    List<String> cores2 = new ArrayList<>(cores1);
    Collections.reverse(cores2);
    System.out.println("As cores em ordem Inversa.");
    System.out.println(cores2);

    System.out.println("As cores que começam com a  letra V.");
    for (String cor : cores) {
      if (cor.startsWith("v")) {
        System.out.println(cor);
      }
    }

    System.out.println("Remova todas as cores que não começam com a letra “v”: ");

    Iterator<String> iterator = coresArcoIris.iterator();
    while (iterator.hasNext()) {
      if (iterator.next().startsWith("v"))
        iterator.remove();
      System.out.println(coresArcoIris);
    }
  }
}