import java.util.Scanner;

/**
 * Created by wangjie on 2018/5/16.
 */
/*
8. Write a Java program that reads a number and display the square, cube, and fourth power. Go to the editor

        Expected Output:
        Square: .2f
        Cube: .2f
        Fourth power: 50625.00
*/
public class DataTypesExercises_8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the side length value: ");
        double val = in.nextDouble();

        System.out.printf("Square: %12.2f\n", val * val);
        System.out.printf("Cube: %14.2f\n", val * val * val);
        System.out.printf("Fourth power: %6.2f\n", Math.pow(val, 4));
    }
}
