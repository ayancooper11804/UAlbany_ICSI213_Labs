package csi213.lab02;

/*
 * Task 1. Complete the constructor "Person(String name)" so that it sets the member variable "name" to the argument 
 * "name". Also, add the "public String toString()" method and then implement it 
 * (i.e., override the "Object#toString()" method) so that it returns the name of the Person 
 * instance on which the method is called).
 */

/**
 * A {@code Person} instance represents a person.
 * 
 * @author Jeong-Hyon Hwang (jhh@cs.albany.edu)
 */
public class Person {

	/**
	 * The name of this {@code Person}.
	 */
	String name;

	/**
	 * Constructs a {@code Person} instance.
	 * 
	 * @param name
	 *            the name of the {@code Person}
	 */
	
	public Person(String name) {
		this.name = name;
	}
	
	public String toString() {
		return name;
	}

	/**
	 * The main method of the {@code Person} class.
	 * 
	 * @param args
	 *            the program arguments
	 */
	public static void main(String[] args) {
		new Person("John"); // construct a Person instance whose name is "John"
		Person p = new Person("Emily"); // construct a Person instance whose name is "Emily"
		System.out.println(p); // output the name of the last Person instance (i.e., "Emily")
	}

}
