package com.example.melhoridade.melhoridade;

public class Conteudo {

    private int imagem;
    private final String link;
    private final String titulo;
    private final String descricao;
    private final String categoria;


    public Conteudo(int imagem, String link, String titulo,
                    String descricao, String categoria) {
        this.imagem = imagem;
        this.link = link;
        this.titulo = titulo;
        this.descricao = descricao;
        this.categoria = categoria;
    }

    public int getImagem(){
        return imagem;
    }

    public String getLink(){
        return link;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getCategoria(){
        return categoria;
    }

}
