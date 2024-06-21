package com.fabricaautomovel.distribuicao;

import com.fabricaautomovel.domain.TipoAutomovel;

import java.util.List;

public class DistribuicaoPorNavio implements IDistribuicao {
    private String destino;
    private TipoAutomovel tipoAutomovel;
    private int quantidadeAutomoveis;

    @Override
    public void setDestino(String destino) {
        this.destino = destino;
    }

    @Override
    public String getDestino() {
        return destino;
    }

    @Override
    public List<String> getRota() {
        return List.of("Porto de saída", "Porto de destino");
    }

    @Override
    public int getTempoMedioEntregaEmDiasUteis() {
        return 30;
    }

    @Override
    public void setAutomovelDistribuido(TipoAutomovel tipoAutomovel) {
        this.tipoAutomovel = tipoAutomovel;
    }

    @Override
    public TipoAutomovel getAutomovelDistribuido() {
        return tipoAutomovel;
    }

    @Override
    public void setQuantidadeAutomoveis(int quantidadeAutomoveis) {
        this.quantidadeAutomoveis = quantidadeAutomoveis;
    }

    @Override
    public int getQuantidadeAutomoveisDistribuidos() {
        return quantidadeAutomoveis;
    }
}
