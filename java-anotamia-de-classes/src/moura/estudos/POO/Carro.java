package moura.estudos.POO;

public class Carro {
  String nome;
  int ano;
  private double capacidadeTanque;

  Carro() {

  }

  Carro(String nome, int ano) {
    this.nome = nome;
    this.ano = ano;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public int getAno() {
    return ano;
  }

  public void setAno(int ano) {
    this.ano = ano;
  }

  public double getCapacidadeTanque() {
    return capacidadeTanque;
  }

  public void setCapacidadeTanque(double capacidadeTanque) {
    this.capacidadeTanque = capacidadeTanque;
  }

  double calcularGasto(double gasolinaValor) {
    double calculo = gasolinaValor * this.capacidadeTanque;
    System.out.println("Para encher o tanque de " + this.capacidadeTanque + "litros, se gasta " + calculo + " R$.");
    return calculo;
  }

}
