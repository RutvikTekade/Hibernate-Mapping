package manyToMany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class BookDriver {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("prasad");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Book book1 = new Book();
		
		book1.setId(1);
		book1.setTitle("bhagvatgita");
		book1.setNoofpages(750);
		
		Book book2 = new Book();
		
		book2.setId(2);
		book2.setTitle("wings of fire");
		book2.setNoofpages(1175);
		
		Book book3 = new Book();
		
		book3.setId(3);
		book3.setTitle("ramayan");
		book3.setNoofpages(925);
		
		Auther auther1 = new Auther();
		
		auther1.setId(1);
		auther1.setName("walmiki");
		auther1.setAwards("nobel");
		
		Auther auther2 = new Auther();
		
		auther2.setId(2);
		auther2.setName("dr a p j abdul kalam");
		auther2.setAwards("bharatratna");
		
		Auther auther3 = new Auther();
		
		auther3.setId(3);
		auther3.setName("dadasaheb falke");
		auther3.setAwards("padmashree");
		
		List<Auther> authers1 = new ArrayList<Auther>();
		
		authers1.add(auther1);
		authers1.add(auther3);
		
		List<Auther> authers2 = new ArrayList<Auther>();
		
		authers2.add(auther2);
		
		List<Book> books = new ArrayList<Book>();
		
		books.add(book1);
		books.add(book2);
		books.add(book3);
		
		book1.setAuthers(authers1);
		book2.setAuthers(authers2);
		book3.setAuthers(authers2);
		
		auther1.setBooks(books);
		auther2.setBooks(books);
		auther3.setBooks(books);
		
		et.begin();
		em.persist(book1);
		em.persist(book2);
		em.persist(book3);
		em.persist(auther1);
		em.persist(auther2);
		em.persist(auther3);
		et.commit();
		
		System.out.println("done");
		
		
	}
}
