package model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "publicacion")
public class Publicacion {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "publicacion_seq")
    @SequenceGenerator(name = "publicacion_seq", sequenceName = "publicacion_id_seq", allocationSize = 1)
    private int id;

    @Column (name = "nombre_publicacion", nullable = false)
    private String nombrePublicacion;

    @Column (name = "descripcion", nullable = false)
    private String descripcion;

    @Column (name = "Fecha")
    private LocalDate fecha;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombrePublicacion() {
        return nombrePublicacion;
    }

    public void setNombrePublicacion(String nombrePublicacion) {
        this.nombrePublicacion = nombrePublicacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Registro { id:" + id + " | " +
                "Nombre_Publicación: " + nombrePublicacion + " | " +
                "Descripción: " + " | " + descripcion + " | " +
                "Fecha: " + fecha + "}";
    }
}
