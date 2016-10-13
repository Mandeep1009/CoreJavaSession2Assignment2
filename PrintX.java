//Write a program to print the “X” pattern:

class PrintX
{
	public static void main(String[] args)
	{
		for (int i = 1; i <= 5; i++)
        	{
            		for (int j = 1; j <= 5; j++)
            		{
                		if((i == j) || (i + j == 6)) 
					{
                    			System.out.print("* ");
                    			continue;
                			}
                	System.out.print("  ");
            		}
            	System.out.println();
        	}
	}
}