public class Test2{
	public static void main(String[]argv) {
		int x=5;
		int y=10;
		x=y;
		System.out.println("x=y:"+(x==y));
		int[]a = {1,2,3};
		int[]b;
		b=a;
		System.out.println("a=b:"+(a==b));
		String one = "abcd";
		System.out.println(one);
	}
}