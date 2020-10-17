package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane ("Airbus A220", 2015,37,61000);
        airplane.setYear(2019);
        airplane.setLength(38);
        airplane.fillUp(1000);
        airplane.fillUp(3000);
        airplane.info();
    }
}
