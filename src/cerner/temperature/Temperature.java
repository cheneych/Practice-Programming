package cerner.temperature;


public class Temperature {

	private float temperature; //temperature in Degrees
	private Location location;
	
	public void setTemperature(float temperature){
		this.temperature=temperature;
	}
	public float getTemperature() {
		return this.temperature;
	}
	public void setLocation(Location location) {
		this.location=location;
	}
	public Location getLocation() {
		return this.location;
	}
	
	public Temperature(float temperature,Location location) {
		this.temperature=temperature;
		this.location=location;
	}
	
	//to convert from Degrees to fahrenheit
	public float getTemperatureInFahrenheit() {
		return(this.temperature*(9/5)+32);
	}
	public float getTemperatureInKelvin() {
		return (float) (this.temperature+273.15);
	}
	
	
}
