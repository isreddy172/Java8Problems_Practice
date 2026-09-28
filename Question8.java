package Com.StreamImportantQuestions;
// INCREASE THE SALARY OF THE EMPLOYEE BY 2000 and print the entire obj list 

import java.util.ArrayList;
import java.util.List;

public class Question8 {
	public static void main(String[] args) {
		
		List<Employee> ls =  new ArrayList<>();
		ls.add(new Employee(1,"Indra",200.0, new Department("CSE")));
		ls.add(new Employee(2,"Gopi",300.0, new Department("Arts")));
		ls.add(new Employee(3,"Raghu",900.0, new Department("Networking")));
		ls.add(new Employee(4,"Aravindh",700.0, new Department("Connections")));
		
		List<Employee> list = ls 
		.stream()
		.map( emp -> new Employee(emp.getId(),emp.getName(),emp.getSalary()+2000,emp.getDep()))
		.toList();
		System.out.println(list);
		
	}
}
