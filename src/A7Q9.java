/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author peraa0837
 */
public class A7Q9 {
    /**
     * Determines if all digits in an integer are odd or not.
     * @param integer the integer that will be checked
     */
    public static void allDigitsOdd(int integer){
        while(integer > 10){
            if(integer % 2 == 0){
                break;
            }else{
                integer = integer / 10;
            }
        }
        if(integer % 2 == 0){
        System.out.println("Not all odd.");
        }else{
            System.out.println("All digits are odd.");
        }
        }
        
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        allDigitsOdd(5379);
    }
}
