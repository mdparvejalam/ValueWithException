import java.util.Scanner;

class ValueWithException{


 public static void main(String[] args) {

    Scanner myob = new Scanner(System.in);
	System.out.println("enter any vlaue");

try{
		String value = myob.nextLine();
	System.out.println("your enter value is "+ value);
	int divid = 4/0; // it a exception for try catch
	}catch(Exception e){
		System.out.println(e);
	}


}


}