package cerner.patient;

import java.util.*;

public class Medication {
	private String medicineID;
	private String medicineName;
	private Date expirationDate;
	private MedicineType medicineType;
	public String getMedicineID() {
		return medicineID;
	}
	public void setMedicineID(String medicineID) {
		this.medicineID = medicineID;
	}
	public String getMedicineName() {
		return medicineName;
	}
	public void setMedicineName(String medicineName) {
		this.medicineName = medicineName;
	}
	public Date getExpirationDate() {
		return expirationDate;
	}
	public void setExpirationDate(Date expirationDate) {
		this.expirationDate = expirationDate;
	}
	public MedicineType getMedicineType() {
		return medicineType;
	}
	public void setMedicineType(MedicineType medicineType) {
		this.medicineType = medicineType;
	}
	public Medication(String medicineID, String medicineName, Date expirationDate, MedicineType medicineType) {
		super();
		this.medicineID = medicineID;
		this.medicineName = medicineName;
		this.expirationDate = expirationDate;
		this.medicineType = medicineType;
	}
//	@Override
//	public String toString() {
//		// TODO Auto-generated method stub
//		return this.medicineID+" "+this.medicineName+" "+expirationDate.DATE+"/"+expirationDate.MONTH+"/"+expirationDate.YEAR+" "+medicineType;
//	}
}
