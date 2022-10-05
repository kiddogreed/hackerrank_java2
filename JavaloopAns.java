/**
 * JavaloopAns
 */

import java.util.*;
import java.lang.Math;

public class JavaloopAns {
  public static void main(String[] args) {
    
    int q = 2, a = 0, b = 2 , n = 10;

    for (int i = 0; i < q; i++) {
      int result = a + (int) Math.pow(2, 0) * b;
      System.out.print(result + " ");

      for(int j=1; j<n; j++){
        result += (int) Math.pow(2, j) * b;
        System.out.print(result + " ");
    }
    System.out.println();
}

    }
  }
  
