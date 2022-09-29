package com.ty.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.dto.Bike;

public class BikeCharcyRetrive {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		Bike bike = entityManager.find(Bike.class, 1);

		if (bike != null) {
			System.out.println("*****************Bike Details*******************");
			System.out.println("Bike name is :" + bike.getName());
			System.out.println("Bike cost is:" + bike.getCost());
			System.out.println("****************Charcy Details****************");
			System.out.println(bike.getCharcy());
		} else {
			System.err.println("Not Found");
		}
	}
}
