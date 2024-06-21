package com.fabricaautomovel.robo;

import com.fabricaautomovel.domain.TipoAutomovel;

import java.time.LocalDate;

public class MontadorAutomovel {
    private final TipoAutomovel tipoAutomovel;
    private final int quantidadeEixos;
    private final int potencia;
    private final LocalDate dataFabricacao;

    private MontadorAutomovel(MontadorBuilder builder) {
        this.tipoAutomovel = builder.tipoAutomovel;
        this.quantidadeEixos = builder.quantidadeEixos;
        this.potencia = builder.potencia;
        this.dataFabricacao = builder.dataFabricacao;
    }

    public static MontadorBuilder getMontadorAutomovelBuilder() {
        return new MontadorBuilder();
    }

    public TipoAutomovel getTipoAutomovel() {
        return tipoAutomovel;
    }

    public int getQuantidadeEixos() {
        return quantidadeEixos;
    }

    public int getPotencia() {
        return potencia;
    }

    public LocalDate getDataFabricacao() {
        return dataFabricacao;
    }

    public void montarAutomovel() {
        System.out.println("O automóvel " + getTipoAutomovel() + " está pronto!");
    }

    public static class MontadorBuilder {
        private TipoAutomovel tipoAutomovel;
        private int quantidadeEixos;
        private int potencia;
        private LocalDate dataFabricacao;

        public MontadorBuilder setTipoAutomovel(TipoAutomovel tipoAutomovel) {
            this.tipoAutomovel = tipoAutomovel;
            return this;
        }

        public MontadorBuilder setQuantidadeEixos(int quantidadeEixos) {
            this.quantidadeEixos = quantidadeEixos;
            return this;
        }

        public MontadorBuilder setPotencia(int potencia) {
            this.potencia = potencia;
            return this;
        }

        public MontadorBuilder setDataFabricacao(LocalDate dataFabricacao) {
            this.dataFabricacao = dataFabricacao;
            return this;
        }

        public MontadorAutomovel build() {
            return new MontadorAutomovel(this);
        }
    }
}
