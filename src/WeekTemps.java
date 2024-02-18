import java.util.Objects;
import java.util.Scanner;
import java.util.ArrayList;
/*Develop a Java program that will store data in the form of daily average temperatures for one week.
Store the day and average temperature in two different arraylists. Your program should prompt the user for the day of the week (Monday through Sunday)
and display both the day and temperature for each day.
If "week" is entered, the output for your program should provide the temperature for each day and the weekly average.
 */
public class WeekTemps {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        final int NUM_DAYS = 7;
        ArrayList<String> dayOfWeek = new ArrayList<String>();
        ArrayList<Double> tempOfDay = new ArrayList<Double>();
        String userInput;
        int i;
        double weekAvg =0;
        double weekSum=0;
        // add the days of the week monday-sunday
        dayOfWeek.add("Monday");
        dayOfWeek.add("Tuesday");
        dayOfWeek.add("Wednesday");
        dayOfWeek.add("Thursday");
        dayOfWeek.add("Friday");
        dayOfWeek.add("Saturday");
        dayOfWeek.add("Sunday");
         // add temps for each day
        tempOfDay.add(100.0);
        tempOfDay.add(80.1);
        tempOfDay.add(79.2);
        tempOfDay.add(82.2);
        tempOfDay.add(81.5);
        tempOfDay.add(75.0);
        tempOfDay.add(77.1);
        //Prompt the user for a day of the week or enter week
        System.out.println("Ender a day of the week for the daily temperature, or week for all temps :");
        userInput = scr.next();
        //for loop to iterate through the arraylist
        for (i = 0;i < NUM_DAYS ; ++i) {
            //if input is a day of the week or equals week then print out day and temp / concatenate temps to get the sum
            if (userInput.equalsIgnoreCase(dayOfWeek.get(i)) || (userInput.equalsIgnoreCase("Week"))) {
                System.out.println(dayOfWeek.get(i) + " "+ tempOfDay.get(i));
                weekSum += tempOfDay.get(i);
            }
        }
        if (userInput.equalsIgnoreCase("Week")){
            weekAvg = weekSum / NUM_DAYS;
            System.out.printf("The average temperature of the week was: %.2f",weekAvg);
        }
    }
}
