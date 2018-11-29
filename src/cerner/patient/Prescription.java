package cerner.patient;

import java.util.*;

import cerner.demographic.*;

public class Prescription {

	private Name doctorName;
	private Name patientName;
	private Name hospitalName;
	private Map<Medication,Doseage> medicine;
	public Name getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(Name doctorName) {
		this.doctorName = doctorName;
	}
	public Name getPatientName() {
		return patientName;
	}
	public void setPatientName(Name patientName) {
		this.patientName = patientName;
	}
	public Name getHospitalName() {
		return hospitalName;
	}
	public void setHospitalName(Name hospitalName) {
		this.hospitalName = hospitalName;
	}
	public Map<Medication, Doseage> getMedicine() {
		return medicine;
	}
	public void setMedicine(Map<Medication, Doseage> medicine) {
		this.medicine = medicine;
	}
	public Prescription(Name doctorName, Name patientName, Name hospitalName, Map<Medication, Doseage> medicine) {
		this.doctorName = doctorName;
		this.patientName = patientName;
		this.hospitalName = hospitalName;
		this.medicine = medicine;
	}
	public Prescription() {
	}
	
	public void displayPrescription() {
		for(Medication med:medicine.keySet()) {
			System.out.println(med.toString() + " "+ medicine.get(med).toString() );
		}
	}
	
}
