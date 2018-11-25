package cerner.patient;
import java.util.*;

import cerner.demographic.*;
import cerner.temperature.*;

public class Patient extends Person{

	private List<Allergy> allergies;
	private List<Disease> diseases;
	private List<Medication> medicine;
	private Temperature temperature;
	private Calendar lastVisited;
	private String comment;
	public Patient(Name name, int age, Gender gender, Address address,List<Allergy> allergies,List<Disease> diseases,	List<Medication> medicine,Temperature temperature,	Calendar lastVisited,	String comment) {
		super(name, age, gender, address);
		this.allergies=allergies;
		this.diseases=diseases;
		this.medicine=medicine;
		this.temperature=temperature;
		this.lastVisited=lastVisited;
		this.comment=comment;
		
	}
	public Temperature getTemperature() {
		return temperature;
	}
	public void setTemperature(Temperature temperature) {
		this.temperature = temperature;
	}
	public Patient(Name name,int age,Gender gender,Address address) {
		super(name,age,gender,address);
	}
	public List<Allergy> getAllergies() {
		return allergies;
	}
	public void setAllergies(List<Allergy> allergies) {
		this.allergies = allergies;
	}
	public List<Disease> getDiseases() {
		return diseases;
	}
	public void setDiseases(List<Disease> diseases) {
		this.diseases = diseases;
	}
	public List<Medication> getMedicine() {
		return medicine;
	}
	public void setMedicine(List<Medication> medicine) {
		this.medicine = medicine;
	}
	public Calendar getLastVisited() {
		return this.lastVisited;
	}
	public void setLastVisited(Calendar lastVisited) {
		this.lastVisited = lastVisited;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public Boolean hasFeaver() {
		if(this.temperature.getTemperature()>98.6) {
			return true;
		}
		return false;
	}
	
	
	public static void main(String[] args) {
		Calendar cal=Calendar.getInstance();
		cal.set(2018, 12, 19);
		//Calendar.YEAR);
		Name name=new Name("ramesh","r","ramesh",Suffix.NULL,Prefix.NULL);
	Patient p1=new Patient(name,25,Gender.MALE,new Address("India","karnataka","asda","1231411","1231"));
	List<Allergy> a1 = new ArrayList<>();
	a1.add(new Allergy("something", Severity.HIGH));
	a1.add(new Allergy("sdfs", Severity.LOW));
	p1.setAllergies(a1);
	List<Disease> d1 = new ArrayList<>();
	d1.add(new Disease("disease"));
	d1.add(new Disease("disease"));
	p1.setDiseases(d1); 
	p1.setTemperature(new Temperature((float) 98.6, Location.ARMPIT));
	System.out.println(p1.getFullName());
	
	}
}
