package A_Arrays;

import java.util.Arrays;

public class Basic {
	public static void main(String[] args) {
		int[] marks = new int[3];
		String[] names = new String[3];
		float[] salary = new float[3];
		double[] rating = new double[3];
		char[] letters = new char[3];
		System.out.println(Arrays.toString(marks));//[0, 0, 0]
		System.out.println(Arrays.toString(names));//[null, null, null]
		System.out.println(Arrays.toString(salary));//[0.0, 0.0, 0.0]
		System.out.println(Arrays.toString(rating));//[0.0, 0.0, 0.0]
		System.out.println(Arrays.toString(letters));//[ , , ]
	}
}
