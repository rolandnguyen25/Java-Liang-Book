package Chap1;

/**
 * (Average speed in kilometers) Assume a runner runs 24 miles in 1 hour, 40 minutes,
 and 35 seconds. Write a program that displays the average speed in kilometers per
 hour. (Note that 1 mile is 1.6 kilometers.)
 */

public class Exercise1_12_Average_Speed_Kilometers {

    public static void main(String[] args) {
        int totalSecondsInOneHour = 60 * 60;
        double totalKilometersTraveled = 24 * 1.6;
        int totalNumberOfSecondsElapsed = totalSecondsInOneHour + 35 + (40 * 60);
        double averageKilometersPerHour = (totalSecondsInOneHour * totalKilometersTraveled) / totalNumberOfSecondsElapsed;
        System.out.println("Average kilometers in 1 hour: " + averageKilometersPerHour);
    }
}
