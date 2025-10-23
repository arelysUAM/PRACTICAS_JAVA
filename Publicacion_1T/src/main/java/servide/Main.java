package servide;

import model.Publicacion;

import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //insertar();
        //buscar(1);
        //actualizar(1);
        //eliminar(1);
        //listar();
    }
    public static void insertar(){
        Publicacion p = new Publicacion();
        p.setNombrePublicacion("Objetos Perdidos");
        p.setDescripcion("Un celular fue encontrado en el salón B-102");
        p.setFecha(LocalDate.now());
        PublicacionDAO.insert(p);
        System.out.println("Publicacion insertada correctamente");
    }

    public static void buscar(int id){
        Publicacion p = PublicacionDAO.buscar(id);
        if(p != null){
            System.out.println("Publicacion encontrada");
            System.out.println(p.toString());
        } else {
            System.out.println("Publicacion no encontrada con id " + id);
        }
    }

    public static void listar(){
        List<Publicacion> lista = PublicacionDAO.listar();
        lista.forEach(System.out::println);
    }

    public static void actualizar(int id){
        Publicacion p = PublicacionDAO.buscar(id);
        if(p != null){
            p.setNombrePublicacion("Boletín de Notas - Actualizado");
            p.setFecha(LocalDate.now());
            PublicacionDAO.actualizar(p);
            System.out.println("Publicacion actualizada");
        } else {
            System.out.println("Publicacion no encontrada con id " + id);
        }
    }

    public static void eliminar(int id){
        Publicacion p = PublicacionDAO.buscar(id);
        if(p != null){
            PublicacionDAO.eliminar(id);
            System.out.println("Publicacion eliminada");
        }  else {
            System.out.println("Publicacion no encontrada con id " + id);
        }
    }
}
