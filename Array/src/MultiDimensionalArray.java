import java.util.*;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//  Initialization of 2D array
        int arr[][]=new int[3][3];  // giving size of rows is manditory but giving the size of columns is not manditory
//  or we can simply declare the 2D array
        int nums[][]={{1,2,3}, //0th index
                      {4,5,6}, //1st index
                      {7,8,9}}; //2nd index   ->nums[2]={7,8,9}
//  NOTE : array.length function always return the length of row not columns
//      Taking input of 2D array
        for (int row=0;row<arr.length;row++){ // loop for number for rows
            // for each column in every row
            for (int col=0;col<arr[row].length;col++){
                arr[row][col]=sc.nextInt();
            }
        }

        // Output  Method 1 (Using normal method)
        for (int row=0;row<arr.length;row++){ // loop for number for rows
            // for each column in every row
            for (int col=0;col<arr[row].length;col++){   // arr[row].length is used when the column is not of fix size like {{1,2,3},{4,5},{6,7,8,9}}
                System.out.print(arr[row][col]+" ");
            }
            System.out.println();
        }


        //Output Method 2   (using array class)
        for (int row=0;row<arr.length;row++){
            System.out.println(Arrays.toString(arr[row]));
        }

        //Output method 3    (Using for each loop)
        for (int[]a:arr){
            System.out.println(Arrays.toString(a));
        }












    }
}
