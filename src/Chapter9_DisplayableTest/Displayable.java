package Chapter9_DisplayableTest;

public interface Displayable {
    
    default String getDisplayText(){
        return toString();
    }
    
}
