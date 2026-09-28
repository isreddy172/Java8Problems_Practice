package Com.StreamImportantQuestions;

public class Employee {

	 private int Id;
	 private String Name;
	 private double Salary;
	  private Department department;
	  Employee()
	  {
		  
	  }
	 public Employee(int id, String name, double salary, Department dep) {
		super();
		Id = id;
		Name = name;
		Salary = salary;
		this.department = dep;
	}
	 public int getId() {
		 return Id;
	 }
	 public void setId(int id) {
		 Id = id;
	 }
	 public String getName() {
		 return Name;
	 }
	 public void setName(String name) {
		 Name = name;
	 }
	 @Override
	public String toString() {
		return "Employee [Id=" + Id + ", Name=" + Name + ", Salary=" + Salary + ", department=" + department + "]";
	}
	 public double getSalary() {
		 return Salary;
	 }
	 public void setSalary(double salary) {
		 Salary = salary;
	 }
	 public Department getDep() {
		 return department;
	 }
	 public void setDep(Department dep) {
		 this.department = dep;
	 }
	 
	 public String Depdata()
	 {
		 return department.getDep();
	 }
	 
	
}
