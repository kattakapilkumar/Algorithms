package sorting;
import java.util.*;
public class BubbleSortRecursive
{

	static void bubblesort(int arr[], int n)
    {      
        if (n == 1)
            return;
      
        
        for (int i=0; i<n-1; i++)
            if (arr[i] > arr[i+1])
            {
                
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        bubblesort(arr, n-1);
    }	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        //int a2[]=new int[n];
        for(int i=0;i<n;i++)
        {   
        	
        	a[i]=sc.nextInt();
        	
        }
        bubblesort(a,n);
        for(int p=0;p<n;p++)
        {
        	System.out.println(a[p]);
        }
	}

}
