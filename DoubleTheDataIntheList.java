package Com.StreamImportantQuestions;

import java.util.List;

public class DoubleTheDataIntheList {

  public static void main(String[] args) {
	List<Integer> ls = List.of(1,2,3,4,5);
	
	List<Integer> list = ls
	.stream()
	.map(i -> i*2)
	.toList();
	System.out.println(list);
}
}
