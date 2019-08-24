import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Area {
static Scanner scanner = new Scanner(System.in);
static int B = 0;
static int H = 0;
static boolean flag = true;
static {
    B = Integer.parseInt(scanner.nextLine());
    H = Integer.parseInt(scanner.nextLine());
    if(B == 0 && H == 0) {
        flag = false;
        System.out.println("java.lang.Exception: Breadth and height must be positive");
    }
}

public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}//end of main

}//end of class

