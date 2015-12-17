
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author dawsr2694
 */
public class A7Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Create scanner
        Scanner input = new Scanner(System.in);
        //Create array
        int[] nums = new int[2];
        //Put values into array using user input
        System.out.println("Please enter 2 integers");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = input.nextInt();
        }
        //Place integers in ascending order
        while (true) {
            if (nums[0] > nums[1]) {
                System.out.println(nums[1] + " " + nums[0]);
                break;
            } else {
                System.out.println(nums[0] + " " + nums[1]);
                break;
            }
        }
    }
}
