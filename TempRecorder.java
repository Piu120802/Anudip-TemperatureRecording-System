package anudippractice;
import java.util.*;
public class TempRecorder {
 
	public static void main(String[] args) 
	{ 
		int temp, sum = 0;
		float averagetemp;
		Scanner sc = new Scanner(System.in);
		for (int i=1; i<=7; i++) 
		{
			System.out.print("Enter Day 1 temperature " + i + "= ");
			temp = sc.nextInt();
			sum = temp+sum;
		}
	averagetemp = (float)sum/7;
	System.out.printf("Average temperature for the week is "+averagetemp+"Celcius");
		} 
}

