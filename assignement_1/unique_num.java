import java.util.*;
class Unique_num
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
        HashMap<Integer,Integer> hm=new HashMap<>();
        int found=0;
		for(int i=0;i<n;i++)
		{
			hm.put(arr[i],i);
		}
        for(Map.Entry m : hm.entrySet()){    
            System.out.print(m.getKey()+" ");    
           }  
    }
}