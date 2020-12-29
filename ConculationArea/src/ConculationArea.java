import java.io.*;
class Conculation{
	private float pi = 3.14f;
	public float square(float length,float width) {
		return length*width;
	}
	public float triangle(float base,float high) {
		return base*high/2;
	}
	public float round(float radius) {
		return radius*radius*pi;
	}
}
public class ConculationArea{
	public static void main(String[]argv)throws java.io.IOException{
		System.out.println("Please input pattern");
		BufferedReader buf = new java.io.BufferedReader
				(new java.io.InputStreamReader(System.in));
		String pattern = buf.readLine();
		switch(pattern) {
			case "square":{
				System.out.println("Please input length");
				float length = Float.parseFloat(buf.readLine());
				System.out.println("Please input width");
				float width = Float.parseFloat(buf.readLine());
				Conculation area = new Conculation();
				System.out.println("This square area ="+area.square(length, width));
				break;
			}
			case "triangle":{
				System.out.println("Please input base");
				float base = Float.parseFloat(buf.readLine());
				System.out.println("Please input high");
				float high = Float.parseFloat(buf.readLine());
				Conculation area = new Conculation();
				System.out.println("This triangle area ="+area.triangle(base, high));
				break;
			}
			case "round":{
				System.out.println("Please input radius");
				float radius = Float.parseFloat(buf.readLine());
				Conculation area = new Conculation();
				System.out.println("This round area ="+area.round(radius));
				break;
			}
			default:{
				System.out.println("Your input error");
			}
		}
	}
}