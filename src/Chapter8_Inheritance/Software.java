package Chapter8_Inheritance;

public class Software extends Product {

public String version;

public Software(){
    super();
    version = "";
    count++;
}
    
public void setVersion(String version){
    this.version = version;
}

public String getVersion(){
    return version;
}
@Override
public String toString(){
    return super.toString() + " " + version;
}

@Override
     public String getDisplayText(){
         return super.toString();
     }
}
