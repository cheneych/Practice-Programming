package cerner.patient;
import java.util.*;


public class Doseage   {
	private Calendar startDate;
	private DoseTime doseTime;
	private float doseQuantity;
	//private 
	
	public DoseTime getTimeOfDay() {
		return this.doseTime;
	}
	public void setDoseTime(DoseTime doseTime) {
		this.doseTime=doseTime;
		
	}
	public float getDoseQuantity() {
		return doseQuantity;
	}
	public void setDoseQuantity(float doseQuantity) {
		this.doseQuantity = doseQuantity;
	}
	
	public Doseage(DoseTime doseTime,float doseQuantity) {
		this.doseTime=doseTime;
		this.doseQuantity=doseQuantity;
	}

}
