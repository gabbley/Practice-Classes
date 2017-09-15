
import java.util.Arrays;

public class LargeInteger {
	
	public static void main(String[] args) {
		
		int[] test1 =  new int[] {1,5,3,9};
		int[] test2 = new int[] {0, 4, 5, 3};
		
		System.out.println(Arrays.toString(add(test1, test2)));
	}

	public static int[] add(int[] a, int[] b) {
		int sum;
		int[] total = new int[a.length];

		for (int i = a.length-1; i>0; i--) {
			sum = a[i] + b[i];
			int count = 2;
			if(sum>10) {
				total[a.length-count+1] = sum%10;
				a[a.length-count] += sum/10;
				count++;
			}
			else {
				total[i] = sum;
			}
		
		}
		return total;
	}

}

