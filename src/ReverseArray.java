import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    // Complete the reverseArray function below.
    static int[] reverseArray(int[] a) {
        return a;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int length = in.nextInt();  // Scanner has functions to read ints, longs, strings, chars, etc.
        in.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        System.out.println(length);

        while (in.hasNext()) {
            String[] array = in.nextLine().split(" ");  // Scanner has functions to read ints, longs, strings, chars, etc.
            int [] arr = new int [array.length];
            for(int i=0; i<array.length; i++) {
                arr[i] = Integer.parseInt(array[i]);
            }
            System.out.println(Arrays.toString(arr));
        }

    }
}
