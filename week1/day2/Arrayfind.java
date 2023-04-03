package week1.day2;

public class Arrayfind {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number =0;
         int [] arrayName = {1,5,7,8,9,0,4,5,2,3,11,21,32,5,23,67};
         for(int i=0;i<arrayName.length;i++) {
        	if (arrayName[i]==5) {
        		number= number+1;
        	}
         }
     	System.out.println(number); 
	}

}
