package Chapter9_Interface;

public class Employee implements DepartmentConstants, Displayable{

private String firstName;
private String lastName;
private int department;
    
public Employee(String firstName, String lastName, int department){
    this.firstName = firstName;
    this.lastName = lastName;
    this.department = department;
}

@Override
public  String toString(){
    
    String text = "";
    String dept = "";
    text += "" + firstName + " " + lastName;
    if(department == ADMIN){
        dept = "Administration";
    }else if(department == EDITORIAL){
        dept = "Edit";
       
    }else if(department == MARKETING){
        dept = "Market";
    }
    
    text += "(" + dept + ")";
    return text;
    
}

}
