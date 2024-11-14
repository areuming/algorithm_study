import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main_2588 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int units = num2 % 10;
        int tens = (num2 / 10) % 10;
        int hundred = num2 / 100;

        int result1 = num1 * units;
        int result2 = num1 * tens;
        int result3 = num1 * hundred;

        int finalResult = num1 * num2;

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(finalResult);

        sc.close();
    }

}