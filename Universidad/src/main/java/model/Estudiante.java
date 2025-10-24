package model;

import jakarta.persistence.*;

@Entity
@Table(name = "estudiante")
@NamedQueries({
        @NamedQuery(name = "Estudiante.All", query = "SELECT e FROM Estudiante e")
})
public class Estudiante {

    @Id //Indica que el campo es la clave primaria.
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Le dice a JPA cómo generar ese ID automáticamente.
    private Integer id;

    @Column(nullable = false, length = 50)
    private String nombre;

    @Column(nullable = false, length = 50)
    private String carrera;

    private Double promedio;

    // Getters y Setters
    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getCarrera() { return carrera; }
    public void setCarrera(String carrera) { this.carrera = carrera; }

    public Double getPromedio() { return promedio; }
    public void setPromedio(Double promedio) { this.promedio = promedio; }

    @Override
    public String toString() {
        return "Estudiante{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", carrera='" + carrera + '\'' +
                ", promedio=" + promedio +
                '}';
    }
}
