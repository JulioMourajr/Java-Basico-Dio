package candidatura;

import java.util.concurrent.ThreadLocalRandom;
public class ProcessoSeletivo {
    public static void main(String[] args) {
        System.out.println("Processo Seletivo!");
        selecaoCandidatos();
    }

    static void selecaoCandidatos(){
        String [] candidatos = {"Julio", "Pedro", "Miguel", "Thiago", "Lucas", "Malu", "OI", "Eu", "NAda", "XX"};
        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;
        while(candidatosSelecionados < 5 && candidatoAtual < candidatos.length){
            String candidato = candidatos[candidatoAtual];
            double salarioPrentendido = valorPretendido();
            System.out.println("O candidato " + candidato + " Solicitou este valor de salario " + salarioPrentendido);
            if(salarioBase >= salarioPrentendido){
                System.out.println("O candidato " + candidato + " Foi selecionado!");
                candidatosSelecionados++;
            }
            candidatoAtual++;
        }
    }

    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800,2200);
    }

    static void analisarCandidato(double salarioPrentendido){
        double salarioBase = 2000.0;
        if(salarioBase > salarioPrentendido){
            System.out.println("Ligar para o Candidato!");
        }else if(salarioBase==salarioPrentendido){
             System.out.println("Ligar para o Candidato com uma contra Proposta!");
        }else{
            System.out.println("Aguardo resultado dos outros candidatos.");
        }
    }
}
