package streams;

import java.util.ArrayList;
import java.util.List;

public class Employee {

	public Employee(int age, String name, List<String> city) {
		super();
		this.age = age;
		this.name = name;
		this.city = city;
	}

	private int age;
	private String name;
	private List<String> city;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getCity() {
		return city;
	}
	public void setCity(List<String> city) {
		this.city = city;
	}
	
	@Override
	public String toString() {
		return "Employee [age=" + age + ", name=" + name + ", city=" + city + "]";
	}
	public static List<Employee> sampleEmployeeLst() {
		
		List<Employee> empLst= new ArrayList<>();
		empLst.add(new Employee(26, "A", new ArrayList<>()));
		empLst.add(new Employee(36, "V", new ArrayList<>()));
		empLst.add(new Employee(56, "B", new ArrayList<>()));
		empLst.add(new Employee(46, "C", new ArrayList<>()));
		empLst.add(new Employee(96, "D", new ArrayList<>()));
		empLst.add(new Employee(86, "E", new ArrayList<>()));
		
		
		return empLst;
	}
	
}
