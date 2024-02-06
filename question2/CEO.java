import java.util.ArrayList;

public class CEO extends Employee {
    private ArrayList<Head> heads = new ArrayList<Head>();

    public CEO (String name, String position, int salary) {
        super(name, position, salary);
    }

    public void addHead(Head head) {
        heads.add(head);
    }

    public void printAllEmployee() {
        System.out.println(this);
        for (Head head : heads) {
            System.out.println(head);
            head.printAllWoorkers();
        }
    }
    
}
