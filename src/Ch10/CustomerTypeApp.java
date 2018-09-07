package Ch10;

public class CustomerTypeApp {

    public static void main(String[] args) {
        // display a welcome message
        System.out.println("Welcome to the Customer Type Test application\n");

        // get and display the discount percent for a customer type
  
        /*
        double displayCustomerDiscountType = getCustomerType(CustomerType.CUSTOMERS_TRADE);
        System.out.println("Discount for Customers_Trade is " + displayCustomerDiscountType);
    */
        CustomerType retail = CustomerType.CUSTOMERS_RETAIL;
        System.out.println( retail.toString() + " " + getDiscountPercent(retail));
        
        CustomerType trade = CustomerType.CUSTOMERS_TRADE;
        System.out.println(trade.toString() + " " + getDiscountPercent(trade));
        
        CustomerType college = CustomerType.CUSTOMERS_COLLEGE;
        System.out.println(college.toString() + " " + getDiscountPercent(college));
        
       
        
        
    }     
       
    
    public static double getDiscountPercent(CustomerType ct){
            
            double discoutPercent = 0.10;
            if(ct == CustomerType.CUSTOMERS_TRADE)
            discoutPercent = 0.30;
            else if(ct == CustomerType.CUSTOMERS_COLLEGE)
               discoutPercent = 0.20;
            return discoutPercent;
            
        }
        
    
    /* ShippingType secondDay = ShippingType.UPS_SECOND_DAY;

double ShippingAmount = getShippingAmount(ShippingType.UPS_SECOND_DAY);
*/
    
    
        
        
        // display the value of the toString method of a customer type
    }

    // a method that accepts a CustomerType enumeration

