package HomeworkWeek6.TrafficLightProxy.src;

public class GreenLightState implements TrafficLightState {
	private static final long serialVersionUID = 1L;
	transient TrafficLight trafficLight;
	
	public GreenLightState(TrafficLight trafficLight) {
		this.trafficLight = trafficLight;
	}
	
	/*
	 * Display the current state and 
	 * transition to the next state (yellow)
	 */
	public void stateChange() {
		//currentLightColor();
		trafficLight.setTrafficLightState(trafficLight.yellowLight);
	}
	
	public void currentLightColor() {
		System.out.println("Green Light");
	}
}
