package Day3Project;
class Studeht{
	private String name;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(name != null && !name.isEmpty()) {
			this.name = name;
		} else {
			System.out.println("Invalid opt");
		}
	}
}


public class GetterandSetter {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setName("Jeevitha");
		System.out.println("The Student name is" + s1.getName());
	}
}
