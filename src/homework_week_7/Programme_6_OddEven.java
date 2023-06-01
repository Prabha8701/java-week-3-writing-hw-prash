package homework_week_7;

import java.util.Scanner;

/**
 * Write a java program to input any number and find out if it’s odd or even
 */

public class Programme_6_OddEven {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number you would like to check: ");
        int number= scanner.nextInt();
        Programme_6_OddEven oddEven=new Programme_6_OddEven();
        System.out.println(number+ " is " +oddEven.isItEvenOrOddNumber(number)+ " number");
        scanner.close();
    }
    public String isItEvenOrOddNumber(int number){
        if(number%2 ==0){
            return "Even";
        }else {
            return "Odd";
        }
    }
}
