package es.salesianos.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Owner {
	private Integer codOwner;
	private String nombreDueño;
	private String DNI;
	private List<Pet> mascotas = new ArrayList<Pet>();
	
	public void setMascotas(List<Pet> mascotas) {
		this.mascotas=mascotas;
	}
	
	public List<Pet> getMascotas() {
		return mascotas;
	}
	
	
	public void addToListPet(Pet pet) {
		mascotas.add(pet);
	}

	public void setName(String nombreDueño) {
		this.nombreDueño=nombreDueño;
	}

	public String getName() {
		return nombreDueño;
	}
	
	public void setCodOwner(Integer codOwner) {
		this.codOwner=codOwner;
	}
	
	public Integer getCodOwner() {
		return codOwner;
	}

	public void setDNI(String DNI) {
		this.DNI=DNI;
	}
	
	public String getDNI() {
		return DNI;
	}

	@Override
	public String toString() {
		return "User [codOwner="+codOwner+ "name=" + nombreDueño + ", DNI=" + DNI + "]";
	}
	

}
