package fb.model;

import java.util.Date;
import java.util.List;

public class Pedido {
    private Integer id;
    private Cliente cliente;
    private Date fechaPedido;
    private List<PedidoDetalle> detalles;

    public Pedido() {
    }

    public Pedido(Integer id, Cliente cliente, Date fechaPedido, List<PedidoDetalle> detalles) {
        this.id = id;
        this.cliente = cliente;
        this.fechaPedido = fechaPedido;
        this.detalles = detalles;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Date getFechaPedido() {
        return fechaPedido;
    }

    public void setFechaPedido(Date fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

    public List<PedidoDetalle> getDetalles() {
        return detalles;
    }

    public void setDetalles(List<PedidoDetalle> detalles) {
        this.detalles = detalles;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "id=" + id +
                ", cliente=" + cliente +
                ", fechaPedido=" + fechaPedido +
                ", detalles=" + detalles +
                '}';
    }
}
