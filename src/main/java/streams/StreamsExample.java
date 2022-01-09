package streams;

import java.util.List;
import java.util.stream.Collectors;

public class StreamsExample {

	public static void main(String[] args) {
		List<Employee> emplst = Employee.sampleEmployeeLst();
		
		List<String> tst = emplst.stream()
				.filter(e -> e.getAge() > 80)
				.map(e1->e1.getName())
				.collect(Collectors.toList());
	    System.out.println(tst.toString());
	}
}
