package cascading;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class LoginValidation {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("prasad");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter email");
		String email = sc.next();
		
		System.out.println("enter password");
		String password = sc.next();
		
		Query query = em.createQuery("select b from User b where b.email=?1 and b.password =?2");
		query.setParameter(1, email);
		query.setParameter(2, password);
		
		List<User> user = query.getResultList();
		
		if (user.size()>0) {
			System.out.println("welcome user "+email);
		} else {
			System.out.println("invalid credentials");

		}
	}
}
