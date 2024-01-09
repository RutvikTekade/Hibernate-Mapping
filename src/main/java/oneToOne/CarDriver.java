package oneToOne;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class CarDriver {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("prasad");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Car car = new Car();
		
		car.setId(4);
		car.setBrand("ducati");
		car.setPrice(34000000);
		
		Engine engine = new Engine();
		
		engine.setId(4);
		engine.setCc(8000);
		
		car.setEngine(engine);
		engine.setCar(car);
		
		et.begin();
		em.persist(car);
		em.persist(engine);
		et.commit();
		
		//Car c1 = em.find(Car.class,1);
		//System.out.println(c1);
	}
}
