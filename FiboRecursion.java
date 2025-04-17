public class FiboRecursion {
    public static int Fibo(int number ){
        if(number == 0)
            return 0;
        if(number == 1)
            return 1;
        return Fibo(number - 1)+Fibo(number - 2);
    }
    public static void main(String[]args){
        int count =6;
        System.out.println("Fibonnaci Series: ");
        for(int i =0;i<count;i++){
            System.out.print(Fibo(i)+" ");
        }
    }
}

/*
 *
Fibonnaci Series: 
0 1 1 2 3 5
 */
