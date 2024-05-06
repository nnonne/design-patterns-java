import java.util.Collections;
import java.util.Comparator;

public class StaffListIterator implements Iterator {
    final private StaffList staffList;
    private int iterationState;


    public StaffListIterator(StaffList staffList) {
        this.staffList = staffList;
        Collections.sort(staffList.getEmployees(), new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                return e1.getName().compareTo(e2.getName());
            }
        });
    }

    @Override
    public boolean hasMore() {
        int size = this.staffList.getEmployees().size();
        return iterationState < size;
    }

    @Override
    public Employee getNext() {
        Employee element = staffList.getEmployees().get(iterationState);
        iterationState++;
        return element;
    }
}
