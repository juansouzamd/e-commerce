package br.com.ecommerce.model;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class CarrinhoItem {
    private int idProduto;
    private int quantidade;
    private double preco;
    private String produto;
    private String imagem;
    private double subTotal;

    public double getSubTotal() {
        BigDecimal bd = new BigDecimal(subTotal).setScale(2, RoundingMode.HALF_UP);

        // Obtém o número arredondado como double
        double numeroArredondado = bd.doubleValue();
        return numeroArredondado;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }

    public CarrinhoItem(int idProduto, int quantidade, double preco, String produto, String imagem)
    {
        this.idProduto = idProduto;
        this.quantidade = quantidade;
        this.preco = preco;
        this.produto = produto;
        this.imagem = imagem;
    }
    public CarrinhoItem(){}
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

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

}
