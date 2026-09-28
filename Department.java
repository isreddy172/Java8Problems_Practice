package Com.StreamImportantQuestions;

public class Department {

	private String DepName;

	public Department(String dep) {
		
		DepName = dep;
	}

	public String getDep() {
		return DepName;
	}

	public void setDep(String dep) {
		DepName = dep;
	}

	@Override
	public String toString() {
		return "Department [Dep=" + DepName + "]";
	}
}
