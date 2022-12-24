package moura.estudos.InterfaceStream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

import javax.sound.sampled.SourceDataLine;

import moura.estudos.segundasemana.NumerosAleatorios;

public class StreamApi {
  public static void main(String[] args) {
    List<String> numerosAleatorios = Arrays.asList("0", "4", "1", "2", "3", "9", "9", "6", "5");

    numerosAleatorios.forEach(System.out::println);

    System.out.println("Pegue os primeiros 5 numeros e coloque dentro de um Set.");

    numerosAleatorios.stream()
        .limit(5)
        .collect(Collectors.toSet())
        .forEach(System.out::println);

    System.out.println("Transformar essa String para inteiro");
    // colocando em uma variável.
    List<Integer> list = numerosAleatorios.stream()
        .map(Integer::parseInt)
        .collect(Collectors.toList());

    System.out.println("Pegue os numeros pares maiores que 2 e coloque numa lista.");

    numerosAleatorios.stream().map(Integer::parseInt).filter(i -> i % 2 == 0 && i > 2).collect(Collectors.toList())
        .forEach(System.out::println);

    System.out.println("Média dos números: ");

    numerosAleatorios.stream().mapToInt(Integer::parseInt).average().ifPresent(System.out::println);

    List<Integer> numerosRandom = numerosAleatorios.stream().map(Integer::parseInt).collect(Collectors.toList());

    numerosRandom.removeIf(i -> i % 2 != 0);
    System.out.println(numerosRandom);
  }
}
