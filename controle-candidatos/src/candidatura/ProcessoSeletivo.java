package candidatura;
public class ProcessoSeletivo {
    public static void main(String[] args) {
        System.out.println("Processo Seletivo!");
    }

    static void selecaoCandidatos(){
        String [] candidatos = {"Julio", "Pedro", "Miguel", "Thiago", "Lucas"};
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
