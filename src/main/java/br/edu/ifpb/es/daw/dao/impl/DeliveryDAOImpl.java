package br.edu.ifpb.es.daw.dao.impl;

import br.edu.ifpb.es.daw.dao.DeliveryDAO;
import br.edu.ifpb.es.daw.entities.Delivery;
import jakarta.persistence.EntityManagerFactory;

public class DeliveryDAOImpl extends AbstractDAOImpl<Delivery, Long> implements DeliveryDAO {

    public DeliveryDAOImpl(EntityManagerFactory emf) {
        super(Delivery.class, emf);
    }

}
