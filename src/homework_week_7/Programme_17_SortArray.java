package homework_week_7;

/**
 * Write a Java program to sort a numeric array and a string array.
 */
import java.util.Arrays;

public class Programme_17_SortArray {
    public static void main(String[] args) {
        int[] numArray={
                1789,2035,1899,2040,1950,2255,7897,1455,787
        };
        String[] strArray={
                "Alpha", "Bravo", "Delta", "Hotel", "Mike", "Sierra", "Peter", "Kilo"
        };
        System.out.println("Actual numerical array was : " + Arrays.toString(numArray));
        Arrays.sort(numArray);
        System.out.println("Sorted Numerical array is : "+ Arrays.toString(numArray));
        System.out.println("");
        System.out.println("Actual String array was : "+ Arrays.toString(strArray));
        Arrays.sort(strArray);
        System.out.println("Sorted String array is :" + Arrays.toString(strArray));
    }
}
