
package com.uia.is12.Domain;

import java.util.ArrayList;


public class Song {
private String name;
private ArrayList<Verse> verse;
    
public Song(){

}

    public Song(String name, ArrayList<Verse> verse) {
        this.name = name;
        this.verse = verse;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Verse> getVerse() {
        return verse;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVerse(ArrayList<Verse> verse) {
        this.verse = verse;
    }


}
