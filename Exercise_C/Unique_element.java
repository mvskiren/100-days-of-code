

import java.util.*;
import java.lang.*;
import java.io.*;


class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner sc=new Scanner(System.in);
	int[] arr = new int[] { 2,4,4,56,2,8,8};
	int[] arr1=new int[20];
	int count=0;
	
	for(int i=0;i<arr.length-1;i++)
	{
	    count =0;
	    for( int j=0;j<arr.length-1;j++ )
	    {
	        if( arr[i]==arr[j+1] )
	        {
	          count++;
	        }
	    }
	        if(count==1)
	          {
	             arr1[i]=arr[i];
	          }
	    
	}
	 Arrays.sort(arr1); 
	 System.out.println( arr1[arr1.length-1] );
		
}
}
