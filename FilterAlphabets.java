package Com.StreamImportantQuestions;

import java.util.stream.Collectors;

public class FilterAlphabets {
 public static void main(String[] args) {
	 
	 String s = "Isr&&*$$123reddy";
	 
	String collect = s 
	.chars()
	.filter(Character::isAlphabetic)
	.mapToObj(c->String.valueOf((char) c))
	.collect(Collectors.joining());
	System.out.println(collect);
}
}
