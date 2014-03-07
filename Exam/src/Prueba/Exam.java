
package Prueba;

import com.uia.is12.Domain.Song;
import com.uia.is12.View.SongView;


public class Exam {

    
    public static void main(String[] args) {
    
        SongView song = new SongView();
        Song name = new Song();
        name.setName("Hoy te toca ser feliz ");
        System.out.println(name.getName());
        song.start();
        
        
     
    }
}
