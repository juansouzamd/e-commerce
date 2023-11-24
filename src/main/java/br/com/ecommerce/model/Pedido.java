package br.com.ecommerce.model;

public class Pedido {
    private int id;
    private String imagem;
    private String produto;
    private int quantidade;
    private double preco;
    private double subTotal;
    private String estimativaEntrega;
    private int idUsuario;

    private String endereco;


    public Pedido() {
    }

    public Pedido(int id, String imagem, String produto, int quantidade, double preco, double subTotal, String estimativaEntrega, int idUsuario, String endereco) {
        this.id = id;
        this.imagem = imagem;
        this.produto = produto;
        this.quantidade = quantidade;
        this.preco = preco;
        this.subTotal = subTotal;
        this.estimativaEntrega = estimativaEntrega;
        this.idUsuario = idUsuario;
        this.endereco = endereco;
    }

    public Pedido(String imagem, String produto, int quantidade, double preco, double subTotal, String estimativaEntrega, int idUsuario, String endereco) {
        this.imagem = imagem;
        this.produto = produto;
        this.quantidade = quantidade;
        this.preco = preco;
        this.subTotal = subTotal;
        this.estimativaEntrega = estimativaEntrega;
        this.idUsuario = idUsuario;
        this.endereco = endereco;
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

    public double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
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

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
