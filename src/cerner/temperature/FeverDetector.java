package cerner.temperature;

import java.util.ArrayList;

public class FeverDetector {
	private ArrayList<Temperature> temperaturePerDay=new ArrayList<>(24);
	private int front=-1, rear=-1;
	
	public void addPatientTemperature(Temperature temperature) {
		this.rear++;
		if(this.front==-1||front>=rear)
					this.front++;
		if(rear>temperaturePerDay.size()) {
			this.rear=0;
			this.front++;
		}
		temperaturePerDay.add(this.rear,temperature);
		
	}
	
	public Temperature getTemperature24Hours() {
		if(front==-1) {
			return null;
		}
		return this.temperaturePerDay.get(this.front);
	}
	public Temperature getMostRecentTemperature() {
		if(this.rear!=-1) {
			return temperaturePerDay.get(this.rear);
			
		}
		return null;
	}
	
	public Boolean hasFever() {
		if(this.temperaturePerDay.get(this.rear).getTemperatureInFahrenheit() >98.6 ) {
			return true;
		}
		return false;
	}
	
	public void printValues() {
		if(this.rear>this.front) {
			for(int i=this.front;i<=this.rear;i++) {
				System.out.println(this.temperaturePerDay.get(i).getTemperature());
			}
		}
	}
	
	public static void main(String[] args) {
		FeverDetector fd=new FeverDetector();
		fd.addPatientTemperature(new Temperature((float) 98.6, Location.ARMPIT));
		fd.addPatientTemperature(new Temperature((float) 98.6, Location.ARMPIT));
		fd.addPatientTemperature(new Temperature((float) 98.6, Location.ARMPIT));		
		fd.addPatientTemperature(new Temperature((float) 98.6, Location.ARMPIT));
		fd.addPatientTemperature(new Temperature((float) 98.6, Location.ARMPIT));
		fd.addPatientTemperature(new Temperature((float) 98.6, Location.ARMPIT));
		
		fd.printValues();
	}
}
