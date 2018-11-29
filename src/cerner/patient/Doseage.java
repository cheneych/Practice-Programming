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
	public Calendar getStartDate() {
		return startDate;
	}
	public void setStartDate(Calendar startDate) {
		this.startDate = startDate;
	}
	public DoseTime getDoseTime() {
		return doseTime;
	}
	public Doseage(DoseTime doseTime,float doseQuantity) {
		this.doseTime=doseTime;
		this.doseQuantity=doseQuantity;
	}
	public Doseage(Calendar startDate, DoseTime doseTime, float doseQuantity) {
		this(doseTime,doseQuantity); 
		this.startDate = startDate;
		
		}
	@Override
	public String toString() {
		
		return startDate.DAY_OF_MONTH+"/" + startDate.MONTH+"/"+ startDate.YEAR+" "+this.doseTime+" "+this.doseQuantity;
	}
	

}
