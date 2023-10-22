public class Demo {

	public static void main(String[] args) {
		Person[] people = new Person[10];
		
		Person ivan = new Person("Ivan", 30, true);
		Student jose = new Student("Josefina", 16, false, 5.5);
		Employee koce = new Employee("Koce", 28, true, 1000.5);
		Employee pesho = new Employee("Petyr", 17, true, 250.8);
		
		people[0] = ivan;
		people[1] = jose;
		people[2] = koce;
		people[3] = pesho;
		
		for(int i=0;i<people.length;i++) {
			Person p = people[i];
			if(p != null) {
				System.out.println("");
				if (p instanceof Student) {
					((Student) p).showStudentInfo();
					continue;
				}
				if (p instanceof Employee) {
					((Employee) p).showEmployeeInfo();
					continue;
				}
				if (p instanceof Person) {
					p.showPersonInfo();
				}
			}
		}
		
		System.out.println("---------Overtime---------");

		for(int i=0;i<people.length;i++) {
			Person p = people[i];
			if(p != null && p instanceof Employee) {
				double overtime = ((Employee) p).calculateOvertime(2);
				System.out.println(p.name + "'s overtime is " + overtime + "\n");
			}
		}
		
	}

}
