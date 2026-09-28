package Com.StreamImportantQuestions;
import java.util.*;
//Given a list of numbers add all the values by 4 and return the top 2
//values in a list which are multiples of 5
public class PrintTop2Valuesfromthelist {

 public static void main(String[] args) {
	List<Integer> ls = List.of(3,5,2,11,1,6,7,1,9,11);
	List<Integer> list = ls.stream()
	.map( i ->i+4)
	.filter(i->i%5==0)
	.sorted(Comparator.reverseOrder())
	.distinct()
	.limit(2)
	.toList();
	System.out.println(list);
	
}
}
