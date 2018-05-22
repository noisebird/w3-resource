import java.util.Scanner;

/**
 * Created by wangjie on 2018/5/16.
 */

/*
6. Write a Java program to compute body mass index (BMI). Go to the edito
        Test Data
        Input weight in pounds: 452
        Input height in inches: 72
        Expected Output:
        Body Mass Index is 61.30159143458721
*/
public class DataTypesExercises_6 {
    public static void main(String[] args) {
//        BMI=体重（kg）/身高（mile）的平方
        System.out.print("Input weight in pounds: ");
        Scanner input = new Scanner(System.in);
        double weight = input.nextDouble();
        System.out.print("Input height in inches: ");
        double inches = input.nextDouble();
        double BMI = weight * 0.45359237 / Math.pow(inches * 0.0254,2);
        System.out.println("Body Mass Index is " + BMI);
    }
}
