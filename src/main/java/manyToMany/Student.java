package manyToMany;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Student {

	@Id
	private int id;
	
	@Column(nullable = false)
	private String name;
	
	private int yearOfPassout;
	private int age;
	
	@Column(unique = true)
	private long mobileNumber;
	
	@ManyToMany
	List<Course> courses;

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

	public int getYearOfPassout() {
		return yearOfPassout;
	}

	public void setYearOfPassout(int yearOfPassout) {
		this.yearOfPassout = yearOfPassout;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}
	
	
	
	
	
	
}
