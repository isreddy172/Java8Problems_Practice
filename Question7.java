package Com.StreamImportantQuestions;
import java.util.*;
public class Question7 {
public static void main(String[] args) {
	
	//Employee emp = new Employee();
	
	List<Employee> ls =  new ArrayList<>();
	ls.add(new Employee(1,"Indra",200.0, new Department("CSE")));
	ls.add(new Employee(2,"Gopi",200.0, new Department("Arts")));
	ls.add(new Employee(3,"Raghu",200.0, new Department("Networking")));
	ls.add(new Employee(4,"Aravindh",200.0, new Department("Connections")));
	
	
	List<String> list = ls.stream()
	.map(em->em.getName())
	.toList();
	System.out.println(list);

	
}
}
