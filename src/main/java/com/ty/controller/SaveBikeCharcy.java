package com.ty.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.dto.Bike;
import com.ty.dto.Charcy;

public class SaveBikeCharcy {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		Bike bike = new Bike();
		bike.setName("DUKE");
		bike.setCost(122000.00);

		Charcy charcy = new Charcy();
		charcy.setType("Backbone frame");
		bike.setCharcy(charcy);
		charcy.setBike(bike);

		entityTransaction.begin();
		entityManager.persist(charcy);
		entityManager.persist(bike);
		entityTransaction.commit();
	}

}
