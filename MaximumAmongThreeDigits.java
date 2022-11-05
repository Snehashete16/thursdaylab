package basicprogram;

import java.util.Scanner;

public class MaximumAmongThreeDigits {
	
public Static void main(String[]args) {
	int num1,num2,num3;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter three numbers");
	num1=sc.nextInt(); //20
	num2=sc.nextInt(); //50
	num3=sc.nextInt(); //30

	if(num1>num2)//external 20>
	{
		if(num1>num3)//internal
		{
			System.out.println(num1+"is greater");
		}
		else //internal else
		{
			System.out.printlm(num3+"is greater");
	
		}
	}//external if
	else//external else
	{
		if(num2>num3)//internal if
		{
			System.out.println(num2+"is greater");
		}
		else//internal else
		{
			System.out.println(num3+"is greater");
		}
	}
		}
	}
