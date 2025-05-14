package Day4project;
import java.util.*;
public class queue {
        public static void main(String[] args) {
                Queue<Integer> a =new LinkedList<Integer>();
                a.add(100);
                a.add(200);
                a.add(300);
                a.add(400);

                System.out.println(a);
                System.out.println(a.peek());//peek method
                System.out.println(a.remove(400));//remove method
                System.out.println(a);
                System.out.println(a.poll());//poll method
                System.out.println(a);



        }
}