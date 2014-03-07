
package com.uia.is12.Data;

import com.uia.is12.Domain.Song;
import com.uia.is12.Domain.Verse;
import java.util.ArrayList;


public class SongDAO {
    
   
    
    public SongDAO(){
  
        
    }
    
    
    public Song getSong(){
        
        Song song= new Song();
        
        ArrayList<Verse> verse = new ArrayList();
        
        verse.add(new Verse("Cuando un sueño se te muera ",5000));
        verse.add(new Verse("O entre en coma una ilusion ",5000));
        verse.add(new Verse("No la entierres ni lo llores recusitalo",5000));
        verse.add(new Verse("Deja entrar en tu alma una brisa",5000));
        verse.add(new Verse("Que avente la dudas y alivie tu mal",5000));
        verse.add(new Verse("Que la puena se muera de risa ",5000));
        verse.add(new Verse("Cuando un sueño muere es porque se a hecho real!!!!",5000));
        verse.add(new Verse("Y veras que tu puedes volar",5000));
        verse.add(new Verse("Y que todo lo consigues",5000));
        verse.add(new Verse("Porque hoy tu vas a sonreir",5000));
        verse.add(new Verse("Hoy te toca ser feliz!!!!!",5000));
        
        song.setVerse(verse);
     
        return song;
    }
    
    public static void main(String[] args) {
        SongDAO can= new SongDAO();
        
        ArrayList< Verse > verso = can.getSong().getVerse();
        
        for(Verse d : verso){
            System.out.println(d.getParagraph());
        
        }
     
        
    }
    
}
