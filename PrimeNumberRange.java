public class PrimeNumberRange {
    public static void main(String[]args){
        int start=10,end=30;
        for(int i=start;i<=end;i++){
            if(isPrime(i)){
                System.out.print(i + " ");
            }
        }
    }
        public static boolean isPrime(int num){
            if(num<=1)
                return false;
            for(int i =2;i<num/2;i++){
                if(num%i==0)
                    return false;
            }
            
            return true;
        
    }
}
//11 13 17 19 23 29