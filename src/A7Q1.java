
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dawsr2694
 */
public class A7Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Create scanner
        Scanner input = new Scanner (System.in);
        //Get user input
        System.out.print("How many students in the class? ");
        int kids = input.nextInt();
        //Create array
        int[] nums = new int[kids];
        //Put values into array using user input
        for (int i = 0; i < nums.length; i++) {
            System.out.print("Type in an integer: ");
            nums[i] = input.nextInt();
    }
       //add all numbers together
        //create variable to store total
        int total = 0;
        for (int i = 0; i < nums.length; i++) {
            total = total + nums[i];
        }
        //Create variable to store average
        int average = total / kids;
        //Round average to two decimal places
        double answer = Math.round(average * 100) / 100.0;
        //tell user the average
        System.out.println("The class average is " + answer + " %");
        
}
}