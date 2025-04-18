public class LargestElement {
    public static void main(String[]args){
        int[] arr={12,14,98,11,4};
        int max = arr[0];
        
        for(int i =1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("Largest Element:  " +max);
    }
}

//Largest Element:  98
