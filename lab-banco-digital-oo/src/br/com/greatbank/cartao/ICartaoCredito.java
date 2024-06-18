package br.com.greatbank.cartao;

public interface ICartaoCredito {
    void efetuarCompra(double valor);

    boolean pagarFatura(double saldoDisponivel);

    double getValorFatura();
}
