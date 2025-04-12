/*
 * Write a Java program that takes two integers as input and prints the greater number.
 */

 import java.util.Scanner;
 public class GreatofTwoInt {
     public static void main(String[] args){
         Scanner scanner = new Scanner(System.in);
         
         int a = scanner.nextInt();
         int b = scanner.nextInt();
         
         if(a>b){
             System.out.println("A is greater");
         }else if(b>a){
             System.out.println("B is greater");
         }else{
             System.out.println("Both are equal");
         }
     }
 }

 /*
  * 
2
1
A is greater
  */