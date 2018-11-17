package cerner.patient;

import java.util.*;

public class Medication {
	private String medicineName;
	private Date startDate;
	private Date endDate;
	private List<Doseage> doseage;
	
	public void setMedicineName(String medicineName) {
		this.medicineName=medicineName;
	}
	public void setStartDate(Date startDate) {
		this.startDate=startDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate=endDate;
	}
	public String getMedicineName(String medicineName) {
		return this.medicineName;
	}
	public Date getStartDate(Date startDate) {
		return this.startDate;
	}
	public Date getEndDate(String endDate) {
		return this.endDate;
	}
	public List<Doseage> getDoseage() {
		return doseage;
	}
	public void setDoseage(List<Doseage> doseage) {
		this.doseage = doseage;
	}

}
