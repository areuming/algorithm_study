import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main_1002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int t = 0; t < T; t++) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int r1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            int r2 = sc.nextInt();

            System.out.println(calculatePositions(x1, y1, r1, x2, y2, r2));
        }

        sc.close();
    }

    private static int calculatePositions(int x1, int y1, int r1, int x2, int y2, int r2) {
        int distanceSquared = (x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1);
        int rSumSquared = (r1 + r2) * (r1 + r2);
        int rDiffSquared = (r1 - r2) * (r1 - r2);

        if (x1 == x2 && y1 == y2 && r1 == r2) {
            return -1;
        } else if (distanceSquared > rSumSquared) {
            return 0;
        } else if (distanceSquared < rDiffSquared) {
            return 0;
        } else if (distanceSquared == rSumSquared || distanceSquared == rDiffSquared) {
            return 1;
        } else {
            return 2;
        }
    }
}