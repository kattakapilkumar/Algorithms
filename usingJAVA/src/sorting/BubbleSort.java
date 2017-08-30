package sorting;


import java.util.*;
public class BubbleSort 
{

	public static void main(String[] args) 
	{
		
        @SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {   
        	
        	a[i]=sc.nextInt();
        	
        }
        
        for(int x=0;x<n-1;x++)
        {
        	for(int y=0;y<n-x-1;y++)
        	{
        		if(a[y]>a[y+1])
        		{
        			int temp=a[y];
            		a[y]=a[y+1];
            		a[y+1]=temp;
        		}
        		
        	}
        }
        
        for(int p=0;p<n;p++)
        {
        	System.out.println(a[p]);
        }
        
	}

}
