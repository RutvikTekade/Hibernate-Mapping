package cascading;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class PersonDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("prasad");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Person1 person1 = new Person1();
		
		person1.setId(1);
		person1.setName("Sachin");
		person1.setAge(23);
		
		Pan1 pan1 = new Pan1();
		
		pan1.setId(1);
		pan1.setPanno("BTRPT7263D");
		pan1.setAddress("bhusawal");
		
		person1.setPan(pan1);
		
		et.begin();
		em.persist(person1);
		et.commit();
		
		System.out.println("operation cascading is successfull");

	}

}
