package br.edu.ifpb.es.daw;

import br.edu.ifpb.es.daw.dao.CustomerDAO;
import br.edu.ifpb.es.daw.dao.impl.CustomerDAOImpl;
import br.edu.ifpb.es.daw.entities.Customer;
import br.edu.ifpb.es.daw.entities.Address;
import br.edu.ifpb.es.daw.util.Util;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;


public class MainCustomerSave {

	public static void main(String[] args) throws DawException {
		try(EntityManagerFactory emf = Persistence.createEntityManagerFactory("daw")) {
			CustomerDAO dao = new CustomerDAOImpl(emf);
			Customer customer = new Customer();

			customer.setFirstName("João");
			customer.setLastName("Silva");
			customer.setPhoneNumber("(83) 1234 5678");
			customer.setEmail(String.format("joao.silva%d@email.com", System.nanoTime()));
			customer.setCreationDate(Util.getDate(2024, 2, 10));
			customer.setDateOfBirth(Util.getDate(1980, 3, 4));
			
			Address address = new Address();
			address.setStreet1("street1");
			address.setStreet2("street2");
			address.setZipcode("123456");
			address.setCity("city");
			address.setCountry("country");
			address.setState("state");
			
			customer.setAddress(address);
			
			System.out.println(customer);

			dao.save(customer);

			System.out.println(customer);
		}
	}

}
