package day12.task4;


import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List<String>members1 = new ArrayList<>();
        members1.add("Grace");
        members1.add("John");
        members1.add("Paul");
        members1.add("Spencer");
        members1.add("Ringo");
        members1.add("Nino");

        MusicBand band = new MusicBand("Airplane", 1965, members1);
        List <String> members2 = new ArrayList<>();
        members2.add("Jack");
        members2.add("Stephany");
        members2.add("Ringo");
        members2.add("George");

        MusicBand band2 = new MusicBand("The Beatles", 1960, members2);
        band.printMembers();
        band2.printMembers();

        MusicBand.transferMembers(band,band2);
        band.printMembers();
        band2.printMembers();


    }
}
