package wellsfarfo;

public class MainTest {

	public static void main(String[] args) {
		Sdt s1=  new Sdt(1, "ajay");
		Sdt s2=s1;
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1.equals(s2));


	}
}
