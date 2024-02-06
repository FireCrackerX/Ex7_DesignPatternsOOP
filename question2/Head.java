import java.util.ArrayList;

public class Head extends Employee{
    private ArrayList<Worker> workers = new ArrayList<Worker>();

    public Head(String name, String position, int salary) {
        super(name, position, salary);
    }

    public void addWorker(Worker worker) {
        workers.add(worker);
    }

    public void printAllWoorkers() {
        for (Worker worker : workers) {
            System.out.println(worker);
        }
    }
}
