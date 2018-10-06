//package q4_wave;

import java.util.*;

public class q4_wave_print {
   
    public static void main(String args[]) {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter row and col size");
       int row=sc.nextInt();
       int col=sc.nextInt();
       int ar[][]=new int[row][col];
       
        int i=0,j=0;
        System.out.println("enter elements");
        for(i=0;i<row;i++)
        {
            for(j=0;j<col;j++)
            {
                ar[i][j]=sc.nextInt();
                // System.out.print(ar[i][j]+" ");
            }
        }
       
       
       int k=0;
      int w[]=new int[row*col];
        for(i=0;i<row;i++)
        {
            if(i%2==0)
            {
                for(j=0;j<col;j++)
                {
                    w[k]=ar[i][j];
                    k++;
                }
            }
            else
            {
                for(j=col-1;j>=0;j--)
                {
                    w[k]=ar[i][j];
                    k++;
                }
            }
        }
       
    //
        for(i=0;i<w.length;i++)
        {
            System.out.print(w[i]+" ");
        }
    }
   
}
