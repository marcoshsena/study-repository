package set.operacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    // atributos
    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado (String nome, int condigoConvite){
        convidadoSet.add(new Convidado(nome, condigoConvite));
    }
    
    public void removerConvidadoPorCodigoConvite (int condigoConvite){
        Convidado convidadoParaRemover = null;
        for(Convidado c : convidadoSet){
            if(c.getCondigoConvite() == condigoConvite){
                convidadoParaRemover = c;
                break;
            }
        }
        convidadoSet.remove(convidadoParaRemover);
    }

    public int contarConvidado(){
        return convidadoSet.size();
    }

    public void exibirConvidado(){
        System.out.println(convidadoSet);
    }


    // Testando Collection Set Operações Básicas:
    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
        System.out.println("Existem " + conjuntoConvidados.contarConvidado() + " convidados dentro do Set de convidados.");

        System.out.println("#############################################");

        conjuntoConvidados.adicionarConvidado("Convidado 1", 1274);
        conjuntoConvidados.adicionarConvidado("Convidado 2", 1274);
        conjuntoConvidados.adicionarConvidado("Convidado 3", 1209);
        conjuntoConvidados.adicionarConvidado("Convidado 4", 1271);
        conjuntoConvidados.adicionarConvidado("Convidado 5", 1225);
        conjuntoConvidados.adicionarConvidado("Convidado 6", 1234);

        conjuntoConvidados.exibirConvidado();

        System.out.println("Existem " + conjuntoConvidados.contarConvidado() + " convidados dentro do Set de convidados.");

        conjuntoConvidados.removerConvidadoPorCodigoConvite(1274);
        System.out.println("Existem " + conjuntoConvidados.contarConvidado() + " convidados dentro do Set de convidados.");
    }
}
