package Introduction;

import java.util.HashMap;
import java.util.Map;

public class Person {
	public static int count = 0;
	public String firstName;
	public String lastName;
	public int age;
	public double height, weight;

	Person(String firstName, String lastName, int age, double height, double weight){
		Person.count++;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {	
		this.lastName = lastName;
	}
	
//	public void setCountLastName(String lastName) {
//		Person.count++;
//		this.lastName = lastName;
//	}
	
	public Map<Number, String> setCountLastName(String lastName) {
		Map<Number, String> coordinates = new HashMap<>();
		
		coordinates.put(Person.count++, this.lastName = lastName);

		return coordinates;
	}

	public String fullName(){
		return this.firstName + this.lastName;
	}

	public void print(){
		System.out.println("名前は" + this.fullName() + "です");
		System.out.println("年は" + this.age + "です");
	}

	public double bmi(){
		return this.weight / this.height / this.height;
	}

	public static void printCount(){
		System.out.println("合計" + Person.count + "人です");
	}

}
