/**
 *  Generates and prints random integers in the range [0,10),
 *  as long as they form a non-decreasing sequence.
 */
public class InOrder {
	public static void main (String[] args) {
	int num1 = (int) (10 * Math.random ());
	int num2 = 0;
	String str1 = "" ;
	do {
		num2 = num1;
		str1 += num2 + " ";
		num1 = (int) (10 * Math.random ());
	}while(num2<= num1);
	System.out.println (str1);
	}
}
