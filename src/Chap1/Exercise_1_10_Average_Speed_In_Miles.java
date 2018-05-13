package Chap1;

/**
 * (Average speed in miles) Assume a runner runs 14 kilometers in 45 minutes and 30
 seconds. Write a program that displays the average speed in miles per hour. (Note
 that 1 mile is 1.6 kilometers.)
 */

public class Exercise_1_10_Average_Speed_In_Miles {

    public static void main(String[] args) {
        //Convert kilometers to miles
        System.out.println("14 kilometers is: " + (14 / 1.6) + " miles.");

        //Get total seconds
        System.out.println("Total seconds: " + (60 * 45 + 30));
        System.out.println("Total seconds in 1 hour: " + (60 * 60));

        System.out.println("Average miles per hour: " + ((8.75 * 3600) / 2730));
    }
}
