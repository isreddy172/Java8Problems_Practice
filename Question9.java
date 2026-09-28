package Com.StreamImportantQuestions;

import java.util.ArrayList;
import java.util.List;

public class Question9 {
public static void main(String[] args) {
	
	List<Employee> ls =  new ArrayList<>();
	ls.add(new Employee(1,"Indra",200.0, new Department("CSE")));
	ls.add(new Employee(2,"Gopi",200.0, new Department("Arts")));
	ls.add(new Employee(3,"Raghu",200.0, new Department("Networking")));
	ls.add(new Employee(4,"Aravindh",200.0, new Department("Connections")));
	
	List<String> list = ls 
	.stream()
	.filter(emp -> emp.getName().startsWith("I"))
	.map(emp->emp.getName())
	.toList();
	System.out.println(list);
	
}
}
