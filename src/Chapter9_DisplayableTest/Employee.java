package Chapter9_DisplayableTest;

public class Employee implements DepartmentConstants, Displayable{

    private int department;
    private String firstName;
    private String lastName;
    
    public Employee(int department, String firstName, String lastName){
        this.department = 0;
        this.firstName = "";
        this.lastName= "";
    }
    
    @Override
    public String toString(){
        
        String text = "";
        text += firstName + " " + lastName;
        String dept = "";
        if (department == ADMIN){
            dept = "Administration";
        }else if(department == EDITORIAL){
            dept = "Editorial";
        }else if(department == MARKETING){
            dept = "Marketing";
        }
        
          text += "  (" + dept + ")";
          return text;
    
}
}