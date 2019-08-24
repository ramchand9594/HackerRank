import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Strings {

	public static void main(String[] args) {
		
		String s = "welcometojava";
		StringBuilder sb = new StringBuilder();
		String smallest = "", largest = "";
		int k = 3;
	        int length = s.length();
	        for(int i = 0; i <= length-k; i++) {
	            String subString = s.substring(i,i+k);
	            if(i == 0) smallest = subString;
	            if(smallest.compareTo(subString) > 0) {
	                smallest = subString;
	            }

	            if(largest.compareTo(subString) < 0) {
	                largest = subString;
	            }
	            
	        }
	        System.out.print(smallest + "\n" + largest);
	}
}
