package Ch10;

public enum ShippingType {

UPS_NEXT_DAY,
UPS_SECOND_DAY,
UPS_GROUND;

@Override
public String toString(){
    
    String s = "";
    if(this.ordinal() == 0)
        s = "UPS Next Day (1 business day)";
    else if (this.ordinal() == 1)
        s = "UPS Second Day (2 business days)";
    else if (this.ordinal() == 2)
        s = "UPS Ground (5 to 7 business days)";
    return s;
    
    
}

}


/*
ShippingType ground = ShippingType.UPS_Ground;
System.out.println("toString: " + ground.toString() + "\n");
*/