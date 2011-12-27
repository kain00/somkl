package hu.randras.somkl.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "AUTHORS")
public class Author implements Serializable{
	private static final long serialVersionUID = -4282160129596096981L;
	@Id
	@GeneratedValue
	@Column(name = "ID")
	private long id;
	
	@Column(name = "NEV")
	private String name;
	
	@Column(name = "SZULETESIHELY")
	private String placeOfBirth;
	
	@Column(name = "SZULETETT")
	private int dateOfBirth;
	
	@Column(name = "MEGHALT")
	private int dateOfDie;
	
	public Author() {}
	
	public Author(final String name, final String placeOfBirth, final int dateOfBirth, final int dateOfDie) {
		this.name = name;
		this.placeOfBirth = placeOfBirth;
		this.dateOfBirth = dateOfBirth;
		this.dateOfDie = dateOfDie;
	}

	public long getId() {
		return id;
	}

	public void setId(final long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public String getPlaceOfBirth() {
		return placeOfBirth;
	}

	public void setPlaceOfBirth(final String placeOfBirth) {
		this.placeOfBirth = placeOfBirth;
	}

	public int getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(final int dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public int getDateOfDie() {
		return dateOfDie;
	}

	public void setDateOfDie(final int dateOfDie) {
		this.dateOfDie = dateOfDie;
	}
	
}
