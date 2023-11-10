package fb.model;

public class PedidoDetalle {
    private Integer id;
    private Pedido pedido;
    private Libro libro;
    private int cantidad;

    public PedidoDetalle() {
    }

    public PedidoDetalle(Integer id, Pedido pedido, Libro libro, int cantidad) {
        this.id = id;
        this.pedido = pedido;
        this.libro = libro;
        this.cantidad = cantidad;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "PedidoDetalle{" +
                "id=" + id +
                ", pedido=" + pedido +
                ", libro=" + libro +
                ", cantidad=" + cantidad +
                '}';
    }
}
