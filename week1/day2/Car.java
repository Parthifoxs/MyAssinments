package week1.day2;

public class Car {
	
	public void brandName() {
		System.out.println("Suzuki");
	}
	public int getReg() {	
		return 1234;
	}
	public boolean checkpunture() {
		return true;
		}
	public int threeNmber(int a,int b,int c) {
		int d = a*b*c;
		return d;
	}
	public String getModel() {
		return "Swift";
	}


public static void main(String[] args) {
	Car obj=new Car();
	obj.brandName();
	int reg= obj.getReg();
	System.out.println(reg);
	boolean checkpunture1=obj.checkpunture();
	System.out.println(checkpunture1);
	String modeling = obj.getModel();
	System.out.println(modeling);
	int number =obj.threeNmber(2,4,7);
	System.out.println(number);
}
	
}

        
        

                                              
	



