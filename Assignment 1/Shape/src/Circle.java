public class Circle extends Shape {
private double radius;
public Circle(){
	super();
}
public Circle(double radius){
	this.radius = radius;
}
public double getArea(){
	return radius * radius * Math.PI;

}
public double getRadius() {
	return radius;
}
public void setRadius(double radius) {
	this.radius = radius;
}
public double getPerimeter(){
	return 2 * Math.PI * radius;
}
public double getDiameter(){
	return 2 * radius;
}
}
