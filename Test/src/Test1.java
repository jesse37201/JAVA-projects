class add{
	int totle;
	public int add(int[] a) {
		for(int i=0;i<a.length;i++) {
			totle+=a[i];
		}
		return totle;
	}
}
public class Test1{
	public static void main(String[]argv) {
		int arr1[] = {13,26,33,57,54,15,39,57}; 
		add T = new add();
		System.out.println(T.add(arr1));
	}
}