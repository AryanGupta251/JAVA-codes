public class SmallestNumber {
    public static int smallest(int arr[]){
        int max = Integer.MAX_VALUE;
        for(int i=0;i< arr.length;i++){
            if(arr[i]<max){
                max=arr[i];
            }
        } return max;
    }


    public static void main(String[] args) {
        int arry[]={3,5,2,1,7,9,10,4};
        int min=smallest(arry);
        System.out.println("The smallest number is : "+min);
    }

}

