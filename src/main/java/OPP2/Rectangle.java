/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OPP2;

/**
 *
 * @author Administrator
 */
public class Rectangle {
   
    private double length;
    private double width;

    public Rectangle() {
        this.length = 1.0;
        this.width = 1.0;
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }


    public void setLength(double length) {
        this.length = length;
    }

    public double getLength() {
        return this.length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getWidth() {
        return this.width;
    }

    public double findArea() {
        return this.length * this.width;
    }

    public double findPerimeter() {
        return 2 * (this.length + this.width);
    }

    public void showInfo() {
        System.out.println("chieu dai: " + this.length + ", chieu rong: " + this.width);
        System.out.println("dien tich: " + findArea() + ", chu vi: " + findPerimeter());
    }
}
