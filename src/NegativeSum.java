import java.io.*;
import java.util.*;

public class NegativeSum {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String array = scanner.nextLine();
        String[] arr = array.split(" ");
        int counter = 0;
        for(int i = 0; i < n; i++) {
            int sum = Integer.parseInt(arr[i]);
            if(sum < 0) counter++;
            for(int j = i+1; j < n; j++) {
                sum += Integer.parseInt(arr[j]);
                if(sum < 0) counter++;
            }
        }
        System.out.println(counter);
    }
}

