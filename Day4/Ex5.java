package Day4project;
class pet{
        void brag() {
                System.out.println("I have the best pet ");
        }
}
        class Dog extends pet{
                void brag() {
                        System.out.println("I have the best dog ");
                        super.brag();
                }

}
public class Ex5 {

        public static void main(String[] args) {
        Dog d=new Dog();
                d.brag();

        }

}
