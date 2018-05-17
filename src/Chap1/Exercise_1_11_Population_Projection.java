package Chap1;

/**
 * (Population projection) The U.S. Census Bureau projects population based on the
 following assumptions:
 ■ One birth every 7 seconds
 ■ One death every 13 seconds
 ■ One new immigrant every 45 seconds
 Write a program to display the population for each of the next five years. Assume the
 current population is 312,032,486 and one year has 365 days. Hint: In Java, if two
 integers perform division, the result is an integer. The fractional part is truncated. For
 example, 5 / 4 is 1 (not 1.25) and 10 / 4 is 2 (not 2.5). To get an accurate result with
 the fractional part, one of the values involved in the division must be a number with a
 decimal point. For example, 5.0 / 4 is 1.25 and 10 / 4.0 is 2.5.
 */

public class Exercise_1_11_Population_Projection {

    public static void main(String[] args) {
        //Get total number of seconds in year
        double totalNumberOfSecondsInYear = 60 * 60 * 24 * 365;

        //Get number of births in 1 year
        double numberOfBirthsInOneYear = totalNumberOfSecondsInYear / 7.0;

        //Get number of deaths in 1 year
        double numberOfDeathsInOneYear = totalNumberOfSecondsInYear / 13.0;

        //Get number of new immigrants in 1 year
        double numberOfImmigrantsInOneYear = totalNumberOfSecondsInYear / 45.0;

        double startingPopulation = 312032486;
        double currentPopulation = 0;

        currentPopulation = (startingPopulation + numberOfBirthsInOneYear + numberOfImmigrantsInOneYear) - numberOfDeathsInOneYear;
        System.out.println("Year 1 population: " + currentPopulation);

        currentPopulation = (currentPopulation + numberOfBirthsInOneYear + numberOfImmigrantsInOneYear) - numberOfDeathsInOneYear;
        System.out.println("Year 2 population: " + currentPopulation);

        currentPopulation = (currentPopulation + numberOfBirthsInOneYear + numberOfImmigrantsInOneYear) - numberOfDeathsInOneYear;
        System.out.println("Year 3 population: " + currentPopulation);

        currentPopulation = (currentPopulation + numberOfBirthsInOneYear + numberOfImmigrantsInOneYear) - numberOfDeathsInOneYear;
        System.out.println("Year 4 population: " + currentPopulation);

        currentPopulation = (currentPopulation + numberOfBirthsInOneYear + numberOfImmigrantsInOneYear) - numberOfDeathsInOneYear;
        System.out.println("Year 5 population: " + currentPopulation);

    }
}
