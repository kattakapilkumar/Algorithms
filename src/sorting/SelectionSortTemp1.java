package sorting;


import java.util.*;
public class SelectionSortTemp1
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
		boolean katta = false;		
		int temp=0;
		int midindex=0;
		for(int j=0;j<n-1;j++)
		{		
			katta = false;
			for(int k=j+1;k<n;k++)
			{
				System.out.println(a[j]);
				System.out.println(a[k]);
				//System.out.println("");
				
				if(a[j] > a[k])
				{
					System.out.print(a[j]+""+a[k]);
					System.out.println();
					temp=a[k];
					midindex=k;
					katta =true;
				}
				
			}	
			if(katta)
			{
				System.out.println(a[j]+""+a[midindex]+"   VALUES SHOULD BE SWAPED");
			}		
			System.out.println();
			System.out.println("Temp value is "+temp);
			System.out.println("swaped index is "+midindex);
			if(katta)
			{
			a[midindex]=a[j];
			a[j]=temp;
			}
			System.out.println("*******************");			
			for(int p=0;p<n;p++)
			{
				System.out.println(a[p]);
			}
			System.out.println("*******************");
		}
		
		
		
		
		
		//for(int p=0;p<n;p++)
		//{
	//		System.out.println(a[p]);
	//}
		
		
		
	}

}
