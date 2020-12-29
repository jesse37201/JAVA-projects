import java.util.*;
class Searcher{
	static int binarySearch(int num,int[] arr) {
		int i=0;
		while (num!=arr[i]) {
			i++;
		}
		return i;
	}
}
public class SearchArr{
	public static void main(String[]argv) {
		int[] arr= {9,17,18,22,27,34,56};
		int num;
		System.out.println("Please input 9,17,18,22,27,34,56 one of the numbers");
		Scanner sc = new Scanner(System.in);
		num=sc.nextInt();
		Searcher se = new Searcher();
		System.out.println("This number is arr["+se.binarySearch(num,arr)+"]");
	}
}