public class LargestNumber {


    public static int largest(int arr[]){
        int min = Integer.MIN_VALUE;
        for(int i=0;i< arr.length;i++){
            if(arr[i]>min){
                min=arr[i];
            }
        } return min;
    }


    public static void main(String[] args) {
        int arry[]={3,5,2,1,7,9,10,4};
        int max=largest(arry);
        System.out.println("The largest number is : "+max);
    }

}
