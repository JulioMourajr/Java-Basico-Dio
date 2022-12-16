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

public class ExercicioSet2 {
  public static void main(String[] args) {
    Set<LinguagemFavorita> linguagens = new HashSet<LinguagemFavorita>() {
      {
        add(new LinguagemFavorita("JavaScript", 1995, "VisualStudioCode"));
        add(new LinguagemFavorita("Java", 1991, "Intellij"));
        add(new LinguagemFavorita("Python", 1989, "NetBeans"));
      }
    };

    for (LinguagemFavorita linguagem : linguagens) {
      System.out.println(linguagem.getNome() + " - " + linguagem.getAnoDeCriacao() + " - " + linguagem.getIde());
    }

    System.out.println("Ordem de Inserção: ");
    Set<LinguagemFavorita> linguagens1 = new LinkedHashSet<LinguagemFavorita>() {
      {
        add(new LinguagemFavorita("JavaScript", 1995, "VisualStudioCode"));
        add(new LinguagemFavorita("Java", 1991, "Intellij"));
        add(new LinguagemFavorita("Python", 1989, "NetBeans"));

      }
    };

    for (LinguagemFavorita linguagem : linguagens1) {
      System.out.println(linguagem.getNome() + " - " + linguagem.getAnoDeCriacao() + " - " + linguagem.getIde());
    }

    System.out.println("Ordem natural do nome: ");
    Set<LinguagemFavorita> linguagens2 = new TreeSet<LinguagemFavorita>(linguagens1);

    for (LinguagemFavorita linguagem : linguagens2) {
      System.out.println(linguagem.getNome() + " - " + linguagem.getAnoDeCriacao() + " - " + linguagem.getIde());
    }

    System.out.println("Ordem pela IDE: ");
    Set<LinguagemFavorita> linguagens3 = new TreeSet<LinguagemFavorita>(new ComparatorIde());
    linguagens3.addAll(linguagens);

    for (LinguagemFavorita linguagem : linguagens3) {
      System.out.println(linguagem.getNome() + " - " + linguagem.getAnoDeCriacao() + " - " + linguagem.getIde());
    }

    System.out.println("Ordem pelo Ano de Criacao e nome: ");
    Set<LinguagemFavorita> linguagens4 = new TreeSet<LinguagemFavorita>(new ComparatorAnoDeCriacaoENome());
    linguagens4.addAll(linguagens);

    for (LinguagemFavorita linguagem : linguagens4) {
      System.out.println(linguagem.getNome() + " - " + linguagem.getAnoDeCriacao() + " - " + linguagem.getIde());
    }
    System.out.println("Ordem pelo Nome, Ano de Criacao e ide: ");
    Set<LinguagemFavorita> linguagens5 = new TreeSet<LinguagemFavorita>(new NomeAnoEIde());
    linguagens5.addAll(linguagens);

    for (LinguagemFavorita linguagem : linguagens5) {
      System.out.println(linguagem.getNome() + " - " + linguagem.getAnoDeCriacao() + " - " + linguagem.getIde());
    }
  }

}

class LinguagemFavorita implements Comparable<LinguagemFavorita> {
  private String nome;
  private Integer anoDeCriacao;
  private String ide;

  public LinguagemFavorita(String nome, Integer anoDeCriacao, String ide) {
    this.nome = nome;
    this.anoDeCriacao = anoDeCriacao;
    this.ide = ide;
  }

  @Override
  public String toString() {
    return "{" + "nome=" + nome + ", anoDeCriacao=" + anoDeCriacao + ", ide=" + ide + "}";
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public Integer getAnoDeCriacao() {
    return anoDeCriacao;
  }

  public void setAnoDeCriacao(Integer anoDeCriacao) {
    this.anoDeCriacao = anoDeCriacao;
  }

  public String getIde() {
    return ide;
  }

  public void setIde(String ide) {
    this.ide = ide;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((nome == null) ? 0 : nome.hashCode());
    result = prime * result + ((anoDeCriacao == null) ? 0 : anoDeCriacao.hashCode());
    result = prime * result + ((ide == null) ? 0 : ide.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    LinguagemFavorita other = (LinguagemFavorita) obj;
    if (nome == null) {
      if (other.nome != null)
        return false;
    } else if (!nome.equals(other.nome))
      return false;
    if (anoDeCriacao == null) {
      if (other.anoDeCriacao != null)
        return false;
    } else if (!anoDeCriacao.equals(other.anoDeCriacao))
      return false;
    if (ide == null) {
      if (other.ide != null)
        return false;
    } else if (!ide.equals(other.ide))
      return false;
    return true;
  }

  @Override
  public int compareTo(LinguagemFavorita linguagem) {
    // TODO Auto-generated method stub

    return this.getNome().compareToIgnoreCase(linguagem.getNome());
  }
}

class ComparatorIde implements Comparator<LinguagemFavorita> {

  @Override
  public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {
    // TODO Auto-generated method stub
    return l1.getIde().compareTo(l2.getIde());
  }

}

class ComparatorAnoDeCriacaoENome implements Comparator<LinguagemFavorita> {

  @Override
  public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {
    // TODO Auto-generated method stub
    int ano = Integer.compare(l1.getAnoDeCriacao(), l2.getAnoDeCriacao());
    if (ano != 0)
      return ano;
    return l1.getNome().compareToIgnoreCase(l2.getNome());
  }

}

class NomeAnoEIde implements Comparator<LinguagemFavorita> {

  @Override
  public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {
    // TODO Auto-generated method stub
    int nome = l1.getNome().compareToIgnoreCase(l2.getNome());
    if (nome != 0)
      return nome;
    int ano = Integer.compare(l1.getAnoDeCriacao(), l2.getAnoDeCriacao());
    if (ano != 0)
      return ano;
    return l1.getIde().compareToIgnoreCase(l2.getIde());
  }

}