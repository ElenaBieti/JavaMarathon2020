package day6;

public class Car {
     private String name;
     private String color;
     private int year;

     public String getName() {
         return name;
     }
     public void setName (String name) {
         this.name = name;
     }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void info() {
        System.out.println("Это автомобиль");
    }
    public int difference (int inputYear) {
         return inputYear - year;

    }
}




