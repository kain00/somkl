package hu.randras.somkl.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "KIADVANYOK")
public final class Relase implements Serializable {
	private static final long serialVersionUID = -2674019199734477829L;

	@GeneratedValue
	@Column(name = "ID")
	private long id;
	
	@Column(name = "CIM")
	private String title;
	
	@OneToMany
	@Column(name = "SZERZO")
	private long authorId; ////// TODO ??????
	
	@Column(name = "KIADASIEV")
	private int relaseYear;
	
	@Column(name = "KIADO")
	private String publisher;
	
	@Column(name = "MEGJELENESIHELYE")
	private String relasePlace;
	
	@Id
	@Column(name = "RAKTARTISZAM")
	private String stockNo;

	public Relase() {}
	
	public Relase(final String title, final long authorId, final int relaseYear, final String publisher, final String relasePlace, final String stockNo) {
		this.title = title;
		this.authorId = authorId;
		this.relaseYear = relaseYear;
		this.publisher = publisher;
		this.relasePlace = relasePlace;
		this.stockNo = stockNo;
	}
	
	
	public long getId() {
		return id;
	}

	public void setId(final long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(final String title) {
		this.title = title;
	}

	public long getAuthorId() {
		return authorId;
	}

	public void setAuthorId(final long authorId) {
		this.authorId = authorId;
	}

	public int getRelaseYear() {
		return relaseYear;
	}

	public void setRelaseYear(final int relaseYear) {
		this.relaseYear = relaseYear;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(final String publisher) {
		this.publisher = publisher;
	}

	public String getRelasePlace() {
		return relasePlace;
	}

	public void setRelasePlace(final String relasePlace) {
		this.relasePlace = relasePlace;
	}

	public String getStockNo() {
		return stockNo;
	}

	public void setStockNo(final String stockNo) {
		this.stockNo = stockNo;
	}
}
