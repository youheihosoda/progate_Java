package progate_Java5;

import progate_Java5.java2_2.Person;

public class java13_1 {
	 public static void main(String[] args) {
		    Person person1 = new Person("Kate", "Jones", 27, 1.6, 50.0);
		    person1.printData();
		    
		    // middleNameとして「Christopher」を渡してください
		    Person person2 = new Person("John", "Christopher", "Smith", 65, 1.75, 80.0);
		    person2.printData();
		    
		    Person.printCount();
		  }

}
