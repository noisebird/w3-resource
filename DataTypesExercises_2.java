import java.util.Scanner;

/**
 * Created by wangjie on 2018/5/16.
 */

/*
    2. Write a Java program that reads a number in inches, converts it to meters. Go to the editor
    Note: One inch is 0.0254 meter.
    Test Data
    Input a value for inch: 1000
    Expected Output :
    1000.0 inch is 25.4 meters
*/
public class DataTypesExercises_2 {
    public static void main(String[] args) {
        System.out.println("Input a value for inch:");
        Scanner scanner = new Scanner(System.in);
        double inch = scanner.nextDouble();
        double mile = inch * 0.0254;
        System.out.println(inch + "inch is " + mile + " metersmile");
    }
}
