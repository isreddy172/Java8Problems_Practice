package Com.StreamImportantQuestions;

import java.util.*;
//Find the sum of the numbers in the given list
//AGGRIGATE FUNCTION THEY ARE NOT WORK DIRECTLY ON THE STREAMS WE NEED TO CONVERT THEM " INTSTREAM "
public class Question10 {

	public static void main(String[] args) {
		List<Integer> ls = Arrays.asList(9,20,30,40,50,60);
		
		int sum = ls.stream()
		.mapToInt(num-> num)
		.sum();
		System.out.println(sum);
		
		// Question 10A finding max Element
		
		int max = ls.stream()
		.mapToInt(n->n)
		.max()
		.getAsInt();
		System.out.println(max);
		
		//Question 10b
		
		int  minval = ls
		 .stream()
		.mapToInt(n->n)
		.min()
		.getAsInt();
		
		System.out.println(minval);
		
		//OUESTION 10C count the values in the list that are factors or divisible by 6
		long count = ls 
		.stream()
		.filter(x->x%6==0)
		.count();
		System.out.println(count);
		//Question 10D return true  if the is a number a number divisible by 5 else print false
		
		boolean allMatch = ls.stream()
		.mapToInt(n->n)
		.allMatch(n->n%5==0);
		System.out.println(allMatch);
		
		//question 10 E print true Atleast on number is divisible by give value
		
		boolean oneMatch = ls.stream()
				.mapToInt(n->n)
				.anyMatch(n->n%8==0);
				System.out.println(oneMatch);
		
		
		
	}
}
