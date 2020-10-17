package day12.task3;

import day12.task3.MusicBand;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        MusicBand musicBand1 = new MusicBand("Blink - 192", 1992);
        MusicBand musicBand2 = new MusicBand("The Offspring", 1984);
        MusicBand musicBand3 = new MusicBand("Red Hot Chili Pappers", 1983);
        MusicBand musicBand4 = new MusicBand("The Limp Bizkit", 1984);
        MusicBand musicBand5 = new MusicBand("Robert Cristian", 2015);
        MusicBand musicBand6 = new MusicBand("Pascal junior", 2020);
        MusicBand musicBand7 = new MusicBand("Carbon Based Lifeforms", 1996);
        MusicBand musicBand8 = new MusicBand("Enigma", 1990);
        MusicBand musicBand9 = new MusicBand("Meiko", 2017);
        MusicBand musicBand10 = new MusicBand("Metallica", 1980);

        List<MusicBand> musicBands = new ArrayList<>();
        musicBands.add(musicBand1);
        musicBands.add(musicBand2);
        musicBands.add(musicBand3);
        musicBands.add(musicBand4);
        musicBands.add(musicBand5);
        musicBands.add(musicBand6);
        musicBands.add(musicBand7);
        musicBands.add(musicBand8);
        musicBands.add(musicBand9);
        musicBands.add(musicBand10);

        System.out.println(musicBands);
        Collections.shuffle(musicBands);
        System.out.println(musicBands);

        List<MusicBand> musicBandsAfter2000 = new ArrayList<>();
        for(MusicBand musicBand : musicBands) {
        if (musicBand.getYear() > 2000)
            musicBandsAfter2000.add(musicBand);
            System.out.println(musicBandsAfter2000);

        }

    }
}
