public class App {
    public static void main(String[] args) {
        CEO ceo = new CEO("Settha", "CEO", 500000);
        
        Head head1 = new Head("Kamphaka", "Head Sales", 300000);
        Worker worker1 = new Worker("Wiroj", "Sales", 150000);
        Worker worker2 = new Worker("Weeranan", "Sales", 100000);
        head1.addWorker(worker1);
        head1.addWorker(worker2);

        Head head2 = new Head("Unglnk", "Head Marketing", 300000);
        Worker worker3 = new Worker("Oak", "Marketing", 200000);
        Worker worker4 = new Worker("Aem", "Marketing", 250000);
        head2.addWorker(worker3);
        head2.addWorker(worker4);

        ceo.addHead(head1);
        ceo.addHead(head2);

        printAllEmployee(ceo);
    }

    public static void printAllEmployee(CEO ceo) {
        ceo.printAllEmployee();
    }
}
