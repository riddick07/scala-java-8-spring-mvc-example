package name.dargiri.data.dao;

import javax.persistence.EntityManager;

public interface EntityManagerAware {
    EntityManager getEntityManager();
}
