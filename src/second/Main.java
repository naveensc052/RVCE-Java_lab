package second;

import java.util.Scanner;

class Circle{
	double radius;
	String color;
	Circle(double radius){
		this.radius = radius;
	}
	Circle(double radius, String color){
		this.color = color;
		this.radius = radius;
	}
	public double getRadius() {
		return radius;
	}
	public double getArea() {
		return 3.14*radius*radius;
	}
	
	
}

class Cylinder extends Circle{
	double height;
	Cylinder(double radius, double height){
		super(radius);
		this.height = height;
	}
	Cylinder(double radius, double height, String color){
		super(radius,color);
		this.height = height;
	}
	public double getHeight() {
		return height;
	}
	public double getVolume() {
		return super.getArea()*height;
	}
	public double getArea() {
		return 2*super.getArea() + 2*3.14*super.getRadius()*height;
	}
}
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Cylinder 1");
		System.out.println("Enter the radius of the cylinder");
		double r=sc.nextDouble();
		System.out.println("Enter the height of the cylinder");
		double h=sc.nextDouble();
		System.out.println("Enter the color of the cylinder");
		String c=sc.nextLine();
		c=sc.nextLine();
		Cylinder c1=new Cylinder(h,r,c);
		System.out.println("Cylinder 2");
		System.out.println("Enter the radius of the cylinder");
		r=sc.nextDouble();
		System.out.println("Enter the height of the cylinder");
		h=sc.nextDouble();
		System.out.println("Enter the color of the cylinder");
		c=sc.nextLine();
		c=sc.nextLine();
		Cylinder c2=new Cylinder(h,r,c);
		if(c1.getArea()==c2.getArea() && 
		c1.getVolume()==c2.getVolume() && 
		c1.color.equalsIgnoreCase(c2.color))
		{
			System.out.println("The Cylinders are similar");
		}
		else
		{
			System.out.println("The Cylinders are not similar");
		}
		sc.close();


	}

}
