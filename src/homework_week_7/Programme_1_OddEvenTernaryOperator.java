package homework_week_7;

import java.util.Scanner;

public class Programme_1_OddEvenTernaryOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number: ");
        int number = scanner.nextInt();
        isItOddOrEvenNumber(number);
        scanner.close();
    }

    public static void isItOddOrEvenNumber(int number) {
        String evenOrodd = (number % 2 == 0) ? "Even " : " Odd ";
        System.out.println("The " +number+ " is " +evenOrodd+ "Number" );

    }

}
