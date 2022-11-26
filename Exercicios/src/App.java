public class App {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();
        String result = smartTv.ligada == true ? "Ligada!" : "Desligada!";
        System.out.println("A tv está " + result);
        System.out.println(smartTv.canal);

        smartTv.mudarCanal(1);

        System.out.println(smartTv.canal);

        System.out.println(smartTv.volume);

        smartTv.aumentarVolume(4);

        System.out.println(smartTv.volume);

        smartTv.diminuirVolume(2);

        System.out.println(smartTv.volume);

        smartTv.actionTV(true);

        result = smartTv.ligada == true ? "Ligada!" : "Desligada!";

        System.out.println("A tv está " + result);

    }
}
