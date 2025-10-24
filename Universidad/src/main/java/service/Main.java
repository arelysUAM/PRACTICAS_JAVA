package service;

import model.Estudiante;
import model.Maestro;
import java.util.List;

public class Main {

    private static final IDAO dao = new ImplDAO();

    public static void main(String[] args) {
        insertarEstudiante();
        listarEstudiantes();
        //insertarMaestro();
        //listarMaestros();
    }

    public static void insertarEstudiante() {
        Estudiante e1 = new Estudiante();
        e1.setNombre("Sara Taylor");
        e1.setCarrera("Ingeniería de Sistemas");
        e1.setPromedio(96.0);
        dao.insert(e1);
        System.out.println("Estudiante insertado correctamente.");
    }

    public static void listarEstudiantes() {
        List<Estudiante> lista = dao.getAll("Estudiante.All", Estudiante.class);
        System.out.println("Lista de estudiantes:");
        lista.forEach(System.out::println);
    }

    public static void insertarMaestro() {
        Maestro m1 = new Maestro();
        m1.setNombre("Elissa Zambrana");
        m1.setEspecialidad("Contabilidad");
        m1.setSalario(1090.5);
        dao.insert(m1);
        System.out.println("Maestro insertado correctamente.");
    }

    public static void listarMaestros() {
        List<Maestro> lista = dao.getAll("Maestro.All", Maestro.class);
        System.out.println("Lista de maestros:");
        lista.forEach(System.out::println);
    }
}
