package cascading;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UserDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("prasad");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		User user1 = new User();
		
		user1.setId(1);
		user1.setName("Sachin");
		user1.setEmail("sachin@gmail.com");
		user1.setPassword("1234");


		User user2 = new User();
		
		user2.setId(2);
		user2.setName("gauri");
		user2.setEmail("gauri@gmail.com");
		user2.setPassword("1234");


		User user3 = new User();
		
		user3.setId(3);
		user3.setName("Rohit");
		user3.setEmail("rohit@gmail.com");
		user3.setPassword("1234");


		User user4 = new User();
		
		user4.setId(4);
		user4.setName("Rutvik");
		user4.setEmail("rutvik@gmail.com");
		user4.setPassword("1234");

		et.begin();
		em.persist(user1);
		em.persist(user2);
		em.persist(user3);
		em.persist(user4);
		et.commit();
		
		System.out.println("user info added");
		
	}

}
