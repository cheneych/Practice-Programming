package cerner.patient;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import cerner.*;
import cerner.demographic.Name;
import cerner.demographic.Prefix;
import cerner.demographic.Suffix;
public class TrialPatient {
	
	
	public static void main(String[] args) throws ParseException {
//		Temperature temp=new Temperature(98, Location.ARMPIT,Metric.FARANHEIT);
//		System.out.println(temp.getTemperatureInCelsius());
		Name p1=new Name("ramesh","as","asdas",Suffix.NULL,Prefix.NULL);
		List<Doseage> mp=new ArrayList<Doseage>();
//		Calendar cal11=Calendar.getInstance();
//		cal.set(2018, 0, 29);
//		Calendar cal1=Calendar.getInstance();
//		cal1.set(2018, 1, 3);
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		Date cal = formatter.parse("2018-11-29");
		Date cal1 = formatter.parse("2018-12-05");
//		Calendar cal = Calendar.getInstance();
//		cal.setTime(startDate);
//		Calendar cal1 = Calendar.getInstance();
//		cal1.setTime(endDate);
		
		Doseage doseage=new Doseage("Med1","Ibprofine",cal,MedicineType.TABLET,cal,cal1,DoseTime.EVERY_FOUR_HOURS, 1);
		Doseage doseage1=new Doseage("Med2","Ibprofine1",cal,MedicineType.TABLET,cal,cal1,DoseTime.EVERY_FOUR_HOURS, 1);
		Doseage doseage2=new Doseage("Med3","Ibprofine2",cal,MedicineType.TABLET,cal,cal1,DoseTime.EVENING, 1);
		Doseage doseage3=new Doseage("Med4","Ibprofine3",cal,MedicineType.TABLET,cal,cal1,DoseTime.EVENING, 1);
		Doseage doseage4=new Doseage("Med5","Ibprofine4",cal,MedicineType.TABLET,cal,cal1,DoseTime.EVENING, 1);
		
		mp.add( doseage);
		mp.add( doseage1);
		mp.add( doseage2);
		mp.add( doseage3);
		mp.add( doseage4);
		Prescription prep=new Prescription(p1,p1,p1,mp);
		
		PatientSchedule n1=new PatientSchedule(prep);
	n1.buildCalendar();
	
//		
//		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
//		Date startDate = formatter.parse("2018-11-29");
//		Date endDate = formatter.parse("2018-12-03");
//		Calendar start = Calendar.getInstance();
//		start.setTime(startDate);
//		Calendar end = Calendar.getInstance();
//		end.setTime(endDate);
//
//		for (Date date = start.getTime(); start.before(end); start.add(Calendar.DATE, 1), date = start.getTime()) {
//		    // Do your job here with `date`.
//		    System.out.println(date);
//		}
	}

}
