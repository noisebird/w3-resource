import java.util.Scanner;

/**
 * Created by wangjie on 2018/5/16.
 */

/*
    4. Write a Java program to convert minutes into a number of years and days. Go to the editor

    Test Data
    Input the number of minutes: 3456789
    Expected Output :
    3456789 minutes is approximately 6 years and 210 days
*/
public class DataTypesExercises_4 {

    public static void main(String[] args) {

        System.out.print("Input the number of minutes: ");
        Scanner input = new Scanner(System.in);
        double minute = input.nextDouble();
        double allMinutes = 60 * 24 * 365;
        long years = (long) (minute / allMinutes);
        int days = (int) (minute / 60 / 24) % 365;
        System.out.println((int) minute + " minutes is approximately " + years + " years and " + days + " days");
    }
}
