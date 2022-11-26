package edu.wsh.secondyear.rectangle;

public class Rectangle {
    private int length;
    private int width;

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        Rectangle rectangle1 = new Rectangle();
        rectangle.length = 11;
        rectangle.width=5;
        rectangle1 .length=3;
        rectangle1.width=15;
        rectangle.calculateArea();
        rectangle1.calculateArea();
        rectangle.print();
        rectangle1.print();
    }

    public void calculateArea(){
        System.out.println(length*width);
    }

    public void print(){
        System.out.println("length = " + length);
        System.out.println("width = " + width);
    }
}
