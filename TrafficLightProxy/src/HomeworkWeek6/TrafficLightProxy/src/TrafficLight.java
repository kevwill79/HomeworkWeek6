package HomeworkWeek6.TrafficLightProxy.src;

public class TrafficLight {
	TrafficLightState greenLight;
	TrafficLightState yellowLight;	
	TrafficLightState redLight;
	TrafficLightState flashingLight;
	TrafficLightState state;
	String location;
	
	
	public TrafficLight(String location) {
		this.location = location;
		greenLight = new GreenLightState(this);
		yellowLight = new YellowLightState(this);
		redLight = new RedLightState(this);
		flashingLight = new FlashingLightState(this);
		
		//The traffic light initial state is red
		state = redLight;
	}
	
	public void stateChange() {
		state.stateChange();
	}
	
	public void currentLightColor() {
		state.currentLightColor();
	}
	
	public void setTrafficLightState(TrafficLightState state) {
		this.state = state;
	}
	
	public TrafficLightState getGreenLightState() {
		return greenLight;
	}
	
	public TrafficLightState getYellowLightState() {
		return yellowLight;
	}
	
	public TrafficLightState getRedLightState() {
		return redLight;
	}
	
	public TrafficLightState getFlashingLightState() {
		return flashingLight;
	}
	
	public void currentState() {
		System.out.println("The state is: " + state);
	}
	
	public TrafficLightState getState() {
		return state;
	}
	
	public String getLocation() {
		return location;
	}

	/*
	 * Light transitions immediately to yellow and then red
	 * This is for emergency situations
	 */
	public TrafficLightState changeToYellow() {
		setTrafficLightState(getYellowLightState());
		state.currentLightColor();
		setTrafficLightState(getRedLightState());
		state.currentLightColor();
		return state;
	}
	
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("Traffic light initial state: " + state + "\n");
		return sb.toString();
	}
}
