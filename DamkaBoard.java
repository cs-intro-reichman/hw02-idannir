/**
 *  Gets a command-line argument n (int), and prints an n-by-n damka board.
 */
public class DamkaBoard {
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		String str1 = "";
		for (int i=0; i<n; i++) {
			str1 += "* ";
		}
		for(int j=0; j<n; j++) {
			if (j%2==0)
			System.out.println (str1);
			else 
			System.out.println ( " " + str1);
		}
	}
}
