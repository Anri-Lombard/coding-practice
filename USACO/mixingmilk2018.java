import java.util.*;
import java.io.*;

public class mixingmilk2018 {
    public static int[] bc = new int[3];
    public static int[] bm = new int[3];

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            bc[i] = inp.nextInt();
            bm[i] = inp.nextInt();
        }

        for (int i=0; i<100; i++) {
            pourMilk (i % 3, (i+1) % 3);
        }

        for (int milk: bm) {
            System.out.println(milk);
        }

        inp.close();
    }

    public static void pourMilk(int prev, int current) {
        int amount = Math.min(bm[prev], bc[current] - bm[prev]);
        bm[prev] -= amount;
        bm[current] += amount;
    }
}
