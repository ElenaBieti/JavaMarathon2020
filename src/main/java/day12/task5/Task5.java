package day12.task5;

import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        List<MusicArtist>members1 = new ArrayList<>();
        members1.add(new MusicArtist("John", 65));
        members1.add(new MusicArtist("Lisa", 50));
        members1.add(new MusicArtist("Karl", 47));
        members1.add(new MusicArtist("Jack", 30));
        members1.add(new MusicArtist("Fill", 37));

        MusicBand band1 = new MusicBand("Carbon Based lifeforms", 1985, members1);

        List<MusicArtist>members2 = new ArrayList<>();
        members2.add(new MusicArtist("Sara", 33));
        members2.add(new MusicArtist("Ivana", 45));
        members2.add(new MusicArtist("Melania",57));
        members2.add(new MusicArtist("Dominika",26));

        MusicBand band2 = new MusicBand("Spice Girls",1995,members2);
        band1.printMembers();
        band2.printMembers();

        MusicBand.transferMembers(band1, band2);
        band1.printMembers();
        band2.printMembers();


    }
}
