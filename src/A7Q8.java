/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author peraa0837
 */
public class A7Q8 {
    /**
     * Determines what season it is given a month or day
     * @param month the number of the month (1-12)
     * @param day number of the day (1-30)
     */
    public static void season(int month, int day) {
        //during December, if the day is 16 or greater, it is winter, else it is fall
        if (month == 12) {
            if (day >= 16) {
                System.out.println("Winter");
            } else {
                System.out.println("Fall");
            }
            //month 1 and 2 are part of winter
        } else if (month < 3) {
            System.out.println("Winter");
        }
        
        
        //during March, if the day is 15 or less, it is winter, else it is spring
        if (month == 3) {
            if (day <= 15) {
                System.out.println("Winter");
            } else {
                System.out.println("Spring");
            }
            //month 4 and 5 are part of spring
        } else if (month > 3 && month < 6) {
            System.out.println("Spring");
        }
        
        
        //during June, if the day is 15 or less, it is spring, else it is spring
        if (month == 6) {
            if (day <= 15) {
                System.out.println("Spring");
            } else {
                System.out.println("Summer");
            }
            //month 7 and 8 are part of summer
        } else if (month > 6 && month < 9) {
            System.out.println("Summer");
        }
        
        
        //during September, if the day is 16 or greater, it is fall, else it is summer
        if(month == 9){
            if(day >= 16){
                System.out.println("Fall");
            }else{
                System.out.println("Summer");
            }
            //month 10 and 11 are part of fall
        }else if(month > 9 && month < 12){
            System.out.println("Fall");
        }
        
        if(month > 12 || day > 31){
            System.out.println("Not a valid date.");
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //calls the season method
        season(12, 16);
    }
}
