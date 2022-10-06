/**
 * Test2
 */
import java.lang.Math;;
public class Test2 {

  public static void main(String[] args) {
    
  int queryNum=2 ,firstNum = 0 , secondNum = 2, maxNum = 10;

  for (int i=0; i<queryNum; i++){
    int res = firstNum + (int) Math.pow(2, 0) * secondNum;
    System.out.print(res + " ");

    for(int j=1; j<maxNum; j++){
      res += (int) Math.pow(2, j)*secondNum;
      System.out.print(res + " " ); 
    }

    System.out.println();
  }

    
  }


}