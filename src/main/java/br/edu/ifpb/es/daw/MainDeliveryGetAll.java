package br.edu.ifpb.es.daw;

import br.edu.ifpb.es.daw.dao.DeliveryDAO;
import br.edu.ifpb.es.daw.dao.impl.DeliveryDAOImpl;
import br.edu.ifpb.es.daw.entities.Delivery;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.List;

public class MainDeliveryGetAll {

	public static void main(String[] args) throws DawException {
		try(EntityManagerFactory emf = Persistence.createEntityManagerFactory("daw")) {
			DeliveryDAO dao = new DeliveryDAOImpl(emf);
			List<Delivery> deliveries = dao.getAll();

			for (Delivery delivery : deliveries) {
				System.out.println(delivery);
			}

		}
	}

}
