package br.edu.ifpb.es.daw;

import br.edu.ifpb.es.daw.dao.CreditCardDAO;
import br.edu.ifpb.es.daw.dao.impl.CreditCardDAOImpl;
import br.edu.ifpb.es.daw.entities.CreditCard;
import br.edu.ifpb.es.daw.entities.CreditCardType;
import br.edu.ifpb.es.daw.util.Util;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;


public class MainCreditCardUpdate {

	public static void main(String[] args) throws DawException {
		try(EntityManagerFactory emf = Persistence.createEntityManagerFactory("daw")) {
			CreditCardDAO dao = new CreditCardDAOImpl(emf);
			// Primeiro salvar
			CreditCard creditCard = new CreditCard();
			
			creditCard.setNumberCC("" + Util.getRandomCC());
			creditCard.setCreditCardType(CreditCardType.VISA);
			creditCard.setExpiryDate(Util.getDate(2024, 02, 10));
			creditCard.setControlNumber(123);

			dao.save(creditCard);

			System.out.println(creditCard);
			
			// Depois atualizar
			creditCard.setControlNumber(124);
			
			dao.update(creditCard);
			
			System.out.println(creditCard);
		}
	}

}
