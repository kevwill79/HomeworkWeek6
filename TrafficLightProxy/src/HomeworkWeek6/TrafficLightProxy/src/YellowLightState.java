package HomeworkWeek6.TrafficLightProxy.src;

public class YellowLightState implements TrafficLightState {
	private static final long serialVersionUID = 1L;
	transient TrafficLight trafficLight;
	
	public YellowLightState(TrafficLight trafficLight) {
		this.trafficLight = trafficLight;
	}
	
	/*
	 * Display the current state and 
	 * transition to the next state (flashing)
	 */
	public void stateChange() {
		//currentLightColor();
		trafficLight.setTrafficLightState(trafficLight.flashingLight);
	}
	
	public void currentLightColor() {
		System.out.println("Yellow Light");
	}
}
