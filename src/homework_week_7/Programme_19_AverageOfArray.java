package homework_week_7;
/**
 * Write a Java program to calculate the average value of array
 */

import java.util.Arrays;

public class Programme_19_AverageOfArray {
    public static void main(String[] args) {
        int[] numArray={
                1789, 2035, 1899, 2040, 1950, 2255, 7897, 1455, 787
        };
        int sum=0;
        for(int i=0; i< numArray.length; i++){
            sum=sum+numArray[i];
        }
        int average= sum/ numArray.length;
        System.out.println("values of the elements of the array are : " + Arrays.toString(numArray));
        System.out.println("Average of all the values of the array are : "+average);
    }
}
