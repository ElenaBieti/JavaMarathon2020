package day11;

public class Courier implements Worker {
    public Courier(int salary) {
        this.salary = salary;
    }

    public Courier(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    private Warehouse warehouse;

    public int getSalary() {
        return salary;
    }

    private int salary;

    @Override
    public void doWork() {
        salary +=80;
        warehouse.setBalance(warehouse.getBalance() + 1000);

    }

    @Override
    public void bonus(){
        if (warehouse.getBalance() > 1000000) {
            salary *= 2;
        }
    }

    @Override
    public String toString() {
        return "Courier{" +
                "salary=" + salary +
                '}';
    }
}
