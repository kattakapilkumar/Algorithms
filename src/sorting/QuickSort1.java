package sorting;

import java.util.*;
public class QuickSort1 
{	
	void quicksort(int[] a,int start,int end) 
	{
		
		
		
	}
	public static int  partition(int[] a,int start,int end)
	{
		int pivot = a[start];
		int up=a[start];
		int down = a[end];
		do 
		{
			while(a[up] >= pivot)
			{
				up = up +1;
			}
			while(a[down] < pivot)
			{
				down = down -1;
			}
			if(up < down)
			{
				interchange(a,up,down);
			}
		}
		while(up >= down);		
		return down;				
	}
	
	public static void interchange(int[] a,int up,int down)
	{
		down  = a[up];
		a[up] = a[down];
		a[down] = down;
	}
	public static void main(String[] args) 
	{		
		Scanner sc=new Scanner(System.in);	
		int n=sc.nextInt();
		int a[]=new int[n];
		int start =  0;
		int end   =  0;
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}		
		int j = partition(a,start,end);
		
		quicksort(a,start,end);
		
				
	}
}
