/**
 *  Gets a command-line argument (int), and chekcs if the given number is perfect.
 */
public class Perfect {
	public static void main (String[] args) {
		int num = Integer.parseInt(args[0]);
		int sum = 1;
		String str1 = " = 1";
		for (int i=2; i<num; i++){
			if (num % i ==0){
				sum += i; 
				str1 += " + " + i ; 
			}
		}
		if (num == sum)
			System.out.println (num + " is a perfect number since " + num + str1);
		else {
		System.out.println (num + " is not a perfect number"); }
	}
}
