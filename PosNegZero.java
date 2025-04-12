/*
 * Check Whether a Number is Positive, Negative, or Zero
 */

 import java.util.Scanner;
 public class PosNegZero {
     public static void main(String[] args){
         Scanner scanner = new Scanner(System.in);
         
         int n = scanner.nextInt();
         if(n>0){
             System.out.println("The number is positive");
         }else if(n<0){
             System.out.println("The number is negative");
         }else{
             System.out.println("The number is zero");
         }
     }
 }
/*
 * 
-2
The number is negative
 */