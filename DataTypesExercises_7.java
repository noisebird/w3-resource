import java.util.Scanner;

/**
 * Created by wangjie on 2018/5/16.
 */

/*
7. Write a Java program to takes the user for a distance (in meters) and the time was taken (as three numbers: hours, minutes, seconds), and display the speed, in meters per second, kilometers per hour and miles per hour (hint: 1 mile = 1609 meters). Go to the editor

        Test Data
        Input distance in meters: 2500
        Input hour: 5
        Input minutes: 56
        Input seconds: 23
        Expected Output :
        Your speed in meters/second is 0.11691531
        Your speed in km/h is 0.42089513
        Your speed in miles/h is 0.26158804
*/
public class DataTypesExercises_7 {

    public static float getMPS(float distance, float timeSeconds) {
        return distance / timeSeconds;
    }

    public static float getKPH(float distance, float timeSeconds) {
        return (distance / 1000.0f) / (timeSeconds / 3600.0f);
    }

    public static float getMPH(float distance, float timeSeconds) {
        return getKPH(distance, timeSeconds) / 1.609f;
    }

    public static void main(String[] args) {
        float timeSeconds;
        float mps, kph, mph;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input distance in meters: ");
        float distance = scanner.nextFloat();
        System.out.print("Input hour: ");
        float hour = scanner.nextFloat();
        System.out.print("Input minutes: ");
        float minute = scanner.nextFloat();
        System.out.print("Input seconds: ");
        float second = scanner.nextFloat();
        timeSeconds = (hour * 3600) + (minute * 60) + second;
        System.out.println("Your speed in meters/second is " + getMPS(distance, timeSeconds) + "\n"
                + "Your speed in km/h is " + getKPH(distance, timeSeconds) + "\n"
                + "Your speed in miles/h is " + getMPH(distance, timeSeconds));


        scanner.close();
    }
}
