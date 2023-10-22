public class Person {
	String name;
	int age;
	boolean isMan;
	
	public Person(String name, int age, boolean isMan) {
		this.name = name;
		this.age = age;
		this.isMan = isMan;
	}

	public void showPersonInfo() {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		if(isMan) {
			System.out.println("Person is male");
		} else {
			System.out.println("Person is female");
		}
	}
	
}
