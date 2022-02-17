import java.util.*;
class polindrome{
	public static void main(String args[])
	{
		int ans=0,n,n1,r;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n");
		n=sc.nextInt();
		while(n>0)
		{
			r=n%10;
			ans=ans+r;
			n=n/10;
		}
		
			
			System.out.println("Some of digit");
			System.out.println(ans);
			
	}	
}