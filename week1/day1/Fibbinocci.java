package week1.day1;

public class Fibbinocci {
	public static void main(String[] args) {
		int n=11;
		int firstNum=0;
		int secondNum=1;
	    int sum;
	
		for(int i=1;i<=n;i++) {
			System.out.println(firstNum);
		 sum = firstNum+secondNum;
			firstNum=secondNum;
			secondNum=sum;
			
		}
	}

}
