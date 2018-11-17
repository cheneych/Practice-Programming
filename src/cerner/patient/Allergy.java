package cerner.patient;

public class Allergy {
	private String allergyName;
	private Severity severiety;
	public String getAllergyName() {
		return allergyName;
	}
	public void setAllergyName(String allergyName) {
		this.allergyName = allergyName;
	}
	public Severity getSeveriety() {
		return severiety;
	}
	public void setSeveriety(Severity severiety) {
		this.severiety = severiety;
	}
}
