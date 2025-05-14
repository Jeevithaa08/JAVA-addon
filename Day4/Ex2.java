package Day4project;
class Person {
	void talk() {
		System.out.println("Hello");
	}
}

class Student extends Person{
	void talk() {
		System.out.println("Welcome all");
	}
}

public class Ex2 {
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.talk();
		Student s1 = new Student();
		s1.talk();
	}
}
