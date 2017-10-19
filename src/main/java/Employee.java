
public class Employee implements Comparable<Employee> {
	private String employeeId;
	private String firstName;
	private String lastName;

	public Employee(String employeeId, String firstName, String lastName) {
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	@Override
	public boolean equals(Object obj) {
		Employee other = (Employee) obj;
		return employeeId.equals(other.employeeId);
	}

	@Override
	public int compareTo(Employee other) {
		return employeeId.compareTo(other.employeeId);
	}
}
