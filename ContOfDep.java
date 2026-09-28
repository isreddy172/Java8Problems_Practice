package Com.StreamImportantQuestions;

import java.util.*;
import java.util.stream.*;


public class ContOfDep {

	public static void main(String[] args) {
		
		List<Employee> ls = new ArrayList<>();
		ls.add(new Employee(1,"Indra",25000.00,new Department("Java")));
		ls.add(new Employee(2,"Gopi",155000.00,new Department("Java")));
		ls.add(new Employee(3,"Raghu",200000.00,new Department("Python")));
		ls.add(new Employee(4,"Aravind",30000.00,new Department("C++")));
		ls.add(new Employee(5,"Vishnu",50000.00,new Department("Python")));
		
		
		// " COUNT THE SPESIFIC DEPARTMENT IN THE GIVE DATA "
		
		  Long collect = ls 
		  .stream()
		  .filter(emp -> emp.getDep().getDep().equals("C++"))
		  .collect(Collectors.counting());
		
		  
		System.out.println(collect);
		
		//COUNT ALL THE DEPARTMENTS IN THE FIVEN DATA 
		
		Map<String, Long> collect2 = ls
		.stream()
		.collect(
				 (
						 Collectors.groupingBy(
								 Emp->Emp.getDep().getDep(),
								 Collectors.counting()
								 )
						 )
				 );
		
		System.out.println(collect2);
		

		//COUNT ALL THE DEPARTMENTS IN THE FIVEN DATA  using(MethodReference)
		
		Map<String, Long> collect3 = ls
		.stream()
		.collect(Collectors.groupingBy(
				   Employee::Depdata, Collectors.counting()
				)
				);
		System.out.println(collect3);
		
		// Short cut to create Method values with  custom class 
		//1st way of printing the data
		// this method does not work all the time 
		List<String> Lss = Arrays.asList("Isreddy","Raghu","Gopi");
		List<String> collect4 = Lss 
			.stream()
			.map(String::new)
			.collect(Collectors.toList());
		
		System.out.println(collect4);
		//2nd Way to run the string values 
		List<Student> list = Lss
		  .stream()
		  .map(str -> new Student(str))
		  .toList();
		System.out.println(list);
		
	
	}

	
}
