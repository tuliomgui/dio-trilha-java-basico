package br.com.greatbank.conta;

import br.com.greatbank.cartao.CartaoCreditoMaster;
import br.com.greatbank.cartao.ICartaoCredito;
import br.com.greatbank.domain.Cliente;

public class ContaCorrente extends Conta {
	private ICartaoCredito cartaoCredito = new CartaoCreditoMaster();
	public ContaCorrente(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Corrente ===");
		super.imprimirInfosComuns();
	}

	public void efetuarCompraCartaoCredito(double valor) {
		cartaoCredito.efetuarCompra(valor);
	}

	public boolean pagarFaturaCartaoCredito() {
		double valorFatura = getValorFatura();
		if (cartaoCredito.pagarFatura(getSaldo())) {
			sacar(valorFatura);
			System.out.println(String.format("A fatura do seu cartão foi paga com sucesso. Seu saldo atual é %.2f", getSaldo()));
			return true;
		}
		System.out.println(String.format("Você não tem saldo suficiente para pagar a fatura do seu cartão de crédito. Saldo atual: %.2f. Valor da fatura: %.2f", getSaldo(), getValorFatura()));
		return false;
	}

	public double getValorFatura() {
		return cartaoCredito.getValorFatura();
	}
}
