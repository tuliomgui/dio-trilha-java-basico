package com.fabricaautomovel.distribuicao;

import com.fabricaautomovel.domain.TipoAutomovel;

import java.util.List;

public interface IDistribuicao {
    public void setDestino(String destino);

    public String getDestino();

    public List<String> getRota();

    public int getTempoMedioEntregaEmDiasUteis();

    public void setAutomovelDistribuido(TipoAutomovel tipoAutomovel);

    public TipoAutomovel getAutomovelDistribuido();

    public void setQuantidadeAutomoveis(int quantidadeAutomoveis);

    public int getQuantidadeAutomoveisDistribuidos();
}
