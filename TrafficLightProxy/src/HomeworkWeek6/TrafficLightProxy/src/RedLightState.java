package HomeworkWeek6.TrafficLightProxy.src;

public class RedLightState implements TrafficLightState {
	private static final long serialVersionUID = 1L;
	transient TrafficLight trafficLight;

	public RedLightState(TrafficLight trafficLight) {
		this.trafficLight = trafficLight;
}
	/*
	 * Display the current state and 
	 * transition to the next state (green)
	 */
	public void stateChange() {
		//currentLightColor();
		trafficLight.setTrafficLightState(trafficLight.greenLight);
	}

	public void currentLightColor() {
		System.out.println("Red Light");
	}
}
