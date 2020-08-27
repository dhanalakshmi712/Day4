import java.util.Scanner;
public class Namenotfound {
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		String name[]= {"chennaiSuperkings","DeccanDaredevils","Kings XI Punjab","kolkata knight riders","Mumbai indians","Rajasthan royals","Royal challenges Banglore"};
		System.out.println("Enter the expected winner team of IPL season 4");
        String expec_name=s.nextLine();	
		System.out.println("expec_name");
		System.out.println("Enter the expected runner team of IPL season 4");
        String run_name=s.nextLine();	
		System.out.println("run_name");
		try {
		 for(int i=0;i<=name.length;i++)
		 {
			 if(name[i]==expec_name)
			 {
				 System.out.println("Expected IPL season 4 winner:"+expec_name);
			 }
		 }
		 
		}
		catch(Exception e)
		{
			System.out.println("TeamNameFoundException:Entered team is not a part of IPL season");
		}
		

	
	}

}
