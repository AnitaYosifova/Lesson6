public class Employee extends Person{

	double daySalary;
	
	public Employee(String name, int age, boolean isMan, double daySalary) {
		super(name, age, isMan);
		this.daySalary = daySalary;
	}

	public double calculateOvertime(double hours) {
		if(age < 18) {
			return 0;
		} else {
			return hours * 1.5 * daySalary/8;
		}
	}
	
	public void showEmployeeInfo() {
		showPersonInfo();
		System.out.println("Employee's day salary is: " + daySalary);
	}
	
	
}
