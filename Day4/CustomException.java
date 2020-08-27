import java.lang.*;
class CustomException extends Exception{
private	int a;
CustomException(int age)
{
	a=age;
}
public String toString()
{
	return "InvalidRangeException";
}
}
public class Sample
{
	static void demo(String name,int age)throws CustomException{
		System.out.println("Player details");
		if(age<19)
		{
			throw new CustomException(age);
			System.out.println("Player Name:"+name);
			System.out.println("Player age:"+age);
		}
	}

	public static void main(String args[])
	{  
		try {
	
		demo("Albie Morkel",35);
		demo("Ishan Kishan",16);
		
	}
		catch(CustomException e)
		{
			System.out.println(e);
		}
	}
}
