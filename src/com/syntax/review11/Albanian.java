package com.syntax.review11;

public class Albanian extends Human {
	String albanianId;

	public Albanian() {

	}

	public Albanian(String name, int age, int weight, String albanianId) {
		super(name, age, weight);
		this.albanianId = albanianId;
	}

	@Override
	public String greeting() {
		return "Pershendetje!";
	}

	@Override
	public void talk() {
		System.out.println("Une flas shqip. Une quhen " + name);
	}
	
	public void albanianDance() {
		System.out.println("Dancing like an albanian.");
	}

}
