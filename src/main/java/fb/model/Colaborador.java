package fb.model;

public class Colaborador {
    private Integer id;
    private String nombre;
    private String direccion;
    private double salario;

    public Colaborador() {
    }

    public Colaborador(Integer id, String nombre, String direccion, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.salario = salario;
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

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Colaborador{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", salario=" + salario +
                '}';
    }
}
