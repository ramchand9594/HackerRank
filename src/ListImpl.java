import java.io.*;
import java.util.*;
import java.util.stream.*;

public class ListImpl {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> numList = new ArrayList<>();
        while(n>0) {
            numList.add(scanner.nextInt());
            n--;
        }
        int testCases = scanner.nextInt();
        while(testCases > 0) {
            scanner.nextLine();
            String mode = scanner.nextLine();
            if("Insert".equals(mode)) {
                int index = scanner.nextInt();
                int value = scanner.nextInt();
                numList.add(index, value);
            } else if("Delete".equals(mode)) {
                int index = scanner.nextInt();
                numList.remove(index);
            }
            testCases--;
        }
        System.out.println(numList.stream().map(val -> String.valueOf(val)).collect(Collectors.joining(" ")));
    }
}

