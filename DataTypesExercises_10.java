import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.Stream;

/**
 * Created by wangjie on 2018/5/16.
 */

/*
       10. Write a Java program to break an integer into a sequence of individual digits. Go to the editor
        Test Data
        Input six non-negative digits: 123456
        Expected Output :
        1 2 3 4 5 6
*/
public class DataTypesExercises_10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input six non-negative digits: ");
        int input = in.nextInt();
        String str = "";
        while (input / 10 != 0) {
            str += input % 10 + " ";
            input = input / 10;
        }
        str += input;
        System.out.println(new StringBuffer(str).reverse());
    }
}
