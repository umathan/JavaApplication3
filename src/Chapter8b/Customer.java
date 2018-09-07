package Chapter8b;

public class Customer extends Person {

private String customerNumber;
    
public Customer(String first, String last, String customerNumber){
    super(first, last);
    this.customerNumber = customerNumber;
}
    
public void setCustomerNumber(String customerNumber){
    this.customerNumber = customerNumber;
}

public String getCustomerNumber(){
    return customerNumber;
}

@Override

public String toString(){
    
    return super.toString() + "\nCustomer Number : " + getCustomerNumber();
}

}
