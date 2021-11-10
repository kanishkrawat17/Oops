import java.io.*;
import java.util.*;

public class Main {

  static int count ;
  public static void main(String[] args) throws Exception {
    // using recursion
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int arr[] = new int[n];

    count = 0;

    for (int i = 0 ; i < n ; i++) {
      arr[i] = scn.nextInt();
    }

    int target = scn.nextInt();
    noOfways(arr, 0, 0, target);
    System.out.print("COUNT is"+count);
    scn.close();
  }

  public static void noOfways(int arr[], int ans, int i, int target) {
  
        
     if (i == arr.length ) {
      if (ans == target) {
        count++;
      }
      return;
    }
    else if(ans ==  target){
        count++;
    }
    

    noOfways(arr, ans + arr[i], i + 1, target);
    noOfways(arr, ans + 0, i + 1, target);
    
    
  }
}