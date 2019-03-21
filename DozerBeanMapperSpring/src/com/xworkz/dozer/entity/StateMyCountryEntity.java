package com.xworkz.dozer.entity;

public class StateMyCountryEntity {

	String name;
	String batchName;
	String homeAddress;

	public StateMyCountryEntity() {

	}

	public StateMyCountryEntity(String name, String batchName, String homeAddress) {
		super();
		System.out.println("created\t" + this.getClass().getSimpleName());
		this.name = name;
		this.batchName = batchName;
		this.homeAddress = homeAddress;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBatchName() {
		return batchName;
	}

	public void setBatchName(String batchName) {
		this.batchName = batchName;
	}

	public String getHomeAddress() {
		return homeAddress;
	}

	public void setHomeAddress(String homeAddress) {
		this.homeAddress = homeAddress;
	}

	@Override
	public String toString() {
		return "StateMyCountryEntity [name=" + name + ", batchName=" + batchName + ", homeAddress=" + homeAddress + "]";
	}

}
