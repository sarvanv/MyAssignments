package armsstrongassignment;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int as=153;
		int c=0,r,o=as;
		while(as>0)
		{
			r=as%10;
			as=as/10;
			c=c+(r*r*r);
			
		}
		if(c==o)
		{
			System.out.println("Given number is armstrong");
		}
		else
		{
			System.out.println("Given number is not an armstrong");
		}

	}

}
