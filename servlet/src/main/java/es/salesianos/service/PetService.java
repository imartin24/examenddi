package es.salesianos.service;

import javax.servlet.http.HttpServletRequest;

import java.sql.Connection;
import java.util.Date;
import java.util.List;

import es.salesianos.connection.ConnectionH2;
import es.salesianos.connection.ConnectionManager;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import es.salesianos.model.Owner;
import es.salesianos.model.Pet;
import es.salesianos.model.assembler.PetAssembler;
import es.salesianos.repository.Repository;
import es.salesianos.utils.DateConverter;

public class PetService {

	private Repository repository = new Repository();
	
	
	
	public Pet assemblePetFromRequest(HttpServletRequest req) {
		return PetAssembler.assemblePetFrom(req);
	}
	
	public void addPet(Pet pet) {
		repository.insertPet(pet);
		
	}

	public List<Pet> listAllPets() {
		LOGGER.info("ESTAS EN EL ListService");
		return repository.searchAll();
	}
}
