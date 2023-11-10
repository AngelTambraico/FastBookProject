package fb.model;

public class VentaDetalle {
    private Integer id;
    private Venta venta;
    private Libro libro;
    private int cantidad;

    public VentaDetalle() {
    }

    public VentaDetalle(Integer id, Venta venta, Libro libro, int cantidad) {
        this.id = id;
        this.venta = venta;
        this.libro = libro;
        this.cantidad = cantidad;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Venta getVenta() {
        return venta;
    }

    public void setVenta(Venta venta) {
        this.venta = venta;
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
        return "VentaDetalle{" +
                "id=" + id +
                ", venta=" + venta +
                ", libro=" + libro +
                ", cantidad=" + cantidad +
                '}';
    }
}
