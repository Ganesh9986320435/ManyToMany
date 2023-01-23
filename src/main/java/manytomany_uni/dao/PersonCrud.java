package manytomany_uni.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import manytomany_uni.dto.Language;
import manytomany_uni.dto.Person;

public class PersonCrud {
	public EntityManager getEntityManager()
	{
		return Persistence.createEntityManagerFactory("gani").createEntityManager();
	}
	public void save(List<Person> list)
	{
		EntityManager entityManager=getEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		for (Person person : list) {
			for (Language language:person.getList()) {
				entityManager.persist(language);
			}
			entityManager.persist(person);
		}
		entityTransaction.commit();
	}
}
