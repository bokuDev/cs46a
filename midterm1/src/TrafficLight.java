/**
 * Represents Traffic Light
 * @author Canhui Huang
 */
public class TrafficLight {
    public void showLightColor(int minute) {
        // Minute [0,5): Red
        // Minute (5,10): Green
        // Minute (10,15): Yellow
        // The cycle pattern repeats every 15 minutes

        System.out.print("At minute " + minute + ". ");
        if ( minute % 15 >= 0 && minute % 15 < 5) {
            System.out.println("Traffic light color: Red");
        } else if ( minute % 15 < 10 ) {
            System.out.println("Traffic light color: Green");
        } else {
            System.out.println("Traffic light color: Yellow");
        }
    }

    /**
     * Java program featuring a TrafficLight class to simulate a traffic light at a specific time
     */
    public static void main(String[] args) {
        TrafficLight trafficLight = new TrafficLight();

        trafficLight.showLightColor(2);
        trafficLight.showLightColor(6);
        trafficLight.showLightColor(12); System.out.println();

        trafficLight.showLightColor(17);
        trafficLight.showLightColor(21);
        trafficLight.showLightColor(28); System.out.println();

        trafficLight.showLightColor(0);
        trafficLight.showLightColor(5);
        trafficLight.showLightColor(10);
        trafficLight.showLightColor(15);
    }
}
