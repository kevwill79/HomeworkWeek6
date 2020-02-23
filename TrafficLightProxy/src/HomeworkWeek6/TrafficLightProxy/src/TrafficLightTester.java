package HomeworkWeek6.TrafficLightProxy.src;

public class TrafficLightTester {
	
	public static void main(String[] args) {
		
		if(args.length < 1) {
			System.out.println("TrafficLight <name>");
			System.exit(1);
		}
		
		TrafficLight light = new TrafficLight(args[0]);
		TrafficMonitor monitor = new TrafficMonitor(light);
		
		System.out.println(light);
		
		light.stateChange();
		light.currentLightColor();
		light.stateChange();
		light.currentLightColor();
		light.stateChange();
		light.currentLightColor();
		
		monitor.report();
		
		light.stateChange();
		light.currentLightColor();
		
		monitor.EmergencyProtocol();
	}
}
