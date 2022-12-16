package moura.estudos.InterfaceSet;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class ExemploSet {
    public static void main(String[] args) {
        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.4, 5d, 8.3, 3.6, 0d));
        System.out.println("Ordem Aleatoria: ");
        Set<Serie> minhasSeries = new HashSet<Serie>() {
            {
                add(new Serie("HIMYM", "SitCom", 20));
                add(new Serie("Friends", "SitCom", 20));
                add(new Serie("B99", "Comedia", 20));
            }
        };

        for (Serie serie : minhasSeries) {
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " +
                    serie.getTempoEpisodio());
        }

        System.out.println("Ordem de Inserção: ");

        Set<Serie> minhasSeries1 = new LinkedHashSet<Serie>() {
            {
                add(new Serie("Todas as flores", "Novela", 40));
                add(new Serie("Veronica", "drama", 40));
                add(new Serie("HIMYF", "SitCom", 20));
            }
        };

        for (Serie serie : minhasSeries1) {
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " +
                    serie.getTempoEpisodio());
        }

        System.out.println("Ordem natural de tempo de episodio: ");

        Set<Serie> minhaSeries2 = new TreeSet<>(minhasSeries1);
        for (Serie serie : minhaSeries2) {
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " +
                    serie.getTempoEpisodio());

        }

        System.out.println("Ordem nome, Genero e de tempo de episodio: ");
        Set<Serie> minhasSeries3 = new TreeSet<Serie>(new ComparatoNomeGeneroETempoEpisodio());
        minhasSeries3.addAll(minhasSeries);
        for (Serie serie : minhasSeries3) {
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " +
                    serie.getTempoEpisodio());

        }
    }
}

class Serie implements Comparable<Serie> {
    private String nome;
    private String genero;
    private Integer tempoEpisodio;

    public Serie(String nome, String genero, Integer tempoEpisodio) {
        this.nome = nome;
        this.genero = genero;
        this.tempoEpisodio = tempoEpisodio;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Integer getTempoEpisodio() {
        return tempoEpisodio;
    }

    public void setTempoEpisodio(Integer tempoEpisodio) {
        this.tempoEpisodio = tempoEpisodio;
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", genero='" + genero + '\'' +
                ", tempoEpisodio=" + tempoEpisodio +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof Serie))
            return false;
        Serie serie = (Serie) o;
        return Objects.equals(getNome(), serie.getNome()) && Objects.equals(getGenero(), serie.getGenero())
                && Objects.equals(getTempoEpisodio(), serie.getTempoEpisodio());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getGenero(), getTempoEpisodio());
    }

    @Override
    public int compareTo(Serie serie) {
        int tempoEpisodio = Integer.compare(this.getTempoEpisodio(), serie.getTempoEpisodio());
        if (tempoEpisodio != 0)
            return tempoEpisodio;
        return this.getGenero().compareTo(serie.getGenero());

    }
}

class ComparatoNomeGeneroETempoEpisodio implements Comparator<Serie> {
    @Override
    public int compare(Serie s1, Serie s2) {
        int nome = s1.getNome().compareTo(s2.getNome());
        if (nome != 1)
            return nome;
        int genero = s1.getGenero().compareTo(s2.getGenero());
        if (genero != 1)
            return genero;

        return Integer.compare(s1.getTempoEpisodio(), s2.getTempoEpisodio());

    }
}
