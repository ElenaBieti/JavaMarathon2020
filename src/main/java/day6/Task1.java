package day6;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setColor("white");
        car.setName("Tesla");
        car.setYear(2020);

        Motorbike motorbike = new Motorbike("Black", "Java", 2020);
        car.info();
        motorbike.info();
        System.out.println(car.difference(2010));
        System.out.println(motorbike.difference(2015));


    }
}
