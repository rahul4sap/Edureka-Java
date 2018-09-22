// In Java we write our programs in classes

public class DataTypes {
	
	//main is a method (is a way or a procedure) where instructions written in it, gets executed sequentially
	public static void main(String[] args) {
		
		byte age = 20;
		
		age = 30;
		
		System.out.println("age is: "+age);
		
		//byte johnsAge = 20,30; //error
		
		byte  b = 10; //8  bits
		short s = 10; //16 bits
		int   i = 10; //32 bits
		long  l = 10; //64 bits
		
		float  f = 3.14f;  // 32 bits
		double d = 100.33; // 64 bits 
		
		// char ch = 'A';
		// char ch = 65; //ASCII Code for Character A
		// char ch = '\u20b9'; //Unicode for Indian Rupee
		char ch = '\u0905';
		System.out.println("ch is: " +ch);
		
		boolean flag = true; //1 bit 
		flag = false;
		
		System.out.println("flag is: "+flag);
	}

}
