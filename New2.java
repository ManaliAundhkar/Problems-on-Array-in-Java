//3. Write Java program which accept two arrays from user and display odd contents of each array.

//Input : 
//2 9 6 5 2 3
//45 6 12 18 23 4

//Output : 
//9 5 3
//45 23

import java.util.*;

class Arrays
{
	public void Display(int Arr[],int Brr[])
	{
		int i=0;
		for(i=0;i<Arr.length;i++)
		{
			if((Arr[i]%2)!=0)
			{
				System.out.print(Arr[i]+"\t");
			}
			
		}
		
		System.out.println();
		
		for(i=0;i<Brr.length;i++)
		{
			if((Brr[i]%2)!=0)
			{
				System.out.print(Brr[i]+"\t");
			}
			
		}
	}
}
class New2
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter the no. of elements of 1st Array ");
		int iSize1=sobj.nextInt();
		
		int Arr[]=new int[iSize1];//malloc
		
		System.out.println("Enter the elements in 1st array");
		for(int i=0;i<iSize1;i++)
		{
			Arr[i]=sobj.nextInt();
		}
		
		System.out.println("Enter the no. of elements of 2nd Array ");
		int iSize2=sobj.nextInt();
		
		int Brr[]=new int[iSize2];//malloc
	
		
		System.out.println("Enter the elements in 2nd array");
		for(int i=0;i<iSize2;i++)
		{
			Brr[i]=sobj.nextInt();
		}
		
		Arrays mobj=new Arrays();
	
		mobj.Display(Arr,Brr);
		
	}
}







