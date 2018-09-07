package Ch10;

public class ShippingAmount {

public static double getShippingAmount(ShippingType st){
    
    double shippingAmount = 2.99;
    if(st == ShippingType.UPS_NEXT_DAY)
        shippingAmount = 10.99;
    else if (st == ShippingType.UPS_SECOND_DAY)
        shippingAmount = 5.99;
    return shippingAmount;
    
}
    
}

/*
ShippingType secondDay = ShippingType.UPS_SECOND_DAY;

double ShippingAmount = getShippingAmount(ShippingType.UPS_SECOND_DAY);

*/