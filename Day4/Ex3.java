package Day4project;

class Candy{
	void taste() {
		System.out.println("Tastes Sweet");
	}
}
class Chocolate extends Candy{
	void taste() {
		System.out.println("Tastes chocolately");
	}
}
public class Ex3 {
	public static void main(String[] args) {
		Candy c2 = new Candy();
		Chocolate c1 = new Chocolate();
		c2.taste();
		c1.taste();
	}
}
