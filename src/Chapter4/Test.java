package Chapter4;

import java.text.NumberFormat;

public class Test {

public static void main (String [] args){
    
    NumberFormat percent = NumberFormat.getPercentInstance();
    percent.setMinimumFractionDigits(1);
    
    NumberFormat currency = NumberFormat.getCurrencyInstance();
    
    String table = " ";
            String headerRow = "Year    ";
            for ( double rate = 5.0; rate < 7.0; rate +=.5){
                headerRow = headerRow + percent.format(rate/100) + "       ";
               
}
    //System.out.println(headerRow);

double futureValue = 0.0;
            //double interestRate = 2.0;
            double interestRate = 0.0;
            double monthInvestment = 100.0;
            int year = 0;
            for ( year = 1; year <6; year++){
                for (interestRate = 5.0; interestRate < 7; interestRate += .5){
                    int months = year * 12;
                    double monthlyInterstRate = interestRate/12/100;
                        for (int i = 1; i <=months; i++){
                    
                    futureValue =  (futureValue + monthInvestment)* (1+monthlyInterstRate);
                        }
                }
                System.out.println(currency.format(futureValue));
            }
}
}
