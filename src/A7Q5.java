
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author peraa0837
 */
public class A7Q5 {

    /**
     * Creates a random pattern of asterisks in a line
     *
     * @param lines is how many lines of asterisks to create
     */
    public static void chaotic(int lines) {
        for (int i = 0; i < lines; i++) {
            int randNum = (int) (Math.random() * (5 - 1 + 1)) + 1;
            for (int x = 0; x < randNum; x++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //scanner to read in lines
        Scanner input = new Scanner(System.in);
        //reads in line value then calls chaotic method
        System.out.println("Please enter the number of lines you wish to print:");
        int lines = input.nextInt();
        chaotic(lines);
    }
}
