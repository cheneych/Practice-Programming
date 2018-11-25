package cerner.patient;

public class Allergy {
	private String allergtID;
	private String allergyName;
	private Severity severiety;
	private String symptomes;
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
	public Allergy(String allergyName,Severity severiety) {
		this.allergyName=allergyName;
		this.severiety =severiety;
	}
}
