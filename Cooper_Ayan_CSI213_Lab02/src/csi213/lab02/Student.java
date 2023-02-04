package csi213.lab02;

/*
 * Task 2. Change the "Student" class so that it inherits the member variable "name" from the "Person" class.
 * Also, complete the the constructor "Student(String name, int studentID)" so that the "Student" instance being 
 * constructed can remember the "name" and "studentID" given to the constructor.
 * Finally, you need to add the "public String toString()" method so that it returns a string containing the 
 * name and student ID in the form of "[name], [studentID]" (e.g., "Ken, 2345").
 * 
 * Task 3. Change Student.java in order for the studentCount() method to return the number of Student instances 
 * constructed since the beginning of the Java program.
 */

/**
 * A {@code Student} instance represents a student.
 * 
 * @author Jeong-Hyon Hwang (jhh@cs.albany.edu)
 */
public class Student extends Person{

	/**
	 * The number of {@code Student} instances constructed so far.
	 */
	static int studentCount = 0;
	
	/**
	 * The ID of {@code Student}
	 */
	int studentID;

	/**
	 * Constructs a {@code Student} instance.
	 * 
	 * @param name
	 *            the name of the {@code Student}
	 * @param studentID
	 *            the ID of the {@code Student}
	 */
	public Student(String name, int studentID) {
		super(name);
		this.studentID = studentID;
		studentCount++;
	}

	/**
	 * Returns the number of {@code Student} instances constructed so far.
	 * 
	 * @return the number of {@code Student} instances constructed so far
	 */
	public static int studentCount() {
		return studentCount;
	}
	
	
	public String toString()
	   {
	      return(name + ", " + studentID);
	   }
	
	
	/**
	 * The main method of the {@code Student} class.
	 * 
	 * @param args
	 *            the program arguments
	 */
	public static void main(String[] args) {
		new Student("Chloy", 1234); // construct a Student instance whose name is "Chloy" and student ID is 1234
		Student s = new Student("Ken", 2345); // construct a Student instance whose name is "Ken" and student ID is 2345
		System.out.println(s); // output the name and student ID of the last Student instance (i.e., "Ken, 2345"))
		System.out.println(s.studentCount()); // output the number of Student instances constructed so far (i.e., 2)
	}

}
