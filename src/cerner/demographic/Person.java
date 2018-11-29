package cerner.demographic;

import java.util.*;

public class Person {
	private Name name;
	private DateOfBirth dateOfBirth;
	private int age;
	private Gender gender;
	private Address address;
	private List<PhoneNumber> phoneNumbers;
	private String SSN;
	public Name getName() {
		return name;
	}
	public void setName(Name name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	 public String getFullName() {
		 return name.getFirstName()+"."+name.getMiddleName()+" "+name.getLastName();//+" "+name.lastName+" "+name.;
	 }
	public Person(Name name, int age,Gender gender,Address address) {
		this.name=name;
		this.age=age;
		this.gender=gender;
		this.address=address;
	}
	public Person(Name name, int age,Gender gender,Address address, DateOfBirth dateOfBirth) {
		this(name,age,gender,address);
		this.dateOfBirth=dateOfBirth;
	}
	public DateOfBirth getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(DateOfBirth dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getSSN() {
		return SSN;
	}
	public void setSSN(String sSN) {
		SSN = sSN;
	}	
	
}
