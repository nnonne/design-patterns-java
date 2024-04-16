public class Worker implements Workable {

    private final String name;
    private final Department department;

    public Worker(String name, Department department) {
        this.name = name;
        this.department = department;
    }

    public void payExpenses(int amount) {
        System.out.println(name + " (" + department.name() + ") has been paid $" + amount);
    }

}
