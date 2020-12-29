class T1{
	int a=3;
	T1(int x){
		System.out.println(this.a);
		System.out.println(x);
	}
}
class T2 extends T1{
	T2(int x) {
		super(x);
		// TODO 自動產生的建構子 Stub
	}

	int a=5;

}
public class Test5{
	public static void main(String[]argv) {
		T2 t2 = new T2(15);
		
	}
}