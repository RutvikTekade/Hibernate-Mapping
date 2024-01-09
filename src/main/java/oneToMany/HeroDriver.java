package oneToMany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class HeroDriver {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("prasad");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Hero hero1 = new Hero();
		
		hero1.setId(3);
		hero1.setName("salman khan");
		hero1.setAge(57);
		
		Hero hero2 = new Hero();
		
		hero2.setId(4);
		hero2.setName("allu arjun");
		hero2.setAge(45);
		
		Movie movie1 = new Movie();
		
		movie1.setId(1);
		movie1.setMoviename("tere naam");
		movie1.setCollection(15000000);
		
	
		Movie movie2 = new Movie();
		
		movie2.setId(3);
		movie2.setMoviename("wanted");
		movie2.setCollection(3000000);
		
		Movie movie3 = new Movie();
		
		movie3.setId(4);
		movie1.setMoviename("pushppa");
		movie1.setCollection(10000000);
		
		Movie movie4 = new Movie();
		
		movie4.setId(5);
		movie4.setMoviename("DJ");
		movie4.setCollection(35000000);
		
		List<Movie> movies1 = new ArrayList<Movie>();
		
		movies1.add(movie1);
		movies1.add(movie2);
		
		List<Movie> movies2 = new ArrayList<Movie>();
		
		movies2.add(movie3);
		movies2.add(movie4);
		
		List<Hero> heros = new ArrayList<Hero>();
		
		heros.add(hero1);
		heros.add(hero2);
	
		
		et.begin();
		em.persist(hero1);
		em.persist(hero2);
		em.persist(movie1);
		em.persist(movie2);
		em.persist(movie3);
		em.persist(movie4);
		
		et.commit();
		
		System.out.println("you are best !");
	}
}
