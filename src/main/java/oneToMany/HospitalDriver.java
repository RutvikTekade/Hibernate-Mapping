package oneToMany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class HospitalDriver {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("prasad");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Hospital hospital1 = new Hospital();
		
		hospital1.setId(1);
		hospital1.setName("appollo");
		hospital1.setCountry("india");
		
		Branch branch1 = new Branch();
		
		
		branch1.setId(1);
		branch1.setBranchname("wadnera");
		branch1.setPincode(444705);
		
		Branch branch2 = new Branch();
		
		branch2.setId(2);
		branch2.setBranchname("karve nagar");
		branch2.setPincode(411052);
		
		

		Branch branch3 = new Branch();
		
		branch3.setId(3);
		branch3.setBranchname("mumbai");
		branch3.setPincode(411011);
		
		List<Branch> branches = new ArrayList<Branch>();
		
		branches.add(branch1);
		branches.add(branch2);
		branches.add(branch3);
		
		hospital1.setBranches(branches);
		
		et.begin();
		em.persist(hospital1);
		em.persist(branch1);
		em.persist(branch2);
		em.persist(branch3);
		et.commit();
		
		System.out.println("Done....");
	}
}
