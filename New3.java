//Write Java program which accept two arrays from user and form new array which is combination of contents of first and second array.

//Input : 
//12 57 28 3
//99 23 54 58 6 67

//Output : 
//12 57 28 3 99 23 54 58 6 67

import java.util.*;
import java.util.Arrays;

class Arrays1
{
	public int[] Display(int Arr[],int iSize1,int Brr[],int iSize2)
	{
		int i=0,j=0,k=0;
	
		int iSize3=(iSize1+iSize2);
		int Crr[]=new int[iSize3];//malloc
		
		for(i=0;i<Arr.length;i++,k++)
		{
			Crr[k]=Arr[i];
		}
			
		System.out.println();
		
		for(j=0;j<Brr.length;j++,k++)
		{
			Crr[k]=Brr[j];
		}
	
		return Crr;
	}
}
class New3
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
	
		Arrays1 mobj=new Arrays1();
	
		int Crr[]=mobj.Display(Arr,iSize1,Brr,iSize2);
		
		System.out.println(Arrays.toString(Crr));
		
	}
}







