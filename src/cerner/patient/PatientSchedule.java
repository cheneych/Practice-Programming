package cerner.patient;

import java.util.Calendar;
import java.util.Date;

public class PatientSchedule {
	private Prescription prescription;
	private Calendar patientCalender;
	public PatientSchedule(Prescription prescription) {
		super();
		this.prescription = prescription;
		this.patientCalender=Calendar.getInstance();
	}
	
	
	public void buildCalendar() {
		
		for (Doseage dose : prescription.getMedicine()) {
			if(dose.getDoseTime()==DoseTime.EVERY_FOUR_HOURS) {
				patientCalender.setTime(dose.getStartDate());
				Calendar end = Calendar.getInstance();
				end.setTime(dose.getEndDate());
				int hour=0;
				for (Date date = patientCalender.getTime(); patientCalender.before(end);  date = patientCalender.getTime()) {
				    // Do your job here with `date`.
					patientCalender.setTime(date);
					patientCalender.set(Calendar.HOUR_OF_DAY, hour);
					
				    System.out.println(dose.getMedicineID()+" "+patientCalender.get(Calendar.DAY_OF_MONTH)+"/"+patientCalender.get(Calendar.MONTH)+" "+patientCalender.get(Calendar.HOUR_OF_DAY)+"|");
				   hour=hour+4;
				   patientCalender.add(Calendar.HOUR_OF_DAY, 4);
				   
				    if(hour>24) {
				    	hour=hour%24;
				    	patientCalender.add(Calendar.DAY_OF_MONTH, 1);
				    }
				    System.out.println(hour);
				}
			}else if(dose.getDoseTime()==DoseTime.EVENING) {
					patientCalender.setTime(dose.getStartDate());
					Calendar end = Calendar.getInstance();
					end.setTime(dose.getEndDate());
					int hour=0;
					for (Date date = patientCalender.getTime(); patientCalender.before(end);  date = patientCalender.getTime()) {
					    // Do your job here with `date`.
						patientCalender.setTime(date);
						patientCalender.set(Calendar.HOUR_OF_DAY, 8);
						
					    System.out.println(dose.getMedicineID()+" "+patientCalender.get(Calendar.DAY_OF_MONTH)+"/"+patientCalender.get(Calendar.MONTH)+" "+patientCalender.get(Calendar.HOUR_OF_DAY)+"|");
					   hour=hour+4;
					   patientCalender.add(Calendar.HOUR_OF_DAY, 4);
					   
					    if(hour>24) {
					    	hour=hour%24;
					    	patientCalender.add(Calendar.DAY_OF_MONTH, 1);
					    }
					    System.out.println(hour);
					}
			
		}
			
	}

	}
	}
	
