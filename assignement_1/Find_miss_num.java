import java.util.*;
class Find_miss_num
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int  tot= arr.length;
        int max = arr[tot-1];
        int[] tot_array = new int[max];
        
        // Mark all the numbers in the array as present
        for (int i = 0; i < tot; i++) {
            tot_array[arr[i]-1] = 1;
        }
        
        // Find the missing numbers
        for (int j = 0; j < max; j++) {
            if (tot_array[j] == 0) {
                System.out.print((j+1) + " ");
            }
        }
    }
}