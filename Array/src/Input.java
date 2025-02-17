import java.util.Arrays;
import java.util.Scanner;   // package for Scanner class

public class Input {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
//      Taking array an input form the user
      /*  int [] arr=new int[5];
        System.out.println("Take the elements of array as input : ");
        for(int i=0;i<arr.length;i++){  //for loop
            arr[i]=sc.nextInt();
        }
       */
        /*  //method 1
        System.out.println("Printing the input array");
        for (int i=0;i<arr.length;i++){  // for loop
            System.out.print(arr[i]+" ");
        }
        */
        /* //method 2
        System.out.println("\nPrinting the input array using for each loop ");
        for(int num:arr){
            System.out.print(num+" ");  //here num represents the element of an array
        }
*/
       /* //method 3 (using array class)
        System.out.println(Arrays.toString(arr));   // simplest and best way to print the array
        */

//        using array of objects
        String str[]=new String[4];
        for (int i=0;i<str.length;i++){
            str[i]=sc.next();
        }
        System.out.print("Array before updation : "+Arrays.toString(str)+" ");

//        modify the perticular index value
        str[2]="Aryan";


        System.out.print("\nArray after updation : "+Arrays.toString(str)+" ");

    }
}
