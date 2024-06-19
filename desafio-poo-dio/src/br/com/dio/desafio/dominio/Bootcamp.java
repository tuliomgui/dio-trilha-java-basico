package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.util.*;

public class Bootcamp {
    private String nome;
    private String descricao;
    private final LocalDate dataInicial = LocalDate.now();
    private final LocalDate dataFinal = dataInicial.plusDays(45);
    private Set<Dev> devsInscritos = new HashSet<>();
    private Set<Conteudo> conteudos = new LinkedHashSet<>();
    private Map<String, List<Avaliacao>> avaliacoesDev = new HashMap<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataInicial() {
        return dataInicial;
    }

    public LocalDate getDataFinal() {
        return dataFinal;
    }

    public Set<Dev> getDevsInscritos() {
        return devsInscritos;
    }

    public void setDevsInscritos(Set<Dev> devsInscritos) {
        this.devsInscritos = devsInscritos;
    }

    public Set<Conteudo> getConteudos() {
        return conteudos;
    }

    public void setConteudos(Set<Conteudo> conteudos) {
        this.conteudos = conteudos;
    }

    public void insereAvaliacaoDev(Dev dev, Conteudo conteudo, NotaAvaliacao nota) {
        if (!conteudos.contains(conteudo)) {
            System.out.println("Este conteúdo não faz parte deste bootcamp");
            return;
        }
        Avaliacao avaliacaoDev = new Avaliacao(dev, conteudo, LocalDate.now(), nota);
        if (avaliacoesDev.containsKey(dev.getNome())) {
            avaliacoesDev.get(dev.getNome()).add(avaliacaoDev);
        } else {
            avaliacoesDev.put(dev.getNome(), new ArrayList(Arrays.asList(avaliacaoDev)));
        }
    }

    public Optional<Avaliacao> getAvaliacaoDev(Dev dev, Conteudo conteudo) {
         if (!avaliacoesDev.containsKey(dev.getNome())) {
             return Optional.empty();
         } else {
             return avaliacoesDev.get(dev.getNome()).stream()
                     .filter(avaliacao -> conteudo.getTitulo().equals(avaliacao.getConteudoAvaliado().getTitulo()))
                     .findAny();
         }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bootcamp bootcamp = (Bootcamp) o;
        return Objects.equals(nome, bootcamp.nome) && Objects.equals(descricao, bootcamp.descricao) && Objects.equals(dataInicial, bootcamp.dataInicial) && Objects.equals(dataFinal, bootcamp.dataFinal) && Objects.equals(devsInscritos, bootcamp.devsInscritos) && Objects.equals(conteudos, bootcamp.conteudos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, descricao, dataInicial, dataFinal, devsInscritos, conteudos);
    }
}
