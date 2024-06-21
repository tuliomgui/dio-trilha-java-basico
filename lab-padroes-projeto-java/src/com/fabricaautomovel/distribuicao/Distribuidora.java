package com.fabricaautomovel.distribuicao;

public class Distribuidora {
    private IDistribuicao formaDistribuicao;

    public Distribuidora(IDistribuicao formaDistribuicao) {
        this.formaDistribuicao = formaDistribuicao;
    }

    public void realizarDistribuicao() {
        System.out.println(String.format("""
                Foram entregues %d automoveis do tipo %s em %s.
                A rotra seguida foi: %s.
                O tempo de entrega foi de %d dias.
                """,
                formaDistribuicao.getQuantidadeAutomoveisDistribuidos(),
                formaDistribuicao.getAutomovelDistribuido(),
                formaDistribuicao.getDestino(),
                formaDistribuicao.getRota(),
                formaDistribuicao.getTempoMedioEntregaEmDiasUteis()));
    }
}
