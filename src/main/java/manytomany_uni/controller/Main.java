package manytomany_uni.controller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import manytomany_uni.dto.Course;
import manytomany_uni.dto.Student;

public class Main {
	public static void main(String[] args) {
		Course course=new Course();
		course.setId(32);
		course.setName("java");
		Course course1=new Course();
		course1.setId(42);
		course1.setName("Ajava");
		Student student=new Student();
		student.setId(33);
		student.setName("gani");
		Student student1=new Student();
		student1.setId(43);
		student1.setName("Mani");
		List<Course> list=new ArrayList<Course>();
		list.add(course);
		list.add(course1);
		student.setList(list);
		student1.setList(list);
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("gani");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(course);
		entityManager.persist(course1);
		entityManager.persist(student);
		entityManager.persist(student1);
		entityTransaction.commit();
		Query query=entityManager.createQuery("select a from Student a");
		List<Student> list2=query.getResultList();
		System.out.println(list2);
	}
}
