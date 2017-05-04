
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author peraa0837
 */
public class A7Q6 {

    /**
     * Determines the remainder of a number if divided by 10. The remainder is
     * always the last digit of the number.
     *
     * @param integer the number to be divided
     * @return the last digit
     */
    public static int lastDigit(int integer) {
        integer = integer % 10;
        if(integer < 0){
            integer = integer * -1;
        }
        return integer;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //scanner
        Scanner input = new Scanner(System.in);
        //reads in a number then displays last digit
        System.out.println("Please enter a number:");
        int number = input.nextInt();
        System.out.println("The last digit of that number is " + lastDigit(number) + ".");
    }
}
