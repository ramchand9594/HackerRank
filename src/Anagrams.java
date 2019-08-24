import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Anagrams {

    static boolean isAnagram(String a, String b) {
        // Complete the function
    	a = a.toLowerCase();
    	b = b.toLowerCase();
    	Map<Character,Integer> countMap = new HashMap<>();
    	if(a.length() != b.length()) {
    		return false;
    	} 
    	for(int i = 0; i<a.length();i++) {
    		if(countMap.containsKey(a.charAt(i))) {
    			Integer count = countMap.get(a.charAt(i));
    			countMap.put(a.charAt(i), ++count);
    		} else {
    			countMap.put(a.charAt(i), 1);
    		}
    	}
    	for(int j = 0; j<b.length();j++) {
    		if(countMap.containsKey(b.charAt(j))) {
    			Integer count = countMap.get(b.charAt(j));
    			if(count != 1)
    				countMap.put(b.charAt(j), --count);
    			else
    				countMap.remove(b.charAt(j));
    		} else {
    			return false;
    		}
    	}
    	if(countMap.size() == 0) {
    		return true;
    	}
    	return false;
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
//        String a = scan.next();
//        String b = scan.next();
        scan.close();
        boolean ret = isAnagram("anagramm", "marganaa");
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}