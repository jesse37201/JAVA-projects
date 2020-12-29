class T4{
	int x=3,y=5;
	T4(int x, int y) {
		this(x);
		this.y=y;
		System.out.println(this.x);
		System.out.println(this.y);
	}
	T4(int x){
		this.x=x;

	}
}
public class Test4{
	public static void main(String[]argv) {
		int x=10,y=20,z=30;
		T4 t4 = new T4(x,y);
		
	}
}