import java.util.*;
import java.io.*;

public class cowsignal2016 {
    static Scanner inp = new Scanner(System.in);

    static int M = inp.nextInt();
    static int N = inp.nextInt();
    static int K = inp.nextInt();
    
    public static void main(String[] args) {
        // To avoid the newline character
        inp.nextLine();
        // To print after the input
        System.out.println();

        for(int i = 0; i < M; i++){
            char[] signal = inp.nextLine().toCharArray();
            for(int it = 0; it < K; it++){
                for(int j = 0; j < N; j++){
                    for(int k = 0; k < K; k++){
                        System.out.print(signal[j]);
                    }
                }
                System.out.println();
            }
        }
    }
}
