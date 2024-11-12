import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main_1008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double A = sc.nextDouble();
        double B = sc.nextDouble();

        double result = A / B;

        System.out.printf("%.9f%n", result);

        sc.close();
    }
}