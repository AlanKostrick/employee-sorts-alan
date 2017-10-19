import java.util.ArrayList;
import java.util.Collections;


public class EmployeeApp {

	public static void main(String[] args) {
		
		ArrayList<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee ("1","bob", "smith"));
		employees.add( new Employee("2","fred", "jones"));
		employees.add(new Employee ("3","alan", "kostrick"));
		employees.add(new Employee ("4","zach", "williams"));
		
		LastNameFirstNameComparator name = new LastNameFirstNameComparator();
		Collections.sort(employees, name);
		
		System.out.println(employees);

}
}
