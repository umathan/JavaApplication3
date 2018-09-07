package Chapter9_Interface;

public interface Displayable {

    default String getDisplayText(){
    return toString();
}
    
}
