package servide;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import model.Publicacion;

import java.util.List;

public class PublicacionDAO {
    public static void insert(Publicacion P){
        EntityManager em = EntityManagerAdmin.getEntityManager();
        EntityTransaction tx = em.getTransaction();
        try{
            tx.begin();
            em.persist(P);
            tx.commit();
        } catch(Exception ex){
            tx.rollback();
        }finally{
            em.close();
        }
    }

    public static Publicacion buscar(int id){
        EntityManager em = EntityManagerAdmin.getEntityManager();
        try{
            return em.find(Publicacion.class, id);
        } finally {
            em.close();
        }
    }

    public static void actualizar (Publicacion P){
        EntityManager em = EntityManagerAdmin.getEntityManager();
        EntityTransaction tx = em.getTransaction();
        try{
            tx.begin();
            em.merge(P);
            tx.commit();
        } catch (Exception ex){
            tx.rollback();
        } finally {
            em.close();
        }
    }

    public static List<Publicacion> listar() {
        EntityManager em = EntityManagerAdmin.getEntityManager();
        try {
            return em.createQuery("SELECT p FROM Publicacion p", Publicacion.class)
                    .getResultList();
        } finally {
            em.close();
        }
    }

    public static void eliminar (int id){
        EntityManager em = EntityManagerAdmin.getEntityManager();
        EntityTransaction tx = em.getTransaction();
        try{
            tx.begin();
            Publicacion P = em.find(Publicacion.class, id);
            if (P != null){
                em.remove(P);
                System.out.println("El regristo se eliminó correctamente.");
            } else {
                System.out.println("No existe en el registro con el id: " + id);
            }
            tx.commit();
        } catch (Exception ex){
            tx.rollback();
        } finally {
            em.close();
        }
    }
}
