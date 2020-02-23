package HomeworkWeek6.TrafficLightProxy.src;

import java.io.Serializable;

public interface TrafficLightState extends Serializable{
	public void currentLightColor();
	public void stateChange();
}
