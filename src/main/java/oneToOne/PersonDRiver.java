package oneToOne;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class PersonDRiver {
	
	
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory( "prasad");
		
		EntityManager em = emf.createEntityManager();
		
		EntityTransaction et = em.getTransaction();
		
		Person p = new Person();
		
		p.setId(4);
		p.setName("sachin");
		p.setAge(24);
		

		Pan p1= new Pan();
		
		p1.setId(4);
		p1.setPannum("BTRPT7266D");
		p1.setAddress("deccan");
		
		p.setPan(p1);
		
		et.begin();
		em.persist( p);
		em.persist(p1);
		et.commit();
	}

}
