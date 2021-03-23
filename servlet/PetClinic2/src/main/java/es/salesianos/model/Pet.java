package es.salesianos.model;

public class Pet {
	private String nombreMascota;
	private String identificadorChip;
	private Integer codOwner;
	
	public void setName(String nombreMascota) {
		this.nombreMascota=nombreMascota;
		
	}

	public void setChip(String identificadorChip) {
		this.identificadorChip=identificadorChip;
		
	}

	public String getName() {
		return nombreMascota;
	}

	public String getChip() {
		return identificadorChip;
	}
	


	public Integer getCodOwner() {
		return codOwner;
	}

	public void setCodOwner(Integer codOwner) {
		this.codOwner = codOwner;
	}
}
