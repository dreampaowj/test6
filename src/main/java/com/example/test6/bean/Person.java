package com.example.test6.bean;

import java.util.UUID;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;

public class Person {
	@Embedded
	private PersonId id;
	
	@Embeddable
	public static class PersonId {
		private UUID id;
	}
}
