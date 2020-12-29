import java.util.*;
class Dates{
		private String[] date;
	public Dates(){
		  date = new String[] {"mon","tues","wed","thur","fri","sat","sun"};
	}
	public String askData(int num) {
		return date[num-1];
	}
}
public class Week{
	public static void main(String[]argv) {
		Dates week = new Dates();
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println(week.askData(num));
	}
}