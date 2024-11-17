package br.edu.ifpb.es.daw;

import br.edu.ifpb.es.daw.dao.CdDAO;
import br.edu.ifpb.es.daw.dao.impl.CdDAOImpl;
import br.edu.ifpb.es.daw.entities.CD;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.HashMap;
import java.util.Map;


public class MainCdDelete {

	public static void main(String[] args) throws DawException {
		try(EntityManagerFactory emf = Persistence.createEntityManagerFactory("daw")) {
			CdDAO dao = new CdDAOImpl(emf);
			// Primeiro salvar
			CD cd = new CD();

			cd.setTitle("Título do CD");
			cd.setDescription("Descrição do CD");
			cd.setPrice(35.0f);
			cd.setCover("cover".getBytes());
			Map<Integer, String> tracks = new HashMap<Integer, String>();
			tracks.put(1, "faixa 1");
			tracks.put(2, "faixa 2");
			tracks.put(3, "faixa 3");
			cd.setTracks(tracks);
			
			dao.save(cd);

			System.out.println(dao.getAll().size());

			// Depois apagar
			
			dao.delete(cd.getId());
			
			System.out.println(dao.getAll().size());
		}
	}

}
