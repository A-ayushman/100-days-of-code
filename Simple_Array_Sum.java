import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class MyClass {
    public static void main(String args[]) 
    {
      Scanner in = new Scanner(System.in);
      int n ;
      n = in.nextInt(); 
      int[] arr;
      arr = new int[n];
      for(int i=0;i<n;i++)
      {
          arr[i]= in.nextInt();
      }
      int sum = 0;
      for(int i=0;i<n;i++)
      {
          sum= sum+arr[i];
      }
      System.out.println(sum);
    }
}
