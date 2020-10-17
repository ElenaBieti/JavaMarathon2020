package day5;



public class Task1 {
    public static void main(String[] args) {
       Car car = new Car();
       car.setName("Tesla");
       car.setColor("White");
       car.setYear(2020);

       System.out.println("Name: " + car.getName()+";" + " Color: " + car.getColor()+";" + " Year: " + car.getYear()+";");

    }
}
