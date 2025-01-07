import java.util.*;
public class decreasingcode{
    public static void main(String[] args) throws Exception {
      Scanner scn = new Scanner(System.in);
      System.out.print("Enter number:");
      int n =scn.nextInt();
      printdecreasing(n); 
    }
    public static void printdecreasing(int n){
        if(n==0) return;
        System.out.println(n);
        printdecreasing(n-1);
    }
}