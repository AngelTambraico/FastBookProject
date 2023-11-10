package fb.model;

import java.util.ArrayList;
import java.util.List;

public class Punto {
    private Integer id;
    private String nombre;
    private String direccion;
    private Coordenadas coordenadas;
    private List<Punto> puntosVecinos; 

    public Punto() {
        puntosVecinos = new ArrayList<>();
    }

    public Punto(Integer id, String nombre, String direccion, Coordenadas coordenadas) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.coordenadas = coordenadas;
        this.puntosVecinos = new ArrayList<>();
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

    public Coordenadas getCoordenadas() {
        return coordenadas;
    }

    public void setCoordenadas(Coordenadas coordenadas) {
        this.coordenadas = coordenadas;
    }

    public List<Punto> getPuntosVecinos() {
        return puntosVecinos;
    }

    public void agregarPuntoVecino(Punto punto) {
        this.puntosVecinos.add(punto);
    }

    @Override
    public String toString() {
        return "Punto{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", coordenadas=" + coordenadas +
                '}';
    }
}
