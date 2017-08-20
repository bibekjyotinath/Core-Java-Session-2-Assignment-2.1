import java.util.Scanner; //importing Scanner Class to take input from user

public class Largest {

	public static void main(String[] args) {
		
		int num1, num2, num3;    //Declaration of variables
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 1st number: "); //Taking 1st input from user
		num1 = sc.nextInt();
		
		System.out.println("Enter 2nd number: ");  //Take 2nd input from user
		num2 = sc.nextInt();
		
		System.out.println("Enter 3rd number: ");  //Take 3rd input from user
		num3 = sc.nextInt();
		
		sc.close();   //closing the scanner class
		
		if(num1 > num2 && num1 > num3) //Condition to check if num1 is largest
		{
			System.out.println(num1+ " is largest");
		}
		else if(num2 > num1 && num2 > num3) //Condition to check if num2 is largest
		{
			System.out.println(num2+ " is largest");
		}
		else
		{
			System.out.println(num3+" is largest"); //prints num3 largest if above both condition fails
		}
	}
}
