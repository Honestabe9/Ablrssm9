import java.io.*;
import java.util.*;

public class NonNegLargeIntSummer
{
   public static void main (String[] argABEL) 
   {
      int z = 0;    //Main comparative variable for most cases/instances//
      
      Scanner input = new Scanner(System.in);
      
      System.out.println("Enter a numerical value... ");   
      String X = input.nextLine(); 
                                                                      //Two large integer inputs//
      System.out.println("\nEnter another numerical value... ");
      String Y = input.nextLine();
      
      int X1 = X.length();
      int Y1 = Y.length();
      
      if(X1 >= Y1)
      {
         z = X1;
      }
      
      else if(Y1 > X1)
      {
         z = Y1;
      }
      
      int DataVal1[] = new int[z];                           //Read-in for array-usage//
      int DataVal2[] = new int[z];
      
      int ans[] = new int[z];
      
      String FirstNum[] = new String[z];
      String SecondNum[] = new String[z];
      
      int One = Integer.parseInt(X);
      int Two = Integer.parseInt(Y);
   
      if(X.length() > Y.length())     
      {
         int d = X.length() - Y.length();
         
         for(int i = 0; i < d; i++)
         {
            Y = "0" + Y;
         }
      }
                                                   //Accounting for leading/significant zeroes as placeholders//
      else if(X.length() < Y.length())
      {
         int d = Y.length() - X.length();
         
         for(int i = 0; i < d; i++)
         {
            X = "0" + X;
         }
      }
                                                //Necessary for loops for string manipulations//
                                                //Also included as the constant varabile//
      for(int u = 0; u < z; u++)     
      {
         FirstNum[u] = X.substring(u, u+1);
      }
      
      for(int u = 0; u < z; u++) 
      {
         SecondNum[u] = Y.substring(u, u+1);
      }
   
      for(int s = 0; s < z; s++)        
      {
         int t = Integer.parseInt(FirstNum[s]);
         DataVal1[s] = t;
      }
   
      for(int s = 0; s < z; s++)
      {
         int t = Integer.parseInt(SecondNum[s]);
         DataVal2[s] = t;
      }
   
      for(int u = 0; u < z; u++)        
      {
         ans[u] = 0;
      }
      
      System.out.println("");
         
      for(int u = z - 1; u > -1; u--)     
      {
         ans[u] = DataVal1[u] + DataVal2[u];
         
         if(ans[u] >= 10)       
         {
            if(u > 0)
            {
               if(DataVal1.length > DataVal2.length)     
               {
                  DataVal1[u - 1] = DataVal1[u - 1] + (ans[u] / 10);
               }
               
               if(DataVal2.length > DataVal1.length)
               {
                  DataVal2[u - 1] = DataVal2[u - 1] + (ans[u] / 10);   
               }
               
               else
               {
                  DataVal1[u - 1] = DataVal1[u - 1] + (ans[u] / 10); 
               }
            
               ans[u] = ans[u] % 10;
            }
            
            else if(u == 0)
            {
               ans[u] = ans[u];
            }
         }
      }
      
      for(int s = 0; s < z; s++)        
      {
         System.out.print(DataVal1[s] + " ");
      }
                                         //Printing results of the summation of the two 'large' nonnegative integers//
      System.out.println("");         
   
      for(int s = 0; s < z; s++)
      {
         System.out.print(DataVal2[s] + " ");
      }
   
      System.out.println("");
   
      for(int u = 0; u < z; u++)
      {
         System.out.print(ans[u] + " ");
      }
   }
}
