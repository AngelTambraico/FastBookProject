package fb.model;

import java.util.List;

public class Cliente {
    private Integer id;
    private String nombre;
    private String direccion;
    private List<Pedido> pedidos;

    public Cliente() {
    }

    public Cliente(Integer id, String nombre, String direccion, List<Pedido> pedidos) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.pedidos = pedidos;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", pedidos=" + pedidos +
                '}';
    }
}
