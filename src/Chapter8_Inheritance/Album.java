package Chapter8_Inheritance;

public class Album extends Product {
    
    private String artist;
    
    public Album(){
        super();
       String artist = "";
       count++;
              
    }
    
    public void setArtist(String artist){
        this.artist = artist;
    }
    
    public String getArtist(){
        return artist;
    }
    
    public String toString(){
        return super.toString() + " " + "(" + artist + ")";
        
    }
    @Override
     public String getDisplayText(){
         return super.toString();
     }
    
}
