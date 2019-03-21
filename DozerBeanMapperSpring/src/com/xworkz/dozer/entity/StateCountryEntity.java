package com.xworkz.dozer.entity;

public class StateCountryEntity {

	String name;
	String batch;
	String address;

	public StateCountryEntity() {
	
	}




	public StateCountryEntity(String name, String batch, String address) {
		super();
		System.out.println("created\t" + this.getClass().getSimpleName());
		this.name = name;
		this.batch = batch;
		this.address = address;
	}




	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBatch() {
		return batch;
	}

	public void setBatch(String batch) {
		this.batch = batch;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "StateCountryEntity [name=" + name + ", batch=" + batch + ", address=" + address + "]";
	}

}
