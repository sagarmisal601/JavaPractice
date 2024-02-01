import java.util.Scanner; 
class Arithmetic_Operators
{
   public static void main(String args[])
   {   
		
        Scanner s = new Scanner(System.in);
        System.out.println("");
        System.out.println("Enter the two numbers to perform Addition ");
        int a = s.nextInt();
        int b = s.nextInt();
		int add;
        add = a + b;
        System.out.println("Addition of Two Numbers : "+add);
		System.out.println("------------------------------------------------");
			
        System.out.println("Enter the two numbers to perform Substraction ");
		int c = s.nextInt();
        int d = s.nextInt();
        int sub;
        sub = c - d;
        System.out.println("Subtraction of Two Numbers : "+sub);
		System.out.println("------------------------------------------------");
			
        System.out.println("Enter the two numbers to perform Multiplication ");
		int e = s.nextInt();
        int f = s.nextInt();			
		int mul;
        mul = e * f;
        System.out.println("Multiplication of Two Numbers  : "+mul);
		System.out.println("-------------------------------------------------");	
			
        System.out.println("Enter the two numbers to perform Division ");
		int g = s.nextInt();
        int h = s.nextInt();
		float div;
        div = (float) g / h;
        System.out.print("Division of Two Numbers  : "+div);
		System.out.println("\n"+"------------------------------------------------");
    }
}