import java.util.ArrayList;

public class SalesTeam implements Workable {

    private final ArrayList<Workable> workers = new ArrayList<>();

    private final Workable director;

    public SalesTeam(Workable worker) {
        this.director = worker;
    }

    public ArrayList<Workable> getChildren() {
        return workers;
    }
    public void add(Workable worker) {
        workers.add(worker);
    }
    public void remove(Workable worker){
        workers.remove(worker);
    }

    @Override
    public void payExpenses(int amount) {
        director.payExpenses(amount);

        for (Workable worker : workers) {
            worker.payExpenses(amount);
        }
    }

}
