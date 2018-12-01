package cerner.patient;
import java.util.*;


public class Doseage extends Medication   {
	private Date startDate;
	private Date endDate;
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
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public DoseTime getDoseTime() {
		return doseTime;
	}
	public Doseage(String medicineID, String medicineName, Date expirationDate, MedicineType medicineType,DoseTime doseTime,float doseQuantity) {
		super( medicineID,  medicineName,  expirationDate,  medicineType);
		this.doseTime=doseTime;
		this.doseQuantity=doseQuantity;
	}
	public Doseage(String medicineID, String medicineName, Date expirationDate, MedicineType medicineType,Date startDate,Date endDate, DoseTime doseTime, float doseQuantity) {
		this(medicineID, medicineName, expirationDate, medicineType,doseTime,doseQuantity); 
		this.startDate = startDate;
		this.endDate=endDate;
		
		}
//	@Override
//	public String toString() {
//		
//		return startDate.DAY_OF_MONTH+"/" + startDate.MONTH+"/"+ startDate.YEAR+" "+this.doseTime+" "+this.doseQuantity;
//	}
	

}
