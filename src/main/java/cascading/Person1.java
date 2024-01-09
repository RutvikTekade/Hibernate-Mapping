package cascading;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Person1 {

	@Id
	private int id;
	private String name;
	private int age;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Pan1 pan;

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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Pan1 getPan() {
		return pan;
	}

	public void setPan(Pan1 pan) {
		this.pan = pan;
	}

	
	
	
	
	
	
	
	
}
