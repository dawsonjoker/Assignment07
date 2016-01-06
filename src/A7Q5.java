
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author dawsr2694
 */
public class A7Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Create scanner
        Scanner input = new Scanner(System.in);
        //Figure out how many numbers
        System.out.println("How many marks?");
        int marks = input.nextInt();
        //Create array
        int[] nums = new int[marks];
        //Put values into array using user input
        System.out.println("Please enter marks:");
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
        //Output sorted array
        System.out.println("");
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
            //filter if the number of marks is odd or even
            if (marks % 2 == 1) {
                //Find median of sorted array
                int median = nums.length / 2;
                //Tell user median
                System.out.println("The median is: " + median);
            } else if (marks % 2 == 0) {
                //If length is even, take both middle numbers, add them together and divide by two
                int spot = nums.length / 2;
                double median = (nums[spot] + nums[spot - 1]) / 2.0;
                //Tell user median
                System.out.println("The median is: " + median);
            }
        }
    }