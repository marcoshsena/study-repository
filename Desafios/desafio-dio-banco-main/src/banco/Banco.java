package banco;

import Contas.Conta;

import java.util.ArrayList;
import java.util.List;

public class Banco {

    private String nome;
    private List<Conta> contas;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Banco() {
        contas = new ArrayList<>();
    }

    public void adicionarConta(Conta conta) {
        contas.add(conta);
        System.out.println("Contas.Conta adicionada: " + conta.getNumero());
    }

    public void listarContas() {
        System.out.println("Lista de contas no banco:");
        for (Conta cliente : contas) {
            System.out.println("Número da Contas.Conta: " + cliente.getNumero() + ", Saldo: " + cliente.getSaldo());
        }
    }

    public Conta buscarConta(int numeroConta) {
        for (Conta conta : contas) {
            if (conta.getNumero() == numeroConta){
                return conta;
            }
        }
        System.out.println("Contas.Conta não encontrada: " + numeroConta);
        return null;
    }
}
