package pack1;

public class Student {
	int rollNo;
	String name;
	Address studentAddress;
	College studentCollege;
	
	Student(int rollNo, String name, Address studentAddress , College studentCollege){
		this.rollNo = rollNo;
		this.name = name;
		this.studentAddress = studentAddress;
		this.studentCollege = studentCollege;
	}

}