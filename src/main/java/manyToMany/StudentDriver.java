package manyToMany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class StudentDriver {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("prasad");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Student student1 = new Student();
		
		student1.setId(11);
		student1.setName("Sachin");
		student1.setYearOfPassout(2023);
		student1.setAge(22);
		student1.setMobileNumber(387654321);
		
		Student student2 = new Student();
		
		student2.setId(12);
		student2.setName("Gauri");
		student2.setYearOfPassout(2021);
		student2.setAge(23);
		student2.setMobileNumber(1234567890);
		
		
		Student student3 = new Student();
		
		student3.setId(13);
		student3.setName("Rohit");
		student3.setYearOfPassout(2023);
		student3.setAge(22);
		student3.setMobileNumber(908776453);
		
		Course course1 = new Course();
		
		course1.setId(11);
		course1.setName("core java");
		course1.setDuration(90);
		
		Course course2 = new Course();
		
		course2.setId(12);
		course2.setName("sql");
		course2.setDuration(45);
		
		Course course3 = new Course();
		
		course3.setId(13);
		course3.setName("java advanced");
		course3.setDuration(30);
		
		List<Course> courses1 = new ArrayList<Course>();
		courses1.add(course1);
		courses1.add(course2);
		courses1.add(course3);
		
		List<Course> courses2 = new ArrayList<Course>();
		
		courses2.add(course1);
		courses2.add(course2);
		
		
		student1.setCourses(courses1);
		student2.setCourses(courses2);
		student3.setCourses(courses1);
		
		List<Student> students = new ArrayList<Student>();
		
		students.add(student1);
		students.add(student2);
		students.add(student3);
		
		et.begin();
		em.persist(student1);
		em.persist(student2);
		em.persist(student3);
		em.persist(course1);
		em.persist(course2);
		em.persist(course3);
		//em.persist(courses1);
		//em.persist(courses2);
		//em.persist(students);
		et.commit();
	}
}
