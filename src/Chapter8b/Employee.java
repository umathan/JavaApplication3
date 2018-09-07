package Chapter8b;

public class Employee extends Person {

private String ssn;

public Employee (String first, String last, String ssn){
    super(first, last);
   this.ssn = ssn;
}
    
public void setSsn (String ssn){
    this.ssn = ssn;
}

public String getSsn(){
    
    return ssn.replaceAll("^[0-9][0-9][0-9][0-9][0-9]", "xxxxx");
    
    // return ssn.replaceAll("^[0-9]{5}", "xxxxx");
    
    //** return "xxx-xx-" + ssn.substring(ssn.lenthn() -4);
}
@Override
public String toString(){
    
    String name = super.toString();
    return name + "\n" + "SSN: " + getSsn();
}

}
