package br.com.ecommerce.model;

public class CarrinhoItem {
    private int idProduto;
    private int quantidade;
    private double preco;

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }


    public CarrinhoItem(){}
    public CarrinhoItem(int idProduto, int quantidade, double preco)
    {
        this.idProduto = idProduto;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }


}
