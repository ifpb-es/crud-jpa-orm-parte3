package br.edu.ifpb.es.daw;

import br.edu.ifpb.es.daw.dao.DeliveryDAO;
import br.edu.ifpb.es.daw.dao.impl.DeliveryDAOImpl;
import br.edu.ifpb.es.daw.entities.Delivery;
import br.edu.ifpb.es.daw.entities.Address;
import br.edu.ifpb.es.daw.util.Util;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class MainDeliveryGetByID {

	public static void main(String[] args) throws DawException {
		try(EntityManagerFactory emf = Persistence.createEntityManagerFactory("daw")) {
			DeliveryDAO dao = new DeliveryDAOImpl(emf);
			// Primeiro salvar
			Delivery delivery = new Delivery();

			delivery.setPrazo(Util.getDate(2024, 07, 22));

			Address address = new Address();
			address.setStreet1("street1");
			address.setStreet2("street2");
			address.setZipcode("123456");
			address.setCity("city");
			address.setCountry("country");
			address.setState("state");

			delivery.setAddress(address);

			dao.save(delivery);

			// Depois recuperar pelo identificador
			Delivery resultado = dao.getByID(delivery.getId());

			System.out.println(delivery.equals(resultado));
		}
	}

}
