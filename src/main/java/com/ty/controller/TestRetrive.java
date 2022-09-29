package com.ty.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ty.dto.Pan;
import com.ty.dto.Person;

public class TestRetrive {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		Person person = entityManager.find(Person.class, 1);

		if (person != null) {
			System.out.println("<<<<<<<<<<<<<<<<<<<<<<Person Information>>>>>>>>>>>>>>>>>>>>>>>>>");
			System.out.println("Person id :" + person.getId());
			System.out.println("Person name is:" + person.getName());
			System.out.println("Person gender is : " + person.getGender());
		}
		System.out.println();

		Pan pan = person.getPen();

		if (pan != null) {
			System.out.println("<<<<<<<<<<<<<<<<<<<<<<<Pan Information>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
			System.out.println("Pan id is:" + pan.getId());
			System.out.println("Pan Number is:" + pan.getNumber());
			System.out.println("Pan type is:" + pan.getType());
		}
	}
}
