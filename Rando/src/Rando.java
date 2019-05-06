import java.util.Scanner;

public class Rando 
{
	public Rando()
	{
		random();
	}
	
	public static void main( String[] args )
	{
		new Rando();
	}
	
	/**
	 * I swear to you that high is not inclusive, no no!
	 * The priests have said on high that high is not to be included in the range!
	* u silly goose, preiests arent real 	 
	*/
	public void random()
	{
		Scanner scan = new Scanner( System.in );
		int low = scan.next();
		int high = scan.next();
		System.out.println( Math.random() * high) + low );
	}
}
