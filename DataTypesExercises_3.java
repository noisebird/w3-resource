import java.util.Scanner;

/**
 * Created by wangjie on 2018/5/16.
 */

/*
    3. Write a Java program that reads an integer between 0 and 1000 and adds all the digits in the integer. Go to the editor

        Test Data
        Input an integer between 0 and 1000: 565
        Expected Output :
        The sum of all digits in 565 is 16
*/
public class DataTypesExercises_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input an integer between 0 and 1000: ");
        int num = input.nextInt();
        int sum = 0;
        while (num / 10 != 0) {
            sum += num % 10;
            num = num / 10;
        }
        sum+=num;
        System.out.println("The sum of all digits in " + num+ " is " + sum);
    }
}
