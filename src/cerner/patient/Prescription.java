package cerner.patient;

import java.util.*;

import cerner.demographic.*;

public class Prescription {

	private Name doctorName;
	private Name patientName;//add patient id
	private Name hospitalName;
	private List<Doseage> medicine;
	
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
	public List<Doseage> getMedicine() {
		return medicine;
	}
	public void setMedicine(List<Doseage> medicine) {
		this.medicine = medicine;
	}
	public Prescription(Name doctorName, Name patientName, Name hospitalName, List<Doseage> medicine) {
		this.doctorName = doctorName;
		this.patientName = patientName;
		this.hospitalName = hospitalName;
		this.medicine = medicine;
	}
	public Prescription() {
	}
	
	
	
	}
	

