package day12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List <String> cars = new ArrayList<>();
        cars.add("Tesla");
        cars.add("Jeep");
        cars.add("Ram");
        cars.add("Ford");
        cars.add("Honda");
        cars.remove(0);
        System.out.println(cars);
        cars.add(2,"Mazda");
        System.out.println(cars);



    }
}

