package day12.task4;

import java.util.ArrayList;
import java.util.List;

public class MusicBand {
    private String name;

    public List<String> getMembers() {
        return members;
    }

    public void setMembers(List<String> members) {
        this.members = members;
    }

    List<String> members;


    public MusicBand(String name, int year, List<String> members) {
        this.name = name;
        this.year = year;
        this.members = members;
    }

    private int year;

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

    public static void members (MusicBand a, MusicBand b) {
        for (String member : a.getMembers())
            b.getMembers().add(member);
        a.getMembers().clear();
    }

    public void printMembers() {
        System.out.println(this.members);
    }
    public static void transferMembers(MusicBand a, MusicBand b) {
        for(String members : a.getMembers())
            b.getMembers().add(members);
        a.getMembers().clear();
    }


    @Override
    public String toString() {
        return "MusicBand{" +
                "name='" + name + '\'' +
                ", year=" + year +
                '}';
    }
}


