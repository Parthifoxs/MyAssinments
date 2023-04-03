package week1.day1;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int n=3;
         boolean prime=true;
         
    
         for (int i=2;i<n;i=i+1) {
        	 if (n%i==0) {
        		 System.out.println("It is not prime");
        		 prime = false;
        		 break;
        	  
        	 }
        	 if(prime==true) {
        		 System.out.println("The number is prime");
        		 break;
        		 
        	 }
         }
	}

}
