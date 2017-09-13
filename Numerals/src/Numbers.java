import java.util.Scanner;

/**
 * 
 */

/**
 * @author baniquedg
 *
 */
public class Numbers {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter 2 numbers:");
		
		int x = keyboard.nextInt();
		int y = keyboard.nextInt();
		System.out.printf("SUM: " + sum(x,y) + "\n" +
				"DIFFERENCE: "+ diff(x,y) + "\n" +
				"PRODUCT: "+ prod(x,y) +  "\n" +
				"QUOTIENT: " + quot(x,y) + "\n" +
				"MODULUS: "+ mod(x,y)
				);
		keyboard.close();
		
	}
	
	public static double sum(int x, int y){
		return x+y;
	}
	
	public static double diff(int x, int y){
		return x-y;
	}
	
	public static double prod(int x, int y){
		return x*y;
	}
	
	public static double quot(int x, int y){
		return x/y;
	}
	
	public static double mod(int x, int y){
		return x%y;
	}
	

}
