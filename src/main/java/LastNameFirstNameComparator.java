import java.util.Comparator;
public class LastNameFirstNameComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        int lastNameCompare = o1.getLastName().compareTo(o2.getLastName());
        if (lastNameCompare == 0) {
            return o1.getFirstName().compareTo(o2.getFirstName());
        }
        return lastNameCompare;
    }
}