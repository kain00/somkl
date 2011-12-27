package hu.randras.somkl.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * A technikákat reprezentáló osztály
 * @author Romhanyi Andras
 */

@Entity
@Table(name = "TECHNIKAK")
public final class Technics implements Serializable {
	private static final long serialVersionUID = 1264733074389221781L;
	@Id
	@GeneratedValue
	@Column(name = "ID")
	private long id;
	@Column(name = "TECHNIKA")
	private String technics;
	
	public Technics() {}
	
	public Technics(final String technic) {
		this.technics = technic;
	}
	
	public long getId() {
		return id;
	}

	public void setId(final long id) {
		this.id = id;
	}

	public String getTechnic() {
		return technics;
	}

	public void setTechnic(final String technics) {
		this.technics = technics;
	}
}
