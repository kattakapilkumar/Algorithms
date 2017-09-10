package sorting;

import java.util.Scanner;

public class InsertionSortTemp
{

	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		Scanner kapil = new Scanner(System.in);		
		int n=kapil.nextInt();
		int ka[]=new int[n];		
		for(int t=0;t<n;t++)
		{
			ka[t]=kapil.nextInt();
		}
		int presentindex=0;   
		int minindex=0;
		for(int i=0;i<n-1;i++)
		{
			presentindex=0;
			minindex=i+1;
			if(ka[presentindex] > ka[minindex])
			{
				while(minindex!=presentindex)
				{		
					System.out.println("we found some elements to swap");
					System.out.println("swap between elements"+ka[presentindex]+" and "+ka[minindex]);
					int temp = ka[minindex-1];
					ka[minindex-1] = ka[minindex];
					ka[minindex]=temp;
					minindex= minindex-1;
				}
				//System.out.println("elements are swaped between presentindex and minindex");
				//for(int tp=minindex;tp>0;tp--)
				//{
				//	System.out.println("");
					
			//	}
			}
			
		}
		
		
		
		
		
		for(int p=0;p<n;p++)
		{
			System.out.println(ka[p]);
		}
		
		
		
		
		
		
	}

}
