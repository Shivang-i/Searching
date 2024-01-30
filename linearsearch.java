//OBJECTIVE: TO APPLY LINEAR SEARCH IN AN ARRAY

// COMPLEXITY- O(n)

import java.io.*;
import java.util.Scanner;
class LinearSearch
{
    public static void main(String[] args)throws Exception {
        int a[]=new int [10];
        int size,ele,i,f =0,pos=-1;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the size of array");
        size=in.nextInt();
        System.out.println();
        System.out.println("Enter elements of array:");
        for(i=0;i<size;i++)
        {
            a[i]=in.nextInt();
        }
        System.out.println("\n Enter the element for searching");
        ele=in.nextInt();
        for(i=0;i<size;i++)
        {
            if(a[i]==ele)
            {
                f=1;
                pos=i+1;
                break;
        }
    }
    if(f==1)
    System.out.println("\nElement is present at "+pos+" position.");
    else
    System.out.println("Element is not present.");
}
}
