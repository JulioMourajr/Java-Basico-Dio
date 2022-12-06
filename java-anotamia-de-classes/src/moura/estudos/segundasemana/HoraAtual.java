package moura.estudos.segundasemana;

import java.text.SimpleDateFormat;
import java.util.Date;

public class HoraAtual {
  public static void horaAtual() {
    Date data = new Date();
    String dataAtual = new SimpleDateFormat("dd/MM/yyyy").format(data);
    String hora = new SimpleDateFormat("HH:mm:ss").format(data);
    String horaAtual = new SimpleDateFormat("HH").format(data);
    String minutos = new SimpleDateFormat("mm").format(data);
    int horaAtualNumber = Integer.parseInt(horaAtual);
    System.out.println(dataAtual);
    System.out.println(hora);
    System.out.println("Olá, já são " + horaAtual + " Horas e " + minutos + " minutos.");
    String mensagem;
    if (horaAtualNumber >= 18) {
      mensagem = "Tenha uma boa noite!";
      System.out.println(mensagem);
    } else if (horaAtualNumber >= 12 && horaAtualNumber < 18) {
      mensagem = "Tenha uma boa tarde!";
      System.out.println(mensagem);
    } else if (horaAtualNumber >= 6 && horaAtualNumber < 12) {
      mensagem = "Tenha um bom Dia!";
      System.out.println(mensagem);
    }
  }
}
