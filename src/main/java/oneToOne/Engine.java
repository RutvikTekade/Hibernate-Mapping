package oneToOne;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Engine {

	@Id
	private int id;
	private int cc;
	
	@OneToOne
	private Car car;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCc() {
		return cc;
	}

	public void setCc(int cc) {
		this.cc = cc;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	//@Override
	//public String toString() {
		//return "Engine [id=" + id + ", cc=" + cc + ", car=" + car + "]";
	//}
	
	
	
	
}
