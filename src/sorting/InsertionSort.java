package sorting;

import java.util.Scanner;

public class InsertionSort 
{

	public static void main(String[] args) 
	{
		Scanner kapil = new Scanner(System.in);
		int n=kapil.nextInt();
		int[] ka=new int[n];
		for(int c=0;c<n;c++)
		{
			ka[c]=kapil.nextInt();
		}
		int presentindex,minindex;
		for( minindex=1;minindex < n;minindex++)
		{
			int presentMINindexvalue = ka[minindex];
			presentindex=minindex-1;
			
			//presentindex = startingindex 
			//traverse upto starting index
			while(presentindex>= 0 && ka[presentindex] > presentMINindexvalue)
			{
				ka[presentindex+1]=ka[presentindex];
				presentindex=presentindex-1;
				//here the presentindex will move to -1
			}
			//here we are taking it as the 0 which is starting index
			ka[presentindex+1] = presentMINindexvalue;						
		}		
		for(int p=0;p<n;p++)
		{
			System.out.println(ka[p]);
		}		
	}

}
