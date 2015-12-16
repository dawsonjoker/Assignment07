
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author dawsr2694
 */
public class A7Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Create scanner
        Scanner input = new Scanner(System.in);
        //Get user input
        System.out.print("How many people? ");
        int people = input.nextInt();
        //Create array
        int[] nums = new int[people];
        //Put values into array using user input
        for (int i = 0; i < nums.length; i++) {
            System.out.print("Type in a height: ");
            nums[i] = input.nextInt();
        }
        //Add all heights together
        int total = 0;
        for (int i = 0; i < nums.length; i++) {
            total = total + nums[i];
        }
        //Create variable to store average
        int average = total / people;
        //Fgigure out which heights are avive average
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > average) {
                System.out.println("Above average heights are " + nums[i]);
            }
        }
    }
}
