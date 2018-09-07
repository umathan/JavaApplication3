package Chapter11Arrays;


public class Item implements Comparable {

    private int number;
    private String description;
    
    public Item(int number, String description){
        this.number = number;
        this.description = description;
    }
    
    public int getNumber(){
        return number;
    }
    
    public String getDescription(){
        return description;
    }
    
    @Override
    public int compareTo(Object o){
        Item i = (Item)o;
        if(this.getNumber() < i.getNumber()){
            return -1;
        }else if(this.getNumber() > i.getNumber()){
            return 1;
        }
        return 0;
    }
    
   
}
