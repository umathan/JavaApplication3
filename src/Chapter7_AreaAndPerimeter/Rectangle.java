package Chapter7_AreaAndPerimeter;

import java.text.NumberFormat;

public class Rectangle {

private double length;
private double width;

public Rectangle(){
    double length = 0;
    double width = 0;
}
    
public Rectangle(double length, double width){
    this.length = length;
    this.width = width;
}
    public double getLength() {
        return length;
    }

    
    public void setLength(double length) {
        this.length = length;
    }

    
    public double getWidth() {
        return width;
    }

    
    public void setWidth(double width) {
        this.width = width;
    }
    
    public double getArea(){
        double area = getLength()* getWidth();
        return area;
    }
    
    public String getAreaFormatted(){
        NumberFormat number = NumberFormat.getNumberInstance();
        number.setMinimumFractionDigits(3);
        return number.format(this.getArea());
        }
    
    public double getPerimeter(){
        double perimeter = 2*getLength() + 2*getWidth();
        return perimeter;
    }
    
    public String getPerimeterFormatted(){
        NumberFormat number = NumberFormat.getNumberInstance();
        number.setMinimumFractionDigits(3);
        return number.format(getPerimeter());
    }
}
