import java.util.ArrayList;
import java.util.List;

public class StaffList{

    private final List<Employee> employees = new ArrayList<>();

    public List<Employee> getEmployees() {
        return employees;
    }

    public void addEmployee(Employee employee){
        employees.add(employee);
    }

    public Iterator createIterator() {
        return new StaffListIterator(this);
    }
}
