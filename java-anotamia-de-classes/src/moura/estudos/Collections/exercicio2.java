package moura.estudos.Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class exercicio2 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    List<String> perguntas = new ArrayList<>();
    System.out.println("Vou fazer 5 Perguntas para você, responda com S para Sim e N para Não.");
    System.out.println("1. Telefonou para a vítima?");
    perguntas.add(scan.next());
    System.out.println("2. Esteve no local do crime?");
    perguntas.add(scan.next());
    System.out.println("3. Mora perto da vítima?");
    perguntas.add(scan.next());
    System.out.println("4. Devia para a vítima?");
    perguntas.add(scan.next());
    System.out.println("5. Já trabalhou com a vítima?");
    perguntas.add(scan.next());
    Iterator<String> iterator = perguntas.iterator();
    int somaSim = 0;
    for (String pergunta : perguntas) {
      pergunta.toLowerCase();
      if (pergunta.equals("s")) {
        somaSim++;
      }
    }
    System.out.println("Você disse " + somaSim + " Sim.");
    switch (somaSim) {
      case 0:
        System.out.println("Você é inocente");
        break;
      case 1:
        System.out.println("Você é inocente");
        break;
      case 2:
        System.out.println("Você é Suspeita.");
        break;
      case 3:
        System.out.println("Você é Cumplice.");
        break;
      case 4:
        System.out.println("Você é Cumplice.");
        break;
      case 5:
        System.out.println("Você é Culpada.");
        break;
    }
  }
}
