package homework_week_7;
/**
 * Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or
 * “ZERO”
 */

import java.util.Scanner;

public class Programme_16_FindPositiveNegative {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter A Number : ");
        int number = scanner.nextInt();
        findNumberIsPositiveNegativeOrZero(number);
        scanner.close();
    }
    public static void findNumberIsPositiveNegativeOrZero(int number){
        if (number>0){
            System.out.println(number+ "Is a POSITIVE number");
        }else if(number<0){
            System.out.println(number+ "Is a NEGATIVE number");
        }else{
            System.out.println(number+ "Is ZERO");
        }
    }
}
