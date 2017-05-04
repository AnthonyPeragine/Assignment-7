
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author peraa0837
 */
public class A7Q1 {

    /**
     * Calculates area of a circle
     *
     * @param r radius of the circle
     * @return returns area given radius
     */
    public static double circleArea(double r) {

        double area = Math.PI * Math.pow(r, 2);
        return area;


    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //create a scanner
        Scanner input = new Scanner(System.in);
        //reads in the radius of a circle then executes the circleArea method
        System.out.println("Please enter the radius of the circle in cm.");
        double r = input.nextDouble();
        double area = circleArea(r);
        System.out.println("The area of the circle with the radius " + r + " cm is " + area + " cm.");
    }
}
