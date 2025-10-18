import Contas.Conta;
import Contas.ContaCorrente;
import Contas.ContaPoupanca;
import banco.Banco;
import clientes.Cliente;

public class Main {

    public static void main(String[] args) {
        Banco banco = new Banco();
        Cliente marcos = new Cliente();
        marcos.setNome("Marcos");

        Conta cc = new ContaCorrente(marcos);
        Conta cp = new ContaPoupanca(marcos);

        banco.adicionarConta(cc);
        banco.adicionarConta(cp);

        banco.listarContas();

        cc.depositar(100);

        cc.imprimirExtrato();
        cp.imprimirExtrato();

        cc.transferencia(50, cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato();


    }
}
