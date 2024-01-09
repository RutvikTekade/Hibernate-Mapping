package oneToOne;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class MobileDriver {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("prasad");
		EntityManager em = emf.createEntityManager( );
		EntityTransaction et = em.getTransaction();
		
		/*Mobile mobile = new Mobile();
		
		mobile.setId(4);
		mobile.setBrand("nokia");
		mobile.setPrice(23000);
		
		Battery battery = new Battery();
		
		battery.setId(4);
		battery.setPrice("3500");
		battery.setMah(4800);
		
		mobile.setBattery(battery);
		battery.setMobile(mobile);
		
		et.begin();
		em.persist(mobile);
		em.persist(battery);
		et.commit();
		*/
		
		Mobile m1 = em.find(Mobile.class, 3);
		
		System.out.println(m1);
	}
}
