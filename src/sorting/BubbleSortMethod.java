package sorting;
import java.util.*;
public class BubbleSortMethod {

	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int a2[]=new int[n];
        for(int i=0;i<n;i++)
        {   
        	
        	a[i]=sc.nextInt();
        	
        }
        a2=bubblesort(a,n);
        for(int p=0;p<n;p++)
        {
        	System.out.println(a2[p]);
        }
        
	}

	public static int[] bubblesort(int[] a, int n)
	{
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
		return a;
		
	}
		
		/*public static int[] bubblesort(int[] z, int n)
		{
			for(int x=0;x<n-1;x++)
	        {
	        	for(int y=0;y<n-x-1;y++)
	        	{
	        		if(z[y]>z[y+1])
	        		{
	        			int temp=a[y];
	            		z[y]=z[y+1];
	            		z[y+1]=temp;
	        		}
	        		
	        	}
	        }
			return a;
	}  */

}
