package es.salesianos.model.assembler;

import javax.servlet.http.HttpServletRequest;

import es.salesianos.model.Pet;

public class PetAssembler {
	public static Pet assemblePetFrom(HttpServletRequest req) {
		Pet pet = new Pet();
		String codOwner=req.getParameter("codOwner");
		String nombreMascota=req.getParameter("nombreMascota");
		String indentificadorChip=req.getParameter("identificadorChip");
		if(null != codOwner) {
			pet.setCodOwner(Integer.parseInt(codOwner));
		}
		pet.setName(nombreMascota);
		pet.setChip(identificadorChip);
		return pet;
	}
}
