
package com.uia.is12.View;

import com.uia.is12.Bussines.SongBussines;
import com.uia.is12.Domain.Verse;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class SongView extends Thread {
    
    private SongBussines songBussines;

    public SongView() {
        
        songBussines = new SongBussines();
        
        
    }
    
    
  

  
    
    public void run(){
        
               ArrayList< Verse > songs = songBussines.getSong().getVerse();
    
        try {
             
             
            for( Verse p : songs){
                
            Thread.sleep(p.getVerseTime());
            
                System.out.println(p.getParagraph());
            
            }
            
            
            
        } catch (InterruptedException ex) {
            Logger.getLogger(SongView.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
    
    
    }
    
    public static void main(String[] args) {
        SongView song = new SongView();
        
        song.start();
        
        
        
    }
    
    
}
