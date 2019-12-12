package practice.streams;

import java.util.Arrays;
import java.util.List;

public class PrintElementStream {
	
	static List<Integer> list = Arrays.asList(1,2,3,4,5,6,7);
	
	static void printElements(List ls) {
		ls.stream().forEach(i -> System.out.println(i));
	}
	
	public static void main(String[] args) {
		//PrintElementStream str = new PrintElementStream();
		printElements(list);
		
	}

}
