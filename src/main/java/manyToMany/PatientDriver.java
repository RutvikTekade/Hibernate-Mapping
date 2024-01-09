package manyToMany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class PatientDriver {
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("prasad");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Patient patient1 = new Patient();
		
		patient1.setId(1);
		patient1.setName("gauri");
		patient1.setBloodgrp("A+");
		patient1.setAge(24);
		
		Patient patient2 = new Patient();
		
		patient2.setId(2);
		patient2.setName("sachin");
		patient2.setBloodgrp("A+");
		patient2.setAge(23);
		
		Patient patient3 = new Patient();
		
		patient3.setId(3);
		patient3.setName("rohit");
		patient3.setBloodgrp("o+");
		patient3.setAge(23);
		
		Disease disease1 = new Disease();
		
		disease1.setId(1);
		disease1.setDname("covid19");
		disease1.setSymptoms("fever,coufgh,throutache");
		
		Disease disease2 = new Disease();
		
		disease2.setId(2);
		disease2.setDname("loveria");
		disease2.setSymptoms("sleeploss,overthinking,loss of hunger");
		
		Disease disease3 = new Disease();
		
		disease3.setId(3);
		disease3.setDname("chickenpox");
		disease3.setSymptoms("pimples on body,night fewer");
		
		List<Disease> diseases1 = new ArrayList<Disease>();
		
		diseases1.add(disease1);
		diseases1.add(disease3);
		
		List<Disease> diseases2 = new ArrayList<Disease>();
		
		diseases2.add(disease2);
		diseases2.add(disease3);
		
		List<Disease> diseases3 = new ArrayList<Disease>();
		
		diseases3.add(disease1);
		diseases3.add(disease2);
		
		patient1.setDiseases(diseases2);
		patient2.setDiseases(diseases1);
		patient3.setDiseases(diseases3);
		
		List<Patient> patients = new ArrayList<Patient>();
		
		patients.add(patient1);
		patients.add(patient2);
		patients.add(patient3);
		
		et.begin();
		em.persist(patient1);
		em.persist(patient2);
		em.persist(patient3);
		em.persist(disease1);
		em.persist(disease2);
		em.persist(disease3);
		et.commit();
	}

}
