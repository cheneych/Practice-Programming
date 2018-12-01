package cerner.temperature;

import java.util.ArrayList;

public class FeverDetector {
	private ArrayList<Temperature> temperaturePerDay=new ArrayList<>(24);
	private int front=-1, rear=-1;
	
	public void addPatientTemperature(Temperature temperature) {
		this.rear++;
		if(rear>temperaturePerDay.size()) {
			this.rear=0;
			this.front++;
		}
		temperaturePerDay.add(this.rear,temperature);
		
	}
	
}
