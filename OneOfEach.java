/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
public class OneOfEach {
	public static void main (String[] args) {
	double gender = 0.0;
	boolean isboy = false ;
	boolean isgirl= false;
	int cnt =0;
	String str1 = "";
	while ( (isboy == false) || (isgirl == false)){ 
		cnt++;
		gender = Math.random ();
	if ( gender < 0.5){
		str1 += "g ";
		isgirl = true;
		
	}else if (gender >= 0.5 ) {
		str1 += "b ";
		isboy = true;
	
	}
	}
	System.out.println (str1);
	System.out.println ( "you made it... and you now have " + cnt + " children.");
	}
}
