package br.com.ecommerce.model;

public class Produto {
    private int id;
    private String nome;
    private double preco;
    private String descricao;
    private String genero;
    private String categoria;

    private String marca;

    private String imagemPrincipal;

    public Produto() {}

    public Produto(int id, String nome, double preco, String descricao, String genero, String categoria, String marca, String imagemPrincipal) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.descricao = descricao;
        this.genero = genero;
        this.categoria = categoria;
        this.marca = marca;
        this.imagemPrincipal = imagemPrincipal;
    }

    // Getters e Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getImagemPrincipal() {
        return imagemPrincipal;
    }

    public void setImagemPrincipal(String imagemPrincipal) {
        this.marca = imagemPrincipal;
    }
}
