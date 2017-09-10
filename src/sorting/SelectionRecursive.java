package sorting;

import java.util.*;
public class SelectionRecursive 
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
		
		selectionsort(a,n,0);
		
		
		
		
		
		
	}

	
	
	static int minIndex(int[] a,int i,int j)
	{
		
		if(i == j)
		{
			return i;
		}
		
		int k = minIndex(a, i + 1, j);
	          
        return (a[i] < a[k])? i : k;
			
		
	}
	
	
	public static void selectionsort(int[] a, int n, int index) 
	{
		if(index == n)
			return;
		
		int k = minIndex(a,index,n-1);
		
		
		
		
		
		
		selectionsort(a,n,index+1);
		
	}

}
