/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ilkaytapshiriqlar;

/**
 *
 * @author murad_isgandar
 */
public class NewClass {

    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4, 5, 5, 2};
        System.out.println("Original array length: " + nums.length);
        System.out.print("Array elements are: ");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println("\nThe new length of the array is: " + array_sort(nums));

    }

    public static int array_sort(int[] nums) {
        int index = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[index - 1]) {
                nums[index++] = nums[i];
            }
        }
        return index;
    }

}
