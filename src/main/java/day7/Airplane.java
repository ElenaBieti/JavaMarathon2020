package day7;

public class Airplane {
    private String name;
    private int year;
    private int length;
    private int weight;
    private int fuel;

    public Airplane(String name, int year, int length, int weight) {
        this.name = name;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuel =0;
    }
    public void info() {
        System.out.println("Изготовитель:" + name + "; Год выпуска:" + year + "; Длина:" + length + "; Вес:" + weight +
                "; Количество топлива в баке:" + fuel);

    }
    public void fillUp(int inputFuel) {
        fuel += inputFuel;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }
    public static void compareAirplanes (Airplane airplane1, Airplane airplane2) {
        if (airplane1.getLength() > airplane2.getLength()) {
            System.out.println("Самолет под номером 1 длиннее");
        }
        else if (airplane1.getLength() < airplane2.getLength()) {
            System.out.println("Самолет под номером 2 длинее");
        }
        else {
            System.out.println("Длины самолетов равны");
        }
    }
}

