import com.fabricaautomovel.distribuicao.DistribuicaoPorNavio;
import com.fabricaautomovel.distribuicao.DistribuicaoPorCaminhao;
import com.fabricaautomovel.distribuicao.Distribuidora;
import com.fabricaautomovel.distribuicao.IDistribuicao;
import com.fabricaautomovel.domain.TipoAutomovel;
import com.fabricaautomovel.robo.MontadorAutomovel;

import java.time.LocalDate;

public class FabricaAutomoveis {
    public static void main(String[] args) {
        System.out.println("Fabricando motos");
        MontadorAutomovel montadorMoto = MontadorAutomovel.getMontadorAutomovelBuilder()
                                    .setTipoAutomovel(TipoAutomovel.MOTO)
                                    .setPotencia(100)
                                    .setQuantidadeEixos(0)
                                    .setDataFabricacao(LocalDate.now())
                                    .build();
        int quantidadeDeMotos = 10;
        for (int indice = 1; indice <= quantidadeDeMotos; indice++) {
            System.out.print(indice + ". ");
            montadorMoto.montarAutomovel();
        }
        IDistribuicao distribuidoraMotos = new DistribuicaoPorCaminhao();
        distribuidoraMotos.setDestino("Rio de Janeiro");
        distribuidoraMotos.setQuantidadeAutomoveis(quantidadeDeMotos);
        distribuidoraMotos.setAutomovelDistribuido(montadorMoto.getTipoAutomovel());

        Distribuidora distribuidoraParceira1 = new Distribuidora(distribuidoraMotos);
        distribuidoraParceira1.realizarDistribuicao();

        MontadorAutomovel montadorCarro = MontadorAutomovel.getMontadorAutomovelBuilder()
                                        .setTipoAutomovel(TipoAutomovel.CARRO)
                                        .setPotencia(200)
                                        .setQuantidadeEixos(2)
                                        .setDataFabricacao(LocalDate.now())
                                        .build();
        int quantiaddeDeCarros = 5;
        for (int indice = 1; indice <= quantiaddeDeCarros; indice++) {
            System.out.print(indice + ". ");
            montadorCarro.montarAutomovel();
        }
        IDistribuicao distribuidoraCarros = new DistribuicaoPorNavio();
        distribuidoraCarros.setDestino("Africa");
        distribuidoraCarros.setQuantidadeAutomoveis(5);
        distribuidoraCarros.setAutomovelDistribuido(montadorCarro.getTipoAutomovel());

        Distribuidora distribuidoraParceira2 = new Distribuidora(distribuidoraCarros);
        distribuidoraParceira2.realizarDistribuicao();
    }
}