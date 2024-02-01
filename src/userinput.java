import java.util.*;
import java.util.Scanner;
class UserInput{

	public static void main(String args[]){
	
		System.out.println("Enter First Value" );
		
		Scanner sc = new Scanner(System.in);
		
		int value1 = sc.nextInt() ;
		System.out.println("You entered First Value Is :- "+value1);
		System.out.println("------------------------------------------");
		
		
		System.out.println("Enter Second Value" );
		int value2 = sc.nextInt() ;
		System.out.println("You entered Second Value Is :- "+value2);
		System.out.println("------------------------------------------");
		
		calculations obj = new calculations();
		
		obj.addition(value1,value2);
		obj.substrsction(value1,value2);
		obj.multiplication(value1,value2);
		obj.division(value1,value2);
	
	}
}
