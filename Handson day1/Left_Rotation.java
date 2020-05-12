import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

     void leftRotate(int a[], int d, int n) 
    { 
        for (int i = 0; i < d; i++) 
            leftRotatebyOne(a, n); 
    } 
  
    void leftRotatebyOne(int a[], int n) 
    { 
        int i, temp; 
        temp = a[0]; 
        for (i = 0; i < n - 1; i++) 
            a[i] = a[i + 1]; 
        a[i] = temp; 
    } 
  
  
    void printArray(int arr[], int n) 
    { 
        for (int i = 0; i < n; i++) 
            System.out.print(arr[i] + " "); 
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] nd = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nd[0]);

        int d = Integer.parseInt(nd[1]);

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        scanner.close();
        Solution s= new Solution();
        s.leftRotate(a,d,n);
        s.printArray(a,n);
    }
}
