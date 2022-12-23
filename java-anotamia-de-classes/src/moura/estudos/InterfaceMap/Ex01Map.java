package moura.estudos.InterfaceMap;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Ex01Map {
  public static void main(String[] args) {
    System.out.println("Crie um dicionário que relacione os estados e suas respectivas populações: ");
    Map<String, Integer> populaçãoEstadosNE = new HashMap<String, Integer>() {
      {
        put("PE", 9616621);
        put("AL", 3351543);
        put("CE", 9187103);
        put("RN", 3534265);
      }
    };
    for (Map.Entry<String, Integer> estado : populaçãoEstadosNE.entrySet()) {
      System.out.println("Estado: " + estado.getKey() + " - habitantes: " + estado.getValue());
    }
    System.out.println("Mudando a população do Rio Grande do Norte! ");
    populaçãoEstadosNE.put("RN", 3534165);
    for (Map.Entry<String, Integer> estado : populaçãoEstadosNE.entrySet()) {
      System.out.println("Estado: " + estado.getKey() + " - habitantes: " + estado.getValue());
    }
    if (populaçãoEstadosNE.containsKey("PB")) {
      System.out.println("PB está adicionada.");
    } else {
      populaçãoEstadosNE.put("PB", 4039277);
    }
    System.out.println("Adicionando PB!");
    for (Map.Entry<String, Integer> estado : populaçãoEstadosNE.entrySet()) {
      System.out.println("Estado: " + estado.getKey() + " - habitantes: " + estado.getValue());
    }
    int populacaoPE = populaçãoEstadosNE.get("PE");
    System.out.println("A população de Pernambuco é : " + populacaoPE);

    System.out.println("Informar na ordem que foi inserido!");

    Map<String, Integer> populaçãoEstadosNE1 = new LinkedHashMap<String, Integer>() {
      {
        put("PE", 9616621);
        put("AL", 3351543);
        put("CE", 9187103);
        put("RN", 3534265);
        put("PB", 4039277);
      }
    };
    for (Map.Entry<String, Integer> estados : populaçãoEstadosNE1.entrySet()) {
      System.out.println("Estado: " + estados.getKey() + " - habitantes: " + estados.getValue());
    }

    System.out.println("--\tEm ordem alfabetica!\t--");
    Map<String, Integer> populaçãoEstadosNE2 = new TreeMap<String, Integer>(populaçãoEstadosNE1);
    for (Map.Entry<String, Integer> estados : populaçãoEstadosNE2.entrySet()) {
      System.out.println("Estado: " + estados.getKey() + " - habitantes: " + estados.getValue());
    }

    int menorPopulação = Collections.min(populaçãoEstadosNE.values());
    int maiorPopulação = Collections.max(populaçãoEstadosNE.values());

    for (Map.Entry<String, Integer> estados : populaçãoEstadosNE.entrySet()) {
      if (estados.getValue() == menorPopulação) {
        System.out.println("A menor População é de : " + estados.getKey() + " - habitantes: " + estados.getValue());
      }
    }

    for (Map.Entry<String, Integer> estados : populaçãoEstadosNE.entrySet()) {
      if (estados.getValue() == maiorPopulação) {
        System.out.println("A maior População é de : " + estados.getKey() + " - habitantes: " + estados.getValue());
      }
    }

    Iterator<Integer> iterator = populaçãoEstadosNE.values().iterator();
    int soma = 0;
    int media;
    while (iterator.hasNext()) {
      soma += iterator.next();
    }
    System.out.println("A soma é : " + soma);
    media = soma / populaçãoEstadosNE.size();
    System.out.println("A media é : " + media);

    Iterator<Integer> iterator1 = populaçãoEstadosNE.values().iterator();
    while (iterator1.hasNext()) {
      if (iterator1.next() < 4000000) {
        iterator1.remove();
      }
    }

    for (Map.Entry<String, Integer> estados : populaçãoEstadosNE.entrySet()) {
      System.out.println("Estado: " + estados.getKey() + " - habitantes: " + estados.getValue());
    }

    populaçãoEstadosNE.clear();
    String resposta = " ";

    if (populaçãoEstadosNE.isEmpty()) {
      resposta = "Sim.";
    } else {
      resposta = "Não.";
    }
    System.out.println("O dicionario está vazio? " + resposta);
  }
}
