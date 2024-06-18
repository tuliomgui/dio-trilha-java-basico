package br.com.greatbank.cartao;

import java.time.LocalDateTime;

public class CompraCartaoCredito {
    private double valorCompra;
    private LocalDateTime horarioCompra;

    public CompraCartaoCredito(double valorCompra, LocalDateTime horarioCompra) {
        this.horarioCompra = horarioCompra;
        this.valorCompra = valorCompra;
    }

    public LocalDateTime getHorarioCompra() {
        return horarioCompra;
    }

    public double getValorCompra() {
        return valorCompra;
    }
}
