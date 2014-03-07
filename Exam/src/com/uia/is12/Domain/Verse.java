
package com.uia.is12.Domain;


public class Verse {
    
    private String paragraph;
    private int verseTime;
    
    public Verse(){
    
    }

    public Verse(String paragraph, int verseTime) {
        this.paragraph = paragraph;
        this.verseTime = verseTime;
    }

    public String getParagraph() {
        return paragraph;
    }
    
   public void setParagraph(String paragraph){
       this.paragraph=paragraph;
   
   }

    public int getVerseTime() {
        return verseTime;
    }

    public void setVerseTime(int verseTime) {
        this.verseTime = verseTime;
    }
   
}
