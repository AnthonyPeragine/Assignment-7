
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author peraa0837
 */
public class A7Q3 {

    /**
     * Finds the remainder of a number divided by every integer of lesser or
     * equal value. If the remainder is zero, it divides evenly. If not, it does
     * not divide evenly. Displays numbers that can divide evenly into any given
     * number.
     *
     * @param number is the number of which to find all factors of.
     */
    public static void factors(int number) {
        System.out.println("The numbers that divide " + number + " evenly are: ");
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.println(i);
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //scanner to read in an integer to factor.
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number you wish to find all factors of:");
        int number = input.nextInt();
        //calls factors method
        factors(number);
    }
}
