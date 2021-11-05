package ua.lviv.lgs;

public class Circle {

	private double radius;
	private double diameter;
	
	Circle (double radius, double diameter) {
		this.radius = radius;
		this.diameter = diameter;
	}
	
	
	public double getRadius() {
		return radius;
	}
	
	public double getDiameter() {
		return diameter;
	}
	
	
	public double length (double radius) {
		double length = Math.PI * 2 * radius;
		return length;
		
	}
	
	public double area (double diameter) {
		double area = Math.PI * diameter / 4;
		return area;
	}


	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", diameter=" + diameter + "]";
	}
	
}
