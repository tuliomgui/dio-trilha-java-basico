package br.com.greatbank.cartao;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class CartaoCreditoMaster implements ICartaoCredito {
    private List<CompraCartaoCredito> listaCompra = new ArrayList<>();

    @Override
    public void efetuarCompra(double valor) {
        CompraCartaoCredito novaCompra = new CompraCartaoCredito(valor, LocalDateTime.now());
        listaCompra.add(novaCompra);
    }

    @Override
    public boolean pagarFatura(double saldoDisponivel) {
        if (saldoDisponivel < getValorFatura())
            return false;
        listaCompra.clear();
        return true;
    }

    @Override
    public double getValorFatura() {
        return listaCompra.stream().map(CompraCartaoCredito::getValorCompra).reduce(0d, Double::sum);
    }
}
