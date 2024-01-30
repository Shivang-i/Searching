import java.util.*;
class BinarySearch
{
    public static void main(String[] args)throws Exception
     {
        int a[]=new int[10];
        int size,i,start,end,mid,val,pos=-1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        size=sc.nextInt();
        System.out.println("Enter the elements in sorted manner:");
        for(i=0;i<size;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Enter the element for search:");
        val=sc.nextInt();
        start=0;
        end=size-1;
    
        while(start<=end)
        {
    


            mid=(start+end)/2;

            if(val==a[mid])
            {
                pos=mid+1;
                break;
            }
            if(val<a[mid])
            {
                end=mid-1;
            }
            if(val>a[mid])
            {
                start=mid+1;
            }
        }
        if(pos>-1)
        {
            System.out.println("Element found at "+pos+" position");
        }
        else
        {
            System.out.println("Element doesnt found!!!");
        }
    }
}