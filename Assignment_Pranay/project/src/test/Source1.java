package test;


import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class Source1 {
	public static void main(String[] args) {
		IntStream stream=IntStream.of(1,3,3,5,6,6,7);
		System.out.println(getDistinct(stream));
	}
	
	public static long getDistinct(IntStream stream) {
		List<Integer> li=stream.boxed().collect(Collectors.toList());
		
		long d=li.stream().distinct().count();
		return d;
		
	}
}
