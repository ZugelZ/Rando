import java.util.*;

public class Practice {

	public void main(String[] args)
	{
		Scanner scan = new Scanner(System.out);
		System.out.println(Enter an age to see if you can vote);
		age = scan.nextInt();
		if(age < 18)
		{
			System.out.println("You can vote in "  (18 - age)  "year(s)");
		}
		else
		{
			System.out.println("You can vote!")
		}
	}
}
