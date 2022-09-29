package com.ty.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.dto.Pan;
import com.ty.dto.Person;

public class PersonController {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		Person person = new Person();
		person.setName("Vikas");
		person.setGender("male");

		Pan pan = new Pan();
		pan.setNumber("300");
		pan.setType("Business");

		pan.setPerson(person);

		entityManager.persist(person);
		entityManager.persist(pan);

		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityTransaction.commit();

	}
}
