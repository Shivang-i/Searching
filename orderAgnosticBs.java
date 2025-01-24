
import java.util.Scanner;

public class orderAgnosticBs {
    public static void main(String[] args)throws Exception {
        int arr[]=new int[10];
    int target;
    int size;
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the size");
    size=sc.nextInt();
    System.out.println("Enter Array");
    for(int i=0;i<size;i++)
    {
        arr[i]=sc.nextInt();
    }
    System.out.println("Enter the target:");
    target=sc.nextInt();
    int p=search(arr,target,size);
    if(p==-1)
    System.out.println("NOT FOUND!!");
    else
    System.out.println("Element present at "+(p+1)+" position.");
    }

    static int search(int arr[],int target,int size)
    {
        int s=0;
        int l=size-1;
        
        boolean isAsc=arr[s]<=arr[l];
        while(s<=l)
        {
            int mid= s+(l-s)/2;
            if(arr[mid]==target)
            return mid;
            if(isAsc)
            {
                if(target<arr[mid])
                l=mid-1;
                if(target>arr[mid])
                s=mid+1;
            }
            else{
                if(target>arr[mid])
                l=mid-1;
                if(target<arr[mid])
                s=mid+1;
            }
        }
        return -1;
    }
}
