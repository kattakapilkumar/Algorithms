package sorting;

import java.util.*;

public class SelectionSort 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		@SuppressWarnings("resource")
		Scanner kapil=new Scanner(System.in);
		int n=kapil.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=kapil.nextInt();
		}
		
		//int sindex=0;
		for(int i=0;i<n-1;i++)
		{
			int index=i;
			for(int j=i+1;j<n;j++)
			{
				if(a[index]>a[j])
				{
					index = j;
				}					
			}
		  int lowestNumber = a[index];   
            a[index] = a[i];  
            a[i] = lowestNumber;  
			
		}				
		for(int p=0;p<n;p++)
		{
			System.out.println(a[p]);
		}
		
		
		
	}

}
