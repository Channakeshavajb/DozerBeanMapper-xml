package com.xworkz.dozer.entity;

import java.util.List;

public class CountryEntity {

	private String name;
	private String address;
	List<StateCountryEntity> state;

	public CountryEntity() {
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

	public List<StateCountryEntity> getState() {
		return state;
	}

	public void setState(List<StateCountryEntity> state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "CountryEntity [name=" + name + ", address=" + address + ", state=" + state + "]";
	}

}
