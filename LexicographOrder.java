import java.util.Scanner;

/**
 * LexicographOrder
 */
public class LexicographOrder {

  

  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);  
    
    System.out.println("add lexicograph words:");
    String words = sc.nextLine();
    int numberLimit = sc.nextInt();
    System.out.println("add lexicograph limit");
    System.out.println(getSmallestAndLargest(words, numberLimit));
    




  }

  public static String  getSmallestAndLargest(String s, int k) {

    String smallest = "";
    String largest = "";
    largest = s.substring(0,k);
    smallest = s.substring(0, k);


    for (int i = 0; i < s.length()-k; i++) {

      if(largest.compareTo(s.substring(i,k+i))<0)
      largest=s.substring(i,k+i);
      
      if(smallest.compareTo(s.substring(i,k+i))>0)
      smallest=s.substring(i,k+i);

    }


    
    return smallest + "\n" + largest;
  }
}