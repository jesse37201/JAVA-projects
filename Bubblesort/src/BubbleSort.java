public class BubbleSort{
	public static void main(String[]argv) {
		int[] arr = {13,25,37,11,9,18,26,54,47};
		int temp;
		for(int i=0;i<arr.length;i++) {
			for(int j=i;j<arr.length-1;j++) {
				if(arr[i]>arr[j+1]) {
					temp = arr[i];
					arr[i] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		for(int k=0;k<arr.length;k++) {
			System.out.print(arr[k]+" ");
		}
	}
}