package day11;

public class Picker implements Worker {
    public Picker(int salary) {
        this.salary = salary;
    }

    public Picker(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    private Warehouse warehouse;


    public int getSalary() {
        return salary;
    }

    private int salary;

    @Override
    public void doWork() {
        salary += 100;
        warehouse.setCountOrder(warehouse.getCountOrder() + 1);

    }

    @Override
    public void bonus() {
        if (warehouse.getCountOrder() > 1500) {
            salary *= 3;
        }
    }

    @Override
    public String toString() {
        return "Picker{" +
                "salary=" + salary +
                '}';
    }
}
