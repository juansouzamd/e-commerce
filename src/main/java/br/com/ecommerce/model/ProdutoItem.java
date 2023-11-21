package br.com.ecommerce.model;

public class ProdutoItem extends Produto {
    private String caminhoImagem;

    public ProdutoItem(){}

    public String getCaminhoImagem() {
        return caminhoImagem;
    }

    public void setCaminhoImagem(String caminhoImagem) {
        this.caminhoImagem = caminhoImagem;
    }



}
