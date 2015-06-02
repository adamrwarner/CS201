

public class Test{		    

	public static void main(String ar[])     

	{         

		displayPattern(10);     

	}           

	public static void displayPattern(int n)     

	{         

		for(int i=1;i<=n;i++)         

		{             

			for(int j=i;j>0;j--)             

			{                 

				System.out.print(" "+j);             

			}             

			System.out.println("\n");         

		}     

	}

}

