package Contas;

import clientes.Cliente;

public class ContaCorrente extends Conta {



    public ContaCorrente(Cliente cliente) {

        super(cliente);

    }

    @Override
    public void imprimirExtrato() {
        System.out.println("==== Extrato Contas.Conta Poupança: =====");
        super.imprimirInfosComun();
    }
}
