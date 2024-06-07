package desenvolvimento.main;

import desenvolvimento.model.Banco;
import desenvolvimento.model.Cliente;
import desenvolvimento.model.Conta;

public class BancoDigital {
    public static void main(String[] args) {
        Banco banco = new Banco();

        Cliente cliente1 = new Cliente("João Silva", "123.456.789-00");
        Cliente cliente2 = new Cliente("Maria Oliveira", "987.654.321-00");

        Conta conta1 = banco.criarConta(cliente1);
        Conta conta2 = banco.criarConta(cliente2);

        conta1.depositar(500);
        banco.mostrarSaldo(conta1.getNumero());

        conta1.sacar(100);
        banco.mostrarSaldo(conta1.getNumero());

        conta1.transferir(200, conta2);
        banco.mostrarSaldo(conta1.getNumero());
        banco.mostrarSaldo(conta2.getNumero());
    }
}
