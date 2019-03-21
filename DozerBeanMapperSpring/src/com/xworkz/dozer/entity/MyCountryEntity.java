package com.xworkz.dozer.entity;

import java.util.List;

public class MyCountryEntity {

	private String name;
	private String address;
	List<StateMyCountryEntity> states;

	public MyCountryEntity() {
		System.out.println("created\t" + this.getClass().getSimpleName());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<StateMyCountryEntity> getPupils() {
		return states;
	}

	public void setPupils(List<StateMyCountryEntity> pupils) {
		this.states = pupils;
	}

	@Override
	public String toString() {
		return "MyCountryEntity [name=" + name + ", address=" + address + ", pupils=" + states + "]";
	}

}
