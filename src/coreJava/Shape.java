package coreJava;

public abstract  class Shape {

    protected String name;

    public Shape(String name) {
        this.name = name;
    }

    public abstract double calculateArea();

    public void displayInfo() {
        System.out.println("Shape: " + name);
        System.out.println("Area: " + calculateArea());
    }
}
class Circle extends Shape{


    private double radius;
    public Circle(String name,double radius){
        super(name);
        this.radius=radius;
    }
    public double calculateArea(){
        return Math.PI*radius*radius;
    }

}

class Rectangle extends Shape{
    private double length;
    private double width;
    public Rectangle(String name,double length,double width){
        super(name);
        this.length=length;
        this.width=width;

    }
    public double calculateArea(){
        return  length*width;
    }
    //write public static void main method for above code
    public static void main(String[] args) {
        Circle circle = new Circle("Circle", 5);
        circle.displayInfo();

        Rectangle rectangle = new Rectangle("Rectangle", 10, 20);
        rectangle.displayInfo();
    }
}



