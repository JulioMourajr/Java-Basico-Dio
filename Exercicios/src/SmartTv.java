public class SmartTv {
  boolean ligada = false;
  int canal = 1;
  int volume = 13;

  public int mudarCanal(int canal) {
    return this.canal += canal;
  }

  public int aumentarVolume(int volume) {
    return this.volume += volume;
  }

  public int diminuirVolume(int volume) {
    return this.volume -= volume;
  }

  public boolean actionTV(boolean ligada) {
    return this.ligada = ligada;
  }
}
