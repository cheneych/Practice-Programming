package cerner.demographic;

public class Address {
	private String country;
	private String state;
	private String street;
	private String zipCode;
	private String phoneNumber; // or should use integer
	
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public Address(String country,String state,String street,String phoneNumber,String zipCode) {
		this.country=country;
		this.state=state;
		this.street=street;
		this.phoneNumber=phoneNumber;
		this.zipCode=zipCode;
	}
	
	public String getFullAddress() {
		return (this.street+" "+this.state+" "+this.country+" "+this.zipCode );
	}
	
	

}
