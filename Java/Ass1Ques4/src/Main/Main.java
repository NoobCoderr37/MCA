package Main;
import java.util.Arrays;
import Trigonometry.Trigonometry;
import Statistics.Statistics;
public class Main {

	public static void main(String[] args) {
		double angle = Math.PI / 4;
		System.out.println("Sine of " + angle + " is " + Trigonometry.sine(angle));
		System.out.println("Cosine of " + angle + " is " + Trigonometry.cosine(angle));
		System.out.println("Tan of " + angle + " is " + Trigonometry.tan(angle));
         
		double[] A = {1, 2, 3, 4, 5};
	    System.out.println("Mean of " + Arrays.toString(A) + " is " + Statistics.mean(A));
	    System.out.println("Median of " + Arrays.toString(A) + " is " + Statistics.median(A));
	    System.out.println("Mode of " + Arrays.toString(A) + " is " + Statistics.mode(A));
	}
	}


