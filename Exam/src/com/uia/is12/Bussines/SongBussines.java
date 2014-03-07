
package com.uia.is12.Bussines;

import com.uia.is12.Data.SongDAO;
import com.uia.is12.Domain.Song;
import com.uia.is12.Domain.Verse;
import java.util.ArrayList;

public class SongBussines {
    
 private SongDAO songDAO;
    
    
    public SongBussines() {
        songDAO =new SongDAO();
        
    }
    
    public Song getSong(){
    
    
   return songDAO.getSong(); 
   }
    
    
    public static void main(String[] args) {
        SongBussines song = new SongBussines();
        
        ArrayList<Verse> ver = song.getSong().getVerse();
        
        for(Verse p : ver){
            
            System.out.println(p.getParagraph());
        
        }
        
    }
    
  
        
    }
    
    

