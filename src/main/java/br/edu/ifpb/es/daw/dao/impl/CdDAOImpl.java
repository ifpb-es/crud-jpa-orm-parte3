package br.edu.ifpb.es.daw.dao.impl;

import br.edu.ifpb.es.daw.dao.CdDAO;
import br.edu.ifpb.es.daw.entities.CD;
import jakarta.persistence.EntityManagerFactory;

public class CdDAOImpl extends AbstractDAOImpl<CD, Long> implements CdDAO {

    public CdDAOImpl(EntityManagerFactory emf) {
        super(CD.class, emf);
    }

}
