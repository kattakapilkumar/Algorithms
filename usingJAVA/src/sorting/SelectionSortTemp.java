package sorting;


import java.util.*;
public class SelectionSortTemp 
{

	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		Scanner kapil=new Scanner(System.in);
		int n = kapil.nextInt();		
		int[] a=new int[n];		
		for(int i=0;i<n;i++)
		{
			a[i]=kapil.nextInt();						
		}		
		//System.out.println(a.getClass());
		System.out.println("array length:" + (a.length));
		int temp =0;
		for(int i=0;i<n;i++)
		{
			System.out.println(a[0]);
			System.out.println(a[i+1]);			
			if((a[0])  > (a[i+1]))
			{
				temp = a[i+1];
			}			
			a[0]=temp;
			a[i+1]=a[0];				
			System.out.print(temp+" "+(a[i+1])+" "+(a[0]));
			System.out.println();
		}				
	}
	
	/*int findmin(int[] a)
	{ 
		
		int min =0;
		int n= a.length;   
		int temp=0;
		//only length not length();  with parenthesis
		for(int i=0;i<n-1;i++)
		{
			if(a[i]<a[i+1])
			{
				temp=a[i];
			}						
		}
		return min;
		
	}*/
	

}
