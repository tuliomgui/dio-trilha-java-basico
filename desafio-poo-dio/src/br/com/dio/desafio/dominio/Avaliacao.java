package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Avaliacao {
    private Dev devAvaliado;
    private Conteudo conteudoAvaliado;
    private LocalDate dataDaAvaliacao;
    private NotaAvaliacao notaAvaliacao;

    public Avaliacao(Dev devAvaliado, Conteudo conteudoAvaliado, LocalDate dataDaAvaliacao, NotaAvaliacao notaAvaliacao) {
        this.devAvaliado = devAvaliado;
        this.conteudoAvaliado = conteudoAvaliado;
        this.dataDaAvaliacao = dataDaAvaliacao;
        this.notaAvaliacao = notaAvaliacao;
    }

    public Dev getDevAvaliado() {
        return devAvaliado;
    }

    public void setDevAvaliado(Dev devAvaliado) {
        this.devAvaliado = devAvaliado;
    }

    public Conteudo getConteudoAvaliado() {
        return conteudoAvaliado;
    }

    public void setConteudoAvaliado(Conteudo conteudoAvaliado) {
        this.conteudoAvaliado = conteudoAvaliado;
    }

    public LocalDate getDataDaAvaliacao() {
        return dataDaAvaliacao;
    }

    public void setDataDaAvaliacao(LocalDate dataDaAvaliacao) {
        this.dataDaAvaliacao = dataDaAvaliacao;
    }

    public NotaAvaliacao getNotaAvaliacao() {
        return notaAvaliacao;
    }

    public void setNotaAvaliacao(NotaAvaliacao notaAvaliacao) {
        this.notaAvaliacao = notaAvaliacao;
    }

    @Override
    public String toString() {
        return "Avaliacao{" +
                "devAvaliado=" + devAvaliado.getNome() +
                ", conteudoAvaliado=" + conteudoAvaliado.getTitulo() +
                ", dataDaAvaliacao=" + dataDaAvaliacao +
                ", notaAvaliacao=" + notaAvaliacao +
                '}';
    }
}
