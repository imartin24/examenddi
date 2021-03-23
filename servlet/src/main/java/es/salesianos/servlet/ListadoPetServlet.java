package es.salesianos.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import es.salesianos.model.Owner;
import es.salesianos.repository.Repository;
import es.salesianos.service.OwnerService;
import es.salesianos.service.PetService;

public class ListadoPetServlet extends HttpServlet {
	private static final Logger log = LogManager.getLogger(ListadoOwnerServlet.class);
	private PetService servicio = new  PetService();
	private Repository repository = new  Repository();
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<Pet> listAllPets = servicio.listAllPets();
		req.setAttribute("listAllPets", listAllPets);
		log.debug("This is a debug message");
		
		
        log.info("This is an info message");
        log.warn("This is a warn message");
        log.error("This is an error message");
        log.fatal("This is a fatal message");
		redirect(req,resp);
	}
	
	
	protected void redirect(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/listOwner.jsp");
		dispatcher.forward(req,resp);
	}
}
