package Sandeep.Constructor;
public class Rectangle {
    double length;
    double width;
    Rectangle(double length, double width){
        this.length=length;
        this.width=width;
    }
    double calculateArea(){
        return length * width;
    }
    double calculatePerimeter(){
        return 2 * (length + width);
    }

    void display(){
        System.out.println("Rectangle Details\n-----------------");
        System.out.println("Length : "+length);
        System.out.println("Width : "+width);
        System.out.println("Area : "+calculateArea());
        System.out.println("Perimeter : "+calculatePerimeter());
    }
    public static void main(String[] args) {
        Rectangle obj=new Rectangle(10, 5);
        obj.display();
    }
}
