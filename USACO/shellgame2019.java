import java.util.*;
import java.io.*;

public class shellgame2019 {
    public static void main(String[] args) {
        int[] cups = new int[3];
        int[] countCups = new int[3];

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            cups[i] = i;
        }

        int tries = input.nextInt();

        while (tries-- != 0) {
            int cup1 = input.nextInt() - 1;
            int cup2 = input.nextInt() - 1;
            int guess = input.nextInt() - 1;

            swap(cup1, cup2, cups);
            countCups[cups[guess]]++;
        }

        int maxSuccess = 0;

        for (int num: countCups) {
            if (num > maxSuccess) maxSuccess = num;
        }

        System.out.println(maxSuccess);
        input.close();
    }

    public static void swap(int cup1, int cup2, int[] currentCups) {
        int placeholder = currentCups[cup1];
        currentCups[cup1] = currentCups[cup2];
        currentCups[cup2] = placeholder;
    }
}
