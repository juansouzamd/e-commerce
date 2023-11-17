package br.com.ecommerce.model;

public class Cartao {
    private int id;
    private String numero;
    private String titular;
    private String vencimento; // Alterado para String
    private int idUsuario;

    public Cartao() {}

    public Cartao(int id, String numero, String titular, String vencimento, int idUsuario) {
        this.id = id;
        this.numero = numero;
        this.titular = titular;
        this.vencimento = vencimento;
        this.idUsuario = idUsuario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getVencimento() {
        return vencimento;
    }

    public void setVencimento(String vencimento) {
        this.vencimento = vencimento;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }
}

