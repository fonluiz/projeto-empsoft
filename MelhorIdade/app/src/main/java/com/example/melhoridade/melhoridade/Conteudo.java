package com.example.melhoridade.melhoridade;

public class Conteudo {

    private final String titulo;
    private final String descricao;
    private final String categoria;


    public Conteudo(String titulo,
                 String descricao, String categoria) {

        this.titulo = titulo;
        this.descricao = descricao;
        this.categoria = categoria;
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
