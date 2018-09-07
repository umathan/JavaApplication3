package Chapter11Arrays;

import java.util.Arrays;

public class ItemApp {
    public static void main (String[] args){
         
        Item [] items  = new Item[3];
        items[0] = new Item(102, "Duct Tape");
        items[1] = new Item(103, "Bailing wire");
        items[2] = new Item(101, "Chewing gum");
 
    
    Arrays.sort(items);
    for (Item i : items){
            System.out.println(i.getNumber() + ":" + i.getDescription());
            }
    }
       }

