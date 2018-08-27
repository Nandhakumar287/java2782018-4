import java.io.*;
import java.util.*;

    public class Array_Median{
      public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
        int temp=0,Min_value;
        System.out.println("Enter array Size");
        int Array_Size=sc.nextInt();
        int Array_value[]=new int[Array_Size];
        System.out.println("Enter array value:");
          for(int i=0;i<Array_Size;i++)
          {
            Array_value[i]=sc.nextInt();
          }
         System.out.print("Minimum Element is---> ");
          for(int i=0;i<Array_Size;i++)
          {
            temp=temp+Array_value[i];
          }
          Min_value=(temp/Array_Size);
          System.out.print(Min_value);
        }
      }  
          
          
        
