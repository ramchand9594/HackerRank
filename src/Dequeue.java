    import java.util.*;
    public class Dequeue {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            Deque<Integer> deque = new ArrayDeque<>();
            Set<Integer> set = new HashSet<>();
            int n = in.nextInt();
            int m = in.nextInt();
            int result = Integer.MIN_VALUE;
            for (int i = 0; i < n; i++) {
                int num = in.nextInt();
                deque.add(num);
                set.add(num);
                if(deque.size() == m) {
                	result = result > set.size() ? result : set.size(); 
                	Integer remove = deque.remove();
                	if(!deque.contains(remove))set.remove(remove);
                }
            }
            System.out.println(result);
        }
    }



