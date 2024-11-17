package br.edu.ifpb.es.daw;

import br.edu.ifpb.es.daw.dao.CreditCardDAO;
import br.edu.ifpb.es.daw.dao.impl.CreditCardDAOImpl;
import br.edu.ifpb.es.daw.entities.CreditCard;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.List;


public class MainCreditCardGetAll {

	public static void main(String[] args) throws DawException {
		try(EntityManagerFactory emf = Persistence.createEntityManagerFactory("daw")) {
			CreditCardDAO dao = new CreditCardDAOImpl(emf);
			List<CreditCard> creditCards = dao.getAll();

			for (CreditCard creditCard : creditCards) {
				System.out.println(creditCard);
			}

		}
	}

}
