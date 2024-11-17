package br.edu.ifpb.es.daw;

import br.edu.ifpb.es.daw.dao.BookDAO;
import br.edu.ifpb.es.daw.dao.impl.BookDAOImpl;
import br.edu.ifpb.es.daw.entities.Book;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.List;


public class MainBookDeleteAll {

	public static void main(String[] args) throws DawException {
		try(EntityManagerFactory emf = Persistence.createEntityManagerFactory("daw")) {
			BookDAO dao = new BookDAOImpl(emf);
			List<Book> books = dao.getAll();
			for (Book book : books) {
				dao.delete(book.getId());
			}
		}
	}

}
