
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author dawsr2694
 */
public class A7Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Create scanner
        Scanner input = new Scanner(System.in);
        //Create array
        int[] nums = new int[10];
        //Put values into array using user input
        System.out.println("Please enter 10 marks");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = input.nextInt();
        }
        //Sort marks from lowest to highest
        for (int x = 0; x < nums.length - 1; x++) {
            for (int y = x + 1; y < nums.length; y++) {
                if (nums[x] > nums[y]) {
                    int temp = nums[x];
                    nums[x] = nums[y];
                    nums[y] = temp;
                }
            }
        }
        System.out.println("");
        //Output answer to screen
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
}