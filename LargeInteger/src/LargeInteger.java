
import java.util.Arrays;

public class LargeInteger {
	
	public static void main(String[] args) {
		
		int[] test1 =  new int[] {1,5,3,9};
		int[] test2 = new int[] {0, 4, 5, 2};
		
		System.out.println(Arrays.toString(add(test1, test2)));
	}

	public static int[] add(int[] a, int[] b) {
		int sum = 0;
		int[] total = new int[a.length];
		int[] digit = new int[2];
		
		
		for (int i = a.length-1; i<0; i++) {
			sum = a[i] + b[i];
			if(sum>10) {
				total[a.length-i] = 0;
				a[a.length-i-1] += 1;
			}
			else {
				total[i] = sum;
			}
		
		}
		return total;
	}
	

}

