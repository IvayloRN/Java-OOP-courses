package week1ABSTRACTIONS._4_TrafficLights;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TrafficLight[] trafficLight = getTrafficLight(scanner);
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {

            updateLights(trafficLight);

            printTrafickLights(trafficLight);

        }
    }

    private static TrafficLight[] getTrafficLight(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(TrafficLight::valueOf).toArray(TrafficLight[]::new);
    }

    private static void updateLights(TrafficLight[] trafficLights) {
        for (int i = 0; i < trafficLights.length; i++) {
            switch (trafficLights[i]){
                case RED:
                    trafficLights[i] = TrafficLight.GREEN;
                    break;
                case GREEN:
                    trafficLights[i] = TrafficLight.YELLOW;
                    break;
                case YELLOW:
                    trafficLights[i] = TrafficLight.RED;
                    break;
            }
        }
    }

    private static void printTrafickLights(TrafficLight[] trafficLights) {
        for (TrafficLight signal: trafficLights) {
            System.out.print(signal + " ");
        }
        System.out.println();
    }
}
