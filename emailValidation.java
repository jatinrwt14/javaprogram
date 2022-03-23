package javaProgram;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class emailValidation {
	public static void main(String[] args){
		
		String[] List = {"jatin@gmail.com", "sample.space@outlook.com", "john123@hotmail.com", "same.sope@yahoo.com"};  //List of emails
		int flag=0;
		
		String pattern = "[A-Za-z0-9+_.-]+@[a-zA-z.]+";  //regular expression for email validation enter by user
		Pattern p=Pattern.compile(pattern);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter An Email: ");
		String input=sc.nextLine();			// taking input from user
		
		Matcher matcher= p.matcher(input);
	
		if(matcher.matches()==true)
		{
			for(int i=0;i<List.length;i++)    //iteration for checking array email
			{
				if(input.equals(List[i]))
				{
					System.out.println("Given Email is Valid and Present in array");
					flag=0;
					break;
				}
				flag=1;
			}
			if(flag==1)
			{
				System.out.println("Given Email is Valid but not Present in array");;
			}

		}
		else
		{
			System.out.println("Email enter By User is Not Valid..");
		}
		
	}
}
