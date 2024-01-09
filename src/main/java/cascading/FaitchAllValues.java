package cascading;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FaitchAllValues {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("prasad");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Query query = em.createQuery("select s from Country s");
		query.getResultList();            //it is used to exhicute query and privide the resultset in the form of list
		
		List<Country> countries = query.getResultList();
		
		for (Country country : countries) {
			System.out.println(country.getId());
			System.out.println(country.getName());
			System.out.println(country.getPrimeminister());
			System.out.println("======================================");
		}
		
	}
}
