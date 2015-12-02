/*
Name : JunYoung (Eddie) Sohn
Lab 13
File Name : Rectangle
Date : 2015 Oct 02
*/

public class Rectangle {
    
    private double width;
    private double height;
    
    
    public void setWidth(double x) {
        
        width = x;
        
    }
    
    public void setHeight(double x) {
        
        height = x;
        
    }

    public double getArea() {
        
        return width*height;
        
    }
    
    public static void main(String[] args) {
        
        Rectangle r1 = new Rectangle();
        r1.setWidth(9.9);
        r1.setHeight(9.3);
        System.out.println(r1.getArea());
        
    }
    
    
}