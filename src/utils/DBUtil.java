package utils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DBUtil {
    private static final String PERSISTEMCE_UNIT_NAME  "message_baoard";
    private static EntityManagerFactory emf;

    public static EntityManager creareEntityManager() {
        return getEntityManagerFactory().createEntityManager();
    }

    private static EntityManagerFactory getEntityManagerFactory() {
        if(emf == null) {
            emf = Persistence.createEntityManagerFactory(PERSISTEMCE_UNIT_NAME);
        }
        return emf;
    }



}
