/**
 * JavaLoopII
 */
import java.util.*;
import java.io.*;

public class JavaLoopII {

  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    int t=in.nextInt();
    for(int i=0;i<t;i++){
        int a = in.nextInt();
        int b = in.nextInt();
        int n = in.nextInt(); 
        
        System.out.println(a);
        System.out.println(b);
        System.out.println(n);
    }
    in.close();
    
  }
}