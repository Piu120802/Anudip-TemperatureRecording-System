package anudippractice;
import java.util.*;
public class TempRecorder {
		double[] temperatures = { 37.0, 37.9, 38.4, 35.2, 33.0, 35.8, 39.0 };

		public void average() {
			double avg = 0;
			for (int i = 0; i < temperatures.length; i++) {
				avg = avg + temperatures[i];
			}
			System.out.println("Average Temperature : " + (avg / 7)+" celcius");
		}

		public void maxTemp() {
			double max = temperatures[0];
			for (int i = 0; i < temperatures.length; i++) {
				if (temperatures[i] > max) {
					max = temperatures[i];
				}
			}
			System.out.println("Highest temp: " + max+" celcius");
		}

		public void lowTemp() {
			double low = temperatures[0];
			for (int i = 0; i < temperatures.length; i++) {
				if (temperatures[i] < low) {
					low = temperatures[i];
				}
			}
			System.out.println("Lowest temp: " + low+" celcius");
		}

		public static void main(String[] args) 
		{
			TempRecorder temp = new TempRecorder();
			temp.average();
			temp.maxTemp();
			temp.lowTemp();
		}
	}

