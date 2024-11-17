package br.edu.ifpb.es.daw.dao.impl;

import br.edu.ifpb.es.daw.dao.CustomerDAO;
import br.edu.ifpb.es.daw.entities.Customer;
import jakarta.persistence.EntityManagerFactory;

public class CustomerDAOImpl extends AbstractDAOImpl<Customer, Long> implements CustomerDAO {

    public CustomerDAOImpl(EntityManagerFactory emf) {
        super(Customer.class, emf);
    }

}
