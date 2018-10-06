// package q1_max_in_array;
import java.util.*;
public class q1_max {
public static int find_max(int a[],int max)
{
	int j;
	for(j=0;j<a.length;j++)
	{
		if(a[j]>max)
		{
			max=a[j];
		}
	}
	return max;
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n");
		int n=sc.nextInt();
		int a[]=new int[n];
		int i=0;
		System.out.println("enter elements");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		
		int m=-999;
		int max=find_max(a,m);
		System.out.println(max);
		sc.close();
	}

}
