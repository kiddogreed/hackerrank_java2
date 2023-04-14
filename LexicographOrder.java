import java.util.Scanner;

/**
 * LexicographOrder
 */
public class LexicographOrder {

  

  public static void main(String[] args) {
    
    // Scanner sc = new Scanner(System.in);  
    
    // System.out.println("add lexicograph words:");
    // String words = sc.nextLine();
    // int numberLimit = sc.nextInt();
    // System.out.println("add lexicograph limit");
    // System.out.println(getSmallestAndLargest(words, numberLimit));


    String ss = "welcometojava";
    int kk = 3;

    System.out.println(ss.substring(0,kk));
    




  }

  public static String  getSmallestAndLargest(String s, int k) {
    String smallest = "";
    String largest = "";
    
    smallest = s.substring(0,k);
    largest = s.substring(0,k);
    
for(int i=1;i<s.length()-k+1;i++){
    if(smallest.compareTo(s.substring(i,i+k)) > 0 )
        smallest=s.substring(i,i+k);
    if(largest.compareTo(s.substring(i,i+k)) < 0 )     
        largest=s.substring(i,i+k);
}


    
    return smallest + "\n" + largest;
  }
}