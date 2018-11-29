package cerner.patient;
import java.util.*;

import cerner.*;
import cerner.demographic.Name;
import cerner.demographic.Prefix;
import cerner.demographic.Suffix;
public class TrialPatient {
	
	
	public static void main(String[] args) {
//		Temperature temp=new Temperature(98, Location.ARMPIT,Metric.FARANHEIT);
//		System.out.println(temp.getTemperatureInCelsius());
		Name p1=new Name("ramesh","as","asdas",Suffix.NULL,Prefix.NULL);
		Map<Medication,Doseage> mp=new HashMap<Medication,Doseage>();
		Calendar cal=Calendar.getInstance();
		cal.set(2011, 12, 19);
		
		Medication me=new Medication("Med1","Ibprofine",cal,MedicineType.TABLET);
		Doseage doseage=new Doseage(cal,DoseTime.EVERY_FOUR_HOURS, 1);
		Medication me1=new Medication("Med2","Ibprofine1",cal,MedicineType.TABLET);
		Doseage doseage1=new Doseage(cal,DoseTime.EVERY_FOUR_HOURS, 1);
		Medication me2=new Medication("Med3","Ibprofine2",cal,MedicineType.TABLET);
		Doseage doseage2=new Doseage(cal,DoseTime.NIGHT, 1);
		Medication me3=new Medication("Med4","Ibprofine3",cal,MedicineType.TABLET);
		Doseage doseage3=new Doseage(cal,DoseTime.MORNING, 1);
		Medication me4=new Medication("Med5","Ibprofine4",cal,MedicineType.TABLET);
		Doseage doseage4=new Doseage(cal,DoseTime.EVENING, 1);
		mp.put(me, doseage4);
		mp.put(me1, doseage4);
		mp.put(me2, doseage4);
		mp.put(me3, doseage4);
		mp.put(me4, doseage4);
		Prescription prep=new Prescription(p1,p1,p1,mp);
		prep.displayPrescription();
	
	}

}
