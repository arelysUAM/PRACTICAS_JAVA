package model;

import jakarta.persistence.*;

@Entity
@Table(name = "maestro")
@NamedQueries({
        @NamedQuery(name = "Maestro.All", query = "SELECT m FROM Maestro m")
})
public class Maestro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, length = 60)
    private String nombre;

    @Column(nullable = false, length = 60)
    private String especialidad;

    private Double salario;

    // Getters y setters
    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getEspecialidad() { return especialidad; }
    public void setEspecialidad(String especialidad) { this.especialidad = especialidad; }

    public Double getSalario() { return salario; }
    public void setSalario(Double salario) { this.salario = salario; }

    @Override
    public String toString() {
        return "Maestro{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", especialidad='" + especialidad + '\'' +
                ", salario=" + salario +
                '}';
    }
}
