import java.lang.Math;

public class Test {

  public static void main(String[] args) {
    int q = 2, a = 0, b = 2 , n = 10;
    
    //print q number of lines

    for (int i = 1; i <=q ; i++) {
      nQry(n,a,b);
      System.out.println("number of lines");
    }
    //System.out.println("test");
    
    //System.out.println(q+" "+a+" "+b+" "+n+" ");
    
  }
  static void nQry(int n,int a, int b) {

    for (int i = 0; i < n ; i++) {
      int ans = (a+(i* (b*b)));
      //int result = a + (int) Math.pow(2, 0) * b;
    //  System.out.print(a+(1*b)+ans*i);
    System.out.println(ans);
      // a+i*b 
      //System.out.print(a+(i*b)+" ");
     // int s = a+i;
      
    }
    System.out.println(" ");
  }

  
}
