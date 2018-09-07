package Ch10;

public enum CustomerType {

CUSTOMERS_RETAIL,
CUSTOMERS_TRADE,
CUSTOMERS_COLLEGE;


@Override
public String toString(){
    
    String c = "";
    if(this.ordinal() == 0)
        c = "Retail Customer";
    else if (this.ordinal() == 1)
        c = "Trade Customer";
    else if (this.ordinal() == 2)
        c = "College Customer";
    return c;
    
    
}



    
}
