package cerner.demographic;

public class PhoneNumber {
	CountryCode countryCode;
	String phoneNumber;
	public PhoneNumber(CountryCode countryCode, String phoneNumber) {
		super();
		this.countryCode = countryCode;
		this.phoneNumber = phoneNumber;
	}
	public CountryCode getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(CountryCode countryCode) {
		this.countryCode = countryCode;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

}
