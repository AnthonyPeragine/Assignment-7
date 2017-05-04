
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author peraa0837
 */
public class A7Q2 {

    /**
     * @param args the command line arguments
     */
    public static void examGrade(int mark) {
        //displays corresponding grade to marks
        if (mark < 50) {
            System.out.println("The grade on this exam was an F");
        }
        if (mark >= 50 && mark <= 59) {
            System.out.println("The grade on this exam was a D");
        }
        if (mark >= 60 && mark <= 69) {
            System.out.println("The grade on this exam was a C");
        }
        if (mark >= 70 && mark <= 79) {
            System.out.println("The grade on this exam was a B");
        }
        if (mark >= 80) {
            System.out.println("The grade on this exam was an A");
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        //create a scanner
        Scanner input = new Scanner(System.in);
        //prompt user for exam mark and calls examGrade method
        System.out.println("What was the mark on your exam?");
        int mark = input.nextInt();
        examGrade(mark);
    }
}
