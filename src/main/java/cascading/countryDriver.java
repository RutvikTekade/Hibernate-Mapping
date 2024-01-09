package cascading;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class countryDriver {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("prasad");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Country country1 = new Country();
		
		country1.setId(1);
		country1.setName("India");
		country1.setPrimeminister("Gauri Wadnerkar");
		
		
		Country country2 = new Country();
		
		country2.setId(2);
		country2.setName("USA");
		country2.setPrimeminister("Rutvik Tekade");
		
		Country country3 = new Country();
		
		country3.setId(3);
		country3.setName("ENGLAND");
		country3.setPrimeminister("Rohit Kute");
		
		Country country4 = new Country();
		
		country4.setId(4);
		country4.setName("Japan");
		country4.setPrimeminister("Sachin Mondhale");
		
		et.begin();
		em.persist(country1);
		em.persist(country2);
		em.persist(country3);
		em.persist(country4);
		et.commit();
		
		System.out.println(" countries distributed get ready for world war");
		
		
	}
}
