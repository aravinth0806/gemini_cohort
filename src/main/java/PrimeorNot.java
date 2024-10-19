
public class PrimeorNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=59;
		
		if(n<=1)
		{
			System.out.println("Given number is not a Prime number");
		}
		else if(!(n%2==0 || n%3==0))
		{
			System.out.println("Given number is a Prime number");
		}
		else if (n==2 || n==3)
		{
			System.out.println("Given number is a prime number");
		}
		else {
			System.out.println("Given number is not a Prime number");
		}

	}

}
