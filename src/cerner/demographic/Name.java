package cerner.demographic;

public class Name {
	private String firstName;
	private String middleName;
	private String lastName;
	private Suffix suffix;
	private Prefix prefix;
	
	public String getFirstName() {
		return this.firstName;
	}
	public String getLastName() {
		return this.lastName;
	}
	public String getMiddleName() {
		return this.middleName;
	}

	public Name(String firstName, String middleName, String lastName, Suffix suffix, Prefix prefix) {
		super();
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.suffix = suffix;
		this.prefix = prefix;
	}
}
