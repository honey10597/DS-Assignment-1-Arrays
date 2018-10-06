//package q5_reverse;

import java.util.*;

public class q5_reverse {
   public static int[] reverse(int ar[])
   {
       int i=0,j=ar.length-1;
       for(i=0;i<ar.length;i++)
       {
           if(j>i && j!=i)
           {
               int t=ar[i];
               ar[i]=ar[j];
               ar[j]=t;
               j--;
           }
       }
       return ar;
   }
   public static void display(int ar[])
   {
       for(int i=0;i<ar.length;i++)
       {
           System.out.print(ar[i]+" ");
       }
   }
    public static void main(String args[]) {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter size");
       int size=sc.nextInt();
       int ar[]=new int[size];
        int i=0;
        System.out.println("enter elements");
        for(i=0;i<size;i++)
        {
            ar[i]=sc.nextInt();
        }
        System.out.println("elements before reverse");
        display(ar);
        ar=reverse(ar);
        System.out.println("\nelements after reverse");
        display(ar);
}
}
