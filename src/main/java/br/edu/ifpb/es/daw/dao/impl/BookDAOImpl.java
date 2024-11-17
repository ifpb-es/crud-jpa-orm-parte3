package br.edu.ifpb.es.daw.dao.impl;

import br.edu.ifpb.es.daw.dao.BookDAO;
import br.edu.ifpb.es.daw.entities.Book;
import jakarta.persistence.EntityManagerFactory;

public class BookDAOImpl extends AbstractDAOImpl<Book, Long> implements BookDAO {

    public BookDAOImpl(EntityManagerFactory emf) {
        super(Book.class, emf);
    }

}
