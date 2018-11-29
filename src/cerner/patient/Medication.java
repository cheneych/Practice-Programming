package cerner.patient;

import java.util.*;

public class Medication {
	private String medicineID;
	private String medicineName;
	private Calendar expirationDate;
	private MedicineType medicineType;
	public Medication(String medicineID, String medicineName, Calendar expirationDate, MedicineType medicineType) {
		super();
		this.medicineID = medicineID;
		this.medicineName = medicineName;
		this.expirationDate = expirationDate;
		this.medicineType = medicineType;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.medicineID+" "+this.medicineName+" "+expirationDate.DATE+"/"+expirationDate.MONTH+"/"+expirationDate.YEAR+" "+medicineType;
	}
}
