import java.util.Scanner;

/**
 * Created by wangjie on 2018/5/16.
 */
/*
 5. Write a Java program that prints the current time in GMT. Go to the editor

    Test Data
    Input the time zone offset to GMT: 256
    Expected Output:
    Current time is 23:40:24
*/
public class DataTypesExercises_5 {

    public static void main(String[] args) {
        System.out.print("Input the time zone offset to GMT: ");
        Scanner input = new Scanner(System.in);
        long timeZoneChange = input.nextInt();
        long totalMilliseconds = System.currentTimeMillis();
        long totalSeconds = totalMilliseconds / 1000;
        long currentSecond = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long currentMinute = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        long currentHour = ((totalHours + timeZoneChange) % 24);
        System.out.println("Current time is " + currentHour + ":" + currentMinute + ":" + currentSecond);
    }
}
