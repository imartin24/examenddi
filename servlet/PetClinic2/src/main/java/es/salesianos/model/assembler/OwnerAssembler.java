package es.salesianos.model.assembler;

import javax.servlet.http.HttpServletRequest;

import es.salesianos.model.Owner;

public class OwnerAssembler {

	public static Owner assembleOwnerFrom(HttpServletRequest req) {
		Owner owner = new Owner();
		String codOwner=req.getParameter("codOwner");
		if(null != codOwner) {
			owner.setCodOwner(Integer.parseInt(codOwner));
		}
		String nombreDueño = req.getParameter("nombreDueño");
		String DNI = req.getParameter("DNI");
		owner.setName(nombreDueño);
		owner.setDNI(DNI);
		return owner;
	}
}