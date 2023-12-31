/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get one command-line argument: an int value
 * 	that determines how many families to simulate.
 */
public class OneOfEachStats1 {
	public static void main (String[] args) {
		int T = Integer.parseInt(args[0]);
		int cnt2 = 0;
		int cnt3 = 0;
		int cnt4 = 0;
		double sum = 0;
		String common = "";
		for(int i=0; i<T; i++){
			double gender = 0.0;
			boolean isboy = false ;
			boolean isgirl= false;
			int cnt =0;
			String str1 = "";
			while ( (isboy == false) || (isgirl == false)){ 
				cnt++;
				sum++;
				gender = Math.random ();
			if ( gender < 0.5){
				str1 += "g ";
				isgirl = true;
			}else if (gender >= 0.5 ) {
				str1 += "b ";
				isboy = true;
			}
			}
			if (cnt == 2){
			cnt2++;}
			else if (cnt == 3){
			cnt3++;}
			else {cnt4++;
			}
			
			if (cnt2 >= cnt3 && cnt2 >= cnt4){
			common = "2";}
			else if (cnt3 >= cnt4 && cnt3 >= cnt2){
			common = "3";}
			else /*if (cnt4 > cnt2)*/{
			common = "4 or more";}
		
		}
			sum = sum / T;
			System.out.println ( "Average: " + sum + " children to get at least one of each gender.");
			System.out.println ( "Number of families with 2 children: " + cnt2);
			System.out.println ( "Number of families with 3 children: " + cnt3);
			System.out.println ( "Number of families with 4 or more children: " + cnt4);
			System.out.println ( "The most common number of children is " + common+ ".");	
	}
}
