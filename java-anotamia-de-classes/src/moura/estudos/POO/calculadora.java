package moura.estudos.POO;

class calculadora implements operacaoMatematica {
  @Override
  public void soma(double num1, double num2) {
    System.out.println("SOma: " + (num1 + num2));
  }

  @Override
  public void subtracao(double num1, double num2) {
    System.out.println("SOma: " + (num1 - num2));
  }

  @Override
  public void divisao(double num1, double num2) {
    System.out.println("SOma: " + (num1 + num2));
  }

  @Override
  public void multiplicacao(double num1, double num2) {
    System.out.println("SOma: " + (num1 + num2));
  }

}
