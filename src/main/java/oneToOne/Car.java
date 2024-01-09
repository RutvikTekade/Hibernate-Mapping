package oneToOne;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Car {

	@Id
	private int id;
	@Override
	public String toString() {
		return "Car [id=" + id + ", brand=" + brand + ", price=" + price + ", engine=" + engine + "]";
	}

	private String brand;
	private int price;
	
	@OneToOne
	
	private Engine engine;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}
}
