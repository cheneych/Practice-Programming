package cerner.demographic;

public class Person {
	private String name;
	private int age;
	private String gender; //should use enum?
	private Address address;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public Person(String name, int age,String gender,Address address) {
		this.name=name;
		this.age=age;
		this.gender=gender;
		this.address=address;
	}	
	
}
