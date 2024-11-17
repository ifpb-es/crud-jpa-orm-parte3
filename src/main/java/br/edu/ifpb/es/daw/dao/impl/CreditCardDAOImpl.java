package br.edu.ifpb.es.daw.dao.impl;

import br.edu.ifpb.es.daw.dao.CreditCardDAO;
import br.edu.ifpb.es.daw.entities.CreditCard;
import jakarta.persistence.EntityManagerFactory;

public class CreditCardDAOImpl extends AbstractDAOImpl<CreditCard, Long> implements CreditCardDAO {

    public CreditCardDAOImpl(EntityManagerFactory emf) {
        super(CreditCard.class, emf);
    }

}
