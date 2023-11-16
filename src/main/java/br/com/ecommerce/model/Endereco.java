package br.com.ecommerce.model;

public class Endereco {
    String id;
    String rua;
    String cep;
    String bairro;
    String numero;
    int idUsuario;

    public Endereco(){}

    public Endereco(String id, String rua, String cep, String bairro, String numero, int idUsuario)
    {
        this.id = id;
        this.rua = rua;
        this.cep = cep;
        this.bairro = bairro;
        this.numero = numero;
        this.idUsuario = idUsuario;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

}
