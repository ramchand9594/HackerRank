import java.io.*;
import java.util.*;

public class ArrayLists {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        scanner.nextLine();
        ArrayList[] arr = new ArrayList[count];
        for(int i = 0; i < count; i++) {
            String line = scanner.nextLine();
            ArrayList<String> arrList = new ArrayList<>();
            arrList.addAll(Arrays.asList((line.split(" "))));
            arr[i] = arrList;
        }
        int findCount = scanner.nextInt();
        for(int i = 0; i < findCount; i++) {
        	int j = scanner.nextInt();
        	int v = scanner.nextInt();
        	try {
        	System.out.println(arr[j - 1].get(v));
        	} catch(Exception e) {
        		System.out.println("ERROR!");
        	}
        }
    }
}

