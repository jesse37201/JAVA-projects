class Circle{
	protected double r;
	Circle(double r){
		this.r=r;
	}
	public void setRadius(double r) {
		this.r=r;
	}
	public double Area() {
		return r*r*3.14;
	}
	public String toString() {
		return "Radius:"+"r";
	}
}
class Cylinder extends Circle{
	private double h;
	Cylinder(double r,double h){
		super(r);
		this.h=h;
	}
	public double volume() {
		return r*r*3.14*h;
	}
}
public class CircleVolume{
	public static void main(String[]argv) {
		Cylinder cr = new Cylinder(3,4);
		System.out.println("Area:"+cr.Area());
		System.out.println("Volume:"+cr.volume());
	}
}