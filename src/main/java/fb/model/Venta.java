package fb.model;

import java.util.Date;
import java.util.List;

public class Venta {
    private Integer id;
    private Cliente cliente;
    private Date fechaVenta;
    private List<VentaDetalle> detalles;

    public Venta() {
    }

    public Venta(Integer id, Cliente cliente, Date fechaVenta, List<VentaDetalle> detalles) {
        this.id = id;
        this.cliente = cliente;
        this.fechaVenta = fechaVenta;
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

    public Date getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(Date fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public List<VentaDetalle> getDetalles() {
        return detalles;
    }

    public void setDetalles(List<VentaDetalle> detalles) {
        this.detalles = detalles;
    }

    @Override
    public String toString() {
        return "Venta{" +
                "id=" + id +
                ", cliente=" + cliente +
                ", fechaVenta=" + fechaVenta +
                ", detalles=" + detalles +
                '}';
    }
}
