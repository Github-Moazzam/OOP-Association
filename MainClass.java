package pack1;

public class MainClass {

	public static void main(String[] args) {
		Address Addressclg1 = new Address(451,"karachi", "Pakistan", "Sindh");
		College clg1 = new College("PIDC", Addressclg1);
		Address Addst1 = new Address(1234, "Lahore","Pakistan","Sindh" );
		Student st1 = new Student(9873, "Waseem", Addst1, clg1);
		
		System.out.println(st1.name +"'s College is in " + st1.studentCollege.collegeAddress.city );
		System.out.println(st1.name +"'s Lives in " + st1.studentAddress.city );

	}

}
