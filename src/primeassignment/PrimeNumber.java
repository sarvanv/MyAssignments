package primeassignment;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int ip=13;
       boolean b=false;
       for(int i=2;i<=ip-1;i++)
       {
    	   int c=ip%i;
    	   if(c==0)
    	   {
    		   b=true;
    		   break;
    	   }
       }
       if(b==true)
       {
    	   System.out.println("The given number is not a prime number");
       }
       else
       {
    	   System.out.println("The given number is prime");
       }

	}

}
