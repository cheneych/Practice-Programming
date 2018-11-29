package cerner.temperature;


public class Temperature {

	private float temperature; //temperature in Degrees
	private Location location;
	private Metric metric;
	
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
		this.setMetric(Metric.CELSIUS); //default value
	}
	
	//to convert from Degrees to fahrenheit
	public float getTemperatureInFahrenheit() {
		if(this.metric==Metric.CELSIUS) {
			return(this.temperature*(9/5)+32);
		}else if(this.metric==Metric.KELVIN) {
			return (9*(this.temperature - 273)/5 + 32);
		}
		return this.temperature;
		
	}
	public float getTemperatureInKelvin() {
		if(this.metric==Metric.CELSIUS) {
			return (float) (this.temperature+273);
		}else if(this.metric==Metric.FARANHEIT) {
			return (float) (5 * (this.temperature - 32)/9 + 273.15);
		}
		return this.temperature;
		
	}
	public float getTemperatureInCelsius() {
		if(this.metric==Metric.KELVIN) {
			return (float) (this.temperature-273);
		}else if(this.metric==Metric.FARANHEIT) {
			return (5* (this.temperature - 32)/9);
		}
		return this.temperature;
	}
	public Metric getMetric() {
		return metric;
	}
	public void setMetric(Metric metric) {
		this.metric = metric;
	}
	public Temperature(float temperature, Location location, Metric metric) {
		super();
		this.temperature = temperature;
		this.location = location;
		this.metric = metric;
	}
	
	
}
