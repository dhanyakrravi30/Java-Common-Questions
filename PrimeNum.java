import java.util.Scanner;
public class PrimeNum {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a number:  ");
        int num = scanner.nextInt();
        
        if(isPrime(num)){
            System. out.println("It is a prime number.");
        }else{
            System.out.println("It is not a prime number.");
        }
    }
    public static boolean isPrime(int num){
        for(int i=2; i<num/2; i++){
            if(num% i ==0){
                return false;
            }          
        }
        return true;
    }
}

/*
 * 
Enter a number: 
9
It is not a prime
 */