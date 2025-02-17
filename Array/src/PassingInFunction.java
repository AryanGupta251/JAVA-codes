import java.util.Arrays;

public class PassingInFunction {
    public static void main(String[] args) {
        int nums[]={3,4,5,12};
        System.out.println("Before updation"+Arrays.toString(nums));
        change(nums);
        System.out.println("After updation"+Arrays.toString(nums));
    }

// NOTE = strings are immutable in java and arrays are mutable in java



    static void change(int[] arr){
        arr[0]=99;
    }
}
