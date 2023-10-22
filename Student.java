public class Student extends Person{
	double score;
	
//	wrong!!!
//	public Student() {
//		
//	}
	
	public Student(String name, int age, boolean isMan, double score) {
		super(name, age, isMan);
		this.score = score;
	}

	public void showStudentInfo(){
		//call method of the superclass
		showPersonInfo();
		System.out.println("The students score is: " + score);
	}
}
