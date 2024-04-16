public class ExpensesClient {

  public static void main(String[] args) {

    Workable director = new Manager("Ava", Department.MANAGEMENT);

    Workable meatManager = new Manager("Barry", Department.MEAT_MANAGEMENT);
    Workable dairyManager = new Manager("Caitlin", Department.DAIRY_MANAGEMENT);
    Workable confectioneryManager = new Manager("Dilan", Department.CONFECTIONERY_MANAGEMENT);

    Workable salesperson1 = new Salesperson("Ella", Department.MEAT, (Manager) meatManager);
    Workable salesperson2 = new Salesperson("Francine", Department.MEAT, (Manager) meatManager);
    Workable salesperson3 = new Salesperson("Gerard", Department.MEAT, (Manager) meatManager);
    Workable salesperson4 = new Salesperson("Harry", Department.DAIRY, (Manager) dairyManager);
    Workable salesperson5 = new Salesperson("Iris", Department.DAIRY, (Manager) dairyManager);
    Workable salesperson6 = new Salesperson("Jesse", Department.DAIRY, (Manager) dairyManager);
    Workable salesperson7 = new Salesperson("Karrie", Department.CONFECTIONERY, (Manager) confectioneryManager);
    Workable salesperson8 = new Salesperson("Leonard", Department.CONFECTIONERY, (Manager) confectioneryManager);
    Workable salesperson9 = new Salesperson("Mick", Department.CONFECTIONERY, (Manager) confectioneryManager);


    SalesTeam boss = new SalesTeam(director);
    SalesTeam manager1 = new SalesTeam(meatManager);
    SalesTeam manager2 = new SalesTeam(dairyManager);
    SalesTeam manager3 = new SalesTeam(confectioneryManager);

    manager1.add(salesperson1);
    manager1.add(salesperson2);
    manager1.add(salesperson3);
    manager2.add(salesperson4);
    manager2.add(salesperson5);
    manager2.add(salesperson6);
    manager3.add(salesperson7);
    manager3.add(salesperson8);
    manager3.add(salesperson9);

    boss.add(manager1);
    boss.add(manager2);
    boss.add(manager3);

    boss.payExpenses(200);

  }

  private static void payWorker(Workable worker, int amount) {
    System.out.println("Expenses have been requested");
    worker.payExpenses(amount);
    System.out.println("Expenses have been paid\n");
  }

  private static void payTeam(SalesTeam team, int amount) {
    System.out.println("Expenses have been requested");
    team.payExpenses(amount);
    System.out.println("Expenses have been paid\n");
  }

}
