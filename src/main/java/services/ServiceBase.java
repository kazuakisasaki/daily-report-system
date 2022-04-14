package services;

import javax.persistence.EntityManager;

import utils.DButil;

public class ServiceBase {

    protected EntityManager em = DButil.createEntityManager();

    public void close() {
        if(em.isOpen()) {
            em.close();
        }
    }

}
