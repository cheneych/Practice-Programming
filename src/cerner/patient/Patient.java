package cerner.patient;
import java.util.*;

import cerner.demographic.*;

public class Patient extends Person{

	List<Allergy> allergies;
	List<Disease> diseases;
	List<Medication> medicine;
	Date lastVisited;
	String comment;
	public Patient(String name, int age, String gender, Address address,List<Allergy> allergies,List<Disease> diseases,	List<Medication> medicine,	Date lastVisited,	String comment) {
		super(name, age, gender, address);
		this.allergies=allergies;
		this.diseases=diseases;
		this.medicine=medicine;
		this.lastVisited=lastVisited;
		this.comment=comment;
		
	}
}
