package cerner.patient;

public class Disease {
	private String diseaseName;
	
	public void setDiseaseName(String diseaseName) {
		this.diseaseName=diseaseName;
	}
	
	public String getDiseaseName() {
		return diseaseName;
	}
	
	public Disease(String diseaseName) {
		this.diseaseName=diseaseName;
	}

}
