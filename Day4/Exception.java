import java.util.Scanner;
public class Exception {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int over=Integer.parseInt(sc.nextLine());
		System.out.println("Enter the number of overs:"+over);
	
		int runs[]=new int[over];
		System.out.println("Enter the number of over for each runs");
		for(int i=0;i<over;i++)
		{
			runs[i]=sc.nextInt();
		}
		System.out.println("Enter the over number");
		int num=sc.nextInt();

		
         try {
			if(num>0&num<over)
			{
				System.out.println("Runs scored in this over:"+runs[num]);
			}
		}
		catch(NegativeArraySizeException ne)
		{
			System.out.println(ne);
		}
		catch(ArrayIndexOutOfBoundsException a)
		{
			System.out.println(a);
	}
}
     
	}

