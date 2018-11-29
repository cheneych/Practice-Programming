package cerner.demographic;

public enum CountryCode {
	INDIA("+91"),USA("+1");
	
	CountryCode(String code) {
		this.code=code;
	}
	 final String code;

	public String getCode() {
		return this.code;
	}
}
