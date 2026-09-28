package Com.StreamImportantQuestions;
import java.util.*;
public class Student {

	String Name;
	Student(String Name)
	{
		this.Name=Name;
	}
	
	public void setName(String Name)
	{
		this.Name=Name;
	}
	public String getName()
	{
		return Name;
	}
   public String toString()
   {
	   return "Student[" + " Name =" + this.Name +"]";
   }

	
}

