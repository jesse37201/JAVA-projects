class T3{
	private int a = 4;
	private int b;
	public int getA() {
		return a;
	}
	public void setB(int b) {
		this.b=b;
	}
	protected int getB() {
		return b;
	}
}
public class Test3{
	public static void main(String[]argv) {
		T3 try3 =new T3(); 
		System.out.println(try3.getA());
		try3.setB(28);
		System.out.println(try3.getB());
	}
}