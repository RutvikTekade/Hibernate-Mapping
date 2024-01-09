package cascading;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Country {

	@Id
	private int id;
	private String name;
	private String primeminister;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPrimeminister() {
		return primeminister;
	}
	public void setPrimeminister(String primeminister) {
		this.primeminister = primeminister;
	}
	
	
	
	
	
}
