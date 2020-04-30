//Write a java program which accept two arrays from user and return difference between summation of arrays.

//Input : 
//2 9 7 5 2 3
//9 3 5 5

//Output : 6

import java.util.*;

class Arrays
{
	public int Diff(int Arr[],int Brr[])
	{
		int i=0,iSum=0,iSum1=0;
		for(i=0;i<Arr.length;i++)
		{
			iSum=iSum+Arr[i];
		}
		
		System.out.println();
		
		for(i=0;i<Brr.length;i++)
		{
			iSum1=iSum1+Brr[i];
		}
		return (iSum-iSum1);
	}
}

class New
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
	
		int iRet=mobj.Diff(Arr,Brr);
		
		System.out.println("The difference is :"+iRet);
		
	}
}







