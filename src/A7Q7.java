
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author peraa0837
 */
public class A7Q7 {
    /**
     * Finds the first digit of an integer
     * @param integer the integer that the first digit will be taken from
     * @return the first digit of the integer
     */
    public static int firstDigit(int integer){
        if(integer < 0){
            integer = integer * -1;
        }
        while(integer >= 10){
            integer = integer / 10;
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
        //prompt user to enter an integer, then finds the first digit and displays it
        System.out.println("Please enter an integer:");
        int integer = input.nextInt();
        System.out.println("The first digit of that integer is " + firstDigit(integer) + ".");
    }
}
