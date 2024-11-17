package br.edu.ifpb.es.daw;

import br.edu.ifpb.es.daw.dao.CdDAO;
import br.edu.ifpb.es.daw.dao.impl.CdDAOImpl;
import br.edu.ifpb.es.daw.entities.CD;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.List;

public class MainCdGetAll {

	public static void main(String[] args) throws DawException {
		try(EntityManagerFactory emf = Persistence.createEntityManagerFactory("daw")) {
			CdDAO dao = new CdDAOImpl(emf);
			List<CD> cds = dao.getAll();

			for (CD cd : cds) {
				System.out.println(cd);
			}

		}
	}

}
