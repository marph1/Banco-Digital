package desenvolvimento.model;

import java.util.HashMap;
import java.util.Map;

public class Banco {
    private Map<Integer, Conta> contas;
    private int proximoNumeroConta;

    public Banco() {
        contas = new HashMap<>();
        proximoNumeroConta = 1;
    }

    public Conta criarConta(Cliente cliente) {
        Conta conta = new Conta(proximoNumeroConta, cliente);
        contas.put(proximoNumeroConta, conta);
        proximoNumeroConta++;
        System.out.println("Conta criada com sucesso. Número da conta: " + conta.getNumero());
        return conta;
    }

    public Conta getConta(int numero) {
        return contas.get(numero);
    }

    public void mostrarSaldo(int numero) {
        Conta conta = getConta(numero);
        if (conta != null) {
            System.out.println("Saldo da conta " + numero + ": R$" + conta.getSaldo());
        } else {
            System.out.println("Conta não encontrada.");
        }
    }
}
