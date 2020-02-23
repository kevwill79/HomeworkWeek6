package HomeworkWeek6.TrafficLightProxy.src;

public class FlashingLightState implements TrafficLightState{
	private static final long serialVersionUID = 1L;
	transient TrafficLight trafficLight;
	
	public FlashingLightState(TrafficLight trafficLight) {
		this.trafficLight = trafficLight;
	}
	
	/*
	 * Display the current state and 
	 * transition to the next state (red)
	 */
	public void stateChange() {
		//currentLightColor();
		trafficLight.setTrafficLightState(trafficLight.redLight);
	}
	
	public void currentLightColor() {
		System.out.println("Flashing Light");
	}
}
