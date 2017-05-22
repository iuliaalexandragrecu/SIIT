/**
 * Created by iulia on 5/3/2017.
 */
import java.util.Scanner;// This will import just the scanner class
public class Sum {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in); // Opens a Scanner, keyboard
        System.out.println("First number:");//Display the first number
        int a = keyboard.nextInt();//Store the input from the user
        System.out.println("Second Number: ");//Display the second number
        int b = keyboard.nextInt();//Store the input from the user

        int s = Math.min(a, b);//To find the minimum between a and b
        int e = Math.max(a, b);// To find the maximum between a and b
        int sum = 0;//To find the sum

        while (s <= e) {//Condition to calculate the sum
            sum += s;
            s++;
        }

        System.out.println("The sum of the numbers between " + a + " and " + b + " is " + sum);//Display the sum
    }
}
