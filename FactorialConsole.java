import java.util.Scanner;
public class FactorialConsole {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = scanner.nextInt();
        long fact =1;
        for(int i=1;i<=num;i++){
            fact*=i;
        }
        System.out.println("Factorial :  " +fact);
        
    }
}

/*
 * 
Enter the number: 4
Factorial :  24
 */