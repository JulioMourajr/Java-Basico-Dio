package moura.estudos.InterfaceMap;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class ExemploMap {
  public static void main(String[] args) {
    System.out.println("Crie um dicionario que relacione os modelos e seus respectivos.");
    Map<String, Double> carrosPopulares = new HashMap<String, Double>() {
      {
        put("Celta", 14.4);
        put("Gol", 12.4);
        put("HB20", 13.1);
        put("Fox", 11.4);
      }
    };
    carrosPopulares.put("Gol", 15.2);
    System.out.println(carrosPopulares);
    System.out.println("COnfira se um modelo está no dicionario: " + carrosPopulares.containsKey("Tucson"));

    System.out.println("Modelos: " + carrosPopulares.keySet());

    System.out.println("Qual é o carro mais econômico? ");
    Double melhorConsumo = Collections.max(carrosPopulares.values());
    System.out.println(melhorConsumo);
    Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();
    System.out.println(entries);
    for (Map.Entry<String, Double> entry : entries) {
      if (entry.getValue() == melhorConsumo) {
        System.out.println("O carro mais eficiente é o " + entry.getKey());
        System.out.println(entry.getValue());
      }
    }
    Double piorConsumo = Collections.min(carrosPopulares.values());
    for (Map.Entry<String, Double> entry1 : entries) {
      if (entry1.getValue() == piorConsumo) {
        System.out.println("O carro menos eficiente é o " + entry1.getKey() + " com " + entry1.getValue());
      }
    }
    Iterator<Double> iterator = carrosPopulares.values().iterator();
    Double soma = 0d;
    while (iterator.hasNext()) {
      soma += iterator.next();
    }
    Double media = soma / carrosPopulares.size();
    System.out.println("A soma foi de " + soma);
    System.out.println("E a media foi de " + media);
    System.out.println(carrosPopulares);
    Iterator<Double> iterator1 = carrosPopulares.values().iterator();
    while (iterator1.hasNext()) {
      if (iterator1.next().equals(13.1)) {
        iterator1.remove();
      }
    }
    System.out.println(carrosPopulares);

    Map<String, Double> carrosPopulares1 = new LinkedHashMap<String, Double>() {
      {
        put("Celta", 14.4);
        put("Gol", 12.4);
        put("HB20", 13.1);
        put("Fox", 11.4);
      }
    };
    System.out.println(carrosPopulares1);
  }
}
