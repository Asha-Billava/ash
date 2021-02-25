import java.io.*;
import java.lang.*;
class ULcase
{
	public static void main(String args[])throws IOException
	{
		char ch;
		System.out.println("enter the character:");
		ch=in.readline(); 
		if(ch>='A' && ch<='Z')
		{
			System.out.println("it is an UpperCase character");
		}
		else if(ch>='a' && ch<='z')
		{
			System.out.println("it is an LowerCase character");
		}
		else
		{
			System.out.println("it is not an alphabet");
		}
	}
}