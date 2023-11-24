package br.com.ecommerce.model;

import java.util.Date;

public class Pedido {
    private int id;
    private String imagem;
    private String produto;
    private int quantidade;
    private double preco;
    private double total;
    private String estimativaEntrega;
    private int idUsuario;


    public Pedido() {
    }

    public Pedido(int id, String imagem, String produto, int quantidade, double preco, double total, String estimativaEntrega, int idUsuario) {
        this.id = id;
        this.imagem = imagem;
        this.produto = produto;
        this.quantidade = quantidade;
        this.preco = preco;
        this.total = total;
        this.estimativaEntrega = estimativaEntrega;
        this.idUsuario = idUsuario;
    }

    public Pedido(String imagem, String produto, int quantidade, double preco, double total, String estimativaEntrega, int idUsuario) {
        this.imagem = imagem;
        this.produto = produto;
        this.quantidade = quantidade;
        this.preco = preco;
        this.total = total;
        this.estimativaEntrega = estimativaEntrega;
        this.idUsuario = idUsuario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
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

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getEstimativaEntrega() {
        return estimativaEntrega;
    }

    public void setEstimativaEntrega(String estimativaEntrega) {
        this.estimativaEntrega = estimativaEntrega;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }
}
