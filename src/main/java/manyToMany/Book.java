package manyToMany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Book {

	@Id
	private int id;
	private String title;
	private int noofpages;
	
	@ManyToMany
	List<Auther>Authers;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getNoofpages() {
		return noofpages;
	}

	public void setNoofpages(int noofpages) {
		this.noofpages = noofpages;
	}

	public List<Auther> getAuthers() {
		return Authers;
	}

	public void setAuthers(List<Auther> authers) {
		Authers = authers;
	}
	
	
}
