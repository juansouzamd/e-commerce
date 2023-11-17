package br.com.ecommerce.model;

import java.util.Date;

public class Pedido {
    private int id;
    private String status;
    private double valorTotal;
    private boolean pago;
    private String estimativaEntrega;
    private Date dataPedido;
    private int idUsuario;

    public Pedido() {
        // Construtor padrão
    }

    public Pedido(int id, String status, double valorTotal, boolean pago, String estimativaEntrega, Date dataPedido, int idUsuario) {
        this.id = id;
        this.status = status;
        this.valorTotal = valorTotal;
        this.pago = pago;
        this.estimativaEntrega = estimativaEntrega;
        this.dataPedido = dataPedido;
        this.idUsuario = idUsuario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public boolean isPago() {
        return pago;
    }

    public void setPago(boolean pago) {
        this.pago = pago;
    }

    public String getEstimativaEntrega() {
        return estimativaEntrega;
    }

    public void setEstimativaEntrega(String estimativaEntrega) {
        this.estimativaEntrega = estimativaEntrega;
    }

    public Date getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(Date dataPedido) {
        this.dataPedido = dataPedido;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }
}
