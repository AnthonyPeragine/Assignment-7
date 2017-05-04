
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author peraa0837
 */
public class A7Q4 {

    /**
     * Calculates compound interest
     *
     * @param principal is the initial balance
     * @param rate the rate at which interest is gained
     * @param years the length of time that the interest accumulated
     * @return the new balance after interest
     */
    public static double compoundInterest(double principal, double rate, int years) {
        double interest = principal * Math.pow((1 + rate), years);
        return interest;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //scanner 
        Scanner input = new Scanner(System.in);
        //reads in all required parameters, does the calculation then rounds to the nearest hundredth
        //before displaying the new balance
        System.out.println("Please enter the principal amount:");
        double p = input.nextDouble();

        System.out.println("Please enter the interest rate per annum (decimal form):");
        double r = input.nextDouble();

        System.out.println("Please enter how many years of interest will accumulate:");
        int n = input.nextInt();

        System.out.println("your new balance would be $" + Math.round(compoundInterest(p, r, n) * 100) / 100.00 + ".");
    }
}
