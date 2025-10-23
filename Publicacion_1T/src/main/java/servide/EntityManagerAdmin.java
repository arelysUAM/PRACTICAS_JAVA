package servide;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class EntityManagerAdmin {
    private static final String UNIDAD_PERSISTENCIA = "Publicacion_1T";

    private static EntityManagerFactory emf;

    static {
        emf = Persistence.createEntityManagerFactory(UNIDAD_PERSISTENCIA);
    }

    public static EntityManager getEntityManager() {
        return emf.createEntityManager();
    }
}
