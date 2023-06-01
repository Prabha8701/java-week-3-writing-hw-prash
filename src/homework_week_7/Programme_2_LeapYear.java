package homework_week_7;

import java.util.Scanner;
/*
 *Write a java program to input any year like (ex.2007) and find out if it is leap year or
 * not?
 */

public class Programme_2_LeapYear {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Please enter a year: ");
        int year =scanner.nextInt();
        Programme_2_LeapYear leapYear= new Programme_2_LeapYear();
        leapYear.isLeapYear(year);
        scanner.close();

    }
    public void isLeapYear(int year){
        if(year%4==0 && year%100!=0 || year % 400==0){
            System.out.println("The year " +year+ " is a Leap Year");
        }else {
            System.out.println("The Year " +year+ " Is Not a Leap Year");
        }
    }
}

