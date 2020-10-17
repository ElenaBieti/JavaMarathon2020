package day6;

public class Motorbike {
    private String color;
    private String name;
    private int year;

    public Motorbike(String color, String name, int year) {
        this.name = color;
        this.color = name;
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public void info() {
        System.out.println("Это мотоцикл");
    }

    public int difference(int inputYear) {
        return inputYear - year;
    }
}

