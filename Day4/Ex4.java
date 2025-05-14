package Day4project;
import java.util.Scanner;
class hi {
    void greet() {
        System.out.println("Hello");
    }
    void greet(String a) {
        System.out.println("Hello ");
        System.out.println("Hello  Sansa");
    }
}
public class Ex4 {
        public static void main(String[] args) {
                 hi h = new hi();
                h.greet();
                h.greet(null);
        }
}