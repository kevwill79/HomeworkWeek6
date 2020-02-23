package HomeworkWeek6.TrafficLightProxy.src;

public class TrafficMonitor {
		TrafficLight light;
		
		public TrafficMonitor(TrafficLight light) {
			this.light = light;
		}
		
		/*
		 * Light transitions immediately to yellow then red
		 * This is for emergency situations
		 */
		public void report() {
			System.out.println("\nTraffic Light Location: " + light.getLocation());
			System.out.println("Traffic light current state: " + light.getState());
		}
		
		public void EmergencyProtocol() {
			System.out.println("\nThis is a traffic light emergency drill!");
			System.out.println("I repeat this is a drill!");
			System.out.println("Commence emergency protocol 1!"); 
			System.out.println("Emergency State: "+ light.changeToYellow());
		}
}
