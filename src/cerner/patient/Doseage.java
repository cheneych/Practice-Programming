package cerner.patient;
import java.util.*;

public class Doseage {
	private Date timeOfDay;
	private float dose;
	
	public Date getTimeOfDay() {
		return timeOfDay;
	}
	public void setTimeOfDay(Date timeOfDay) {
		this.timeOfDay = timeOfDay;
	}
	public float getDose() {
		return dose;
	}
	public void setDose(float dose) {
		this.dose = dose;
	}
	
	public Doseage(Date timeOfDay,float dose) {
		this.timeOfDay=timeOfDay;
		this.dose=dose;
	}

}
