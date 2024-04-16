public class Salesperson extends Worker {

  private final Manager manager;
  public Salesperson(String name, Department department, Manager manager) {
    super(name, department);
    this.manager = manager;
  }

}
